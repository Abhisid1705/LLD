package consistenthashing;

import java.util.List;
import java.util.TreeMap;

public class HashRing {
    private TreeMap<Integer,VirtualNode>ring;
    public HashRing(){
        this.ring=new TreeMap<>();
    }
    public void addServer(VirtualNode vn){
        String vid =vn.getId();
        int wt=vn.getPhysicalNode().getWeight();
        for(int i=0;i<wt;i++){
         String key =vid+"_"+i;
         int hash =HashUtils.hash(key);
         int position=hash%Integer.MAX_VALUE;

         ring.put(position,vn);
        }
    }
    public  void removeServer(PhysicalNode pn, List<PhysicalNode> physicalNodeList,List<VirtualNode>vns){
        int tvn = pn.getWeight();
        List<VirtualNode> vn = vns.stream().filter(v -> v.getPhysicalNode() == pn).toList();
        VirtualNode v=vn.get(0);
        for(int i=0;i<tvn;i++){
            String key = v.getId()+"_"+v.getPhysicalNode().getId()+(i+1);
            int pos=HashUtils.hash(key);
            ring.remove(pos);
        }
        pn.setWeight(0);
        for(VirtualNode von:vn){
            vns.remove(von);
        }
        physicalNodeList.remove(pn);

    }
    public void routeRequest(String requestKey){
      int requestHash = HashUtils.hash(requestKey)%Integer.MAX_VALUE;
      System.out.println(requestHash);
      int nearestPosition = ring.ceilingKey(requestHash)==null ?ring.firstKey():ring.ceilingKey(requestHash);
        System.out.println("Request with key -> "+requestKey+" is assigned to "+ring.get(nearestPosition).getId());
        ring.get(nearestPosition);
    }
}
