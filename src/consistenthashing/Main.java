package consistenthashing;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<PhysicalNode> physicalNodes= getPhysicalNode();
        List<VirtualNode>virtualNodes=getVirtualNodes(physicalNodes);
        List<Request>requests=getRequests();
        HashRing hashRing=new HashRing();
        for(VirtualNode vn : virtualNodes){
            hashRing.addServer(vn);
        }
        for(Request request:requests){
            hashRing.routeRequest(request.getRequestKey());
        }

        hashRing.removeServer(physicalNodes.get(2),physicalNodes,virtualNodes);
    }
    public static List<PhysicalNode> getPhysicalNode(){
        List<PhysicalNode>physicalNodes=new ArrayList<>();
        for(int i=0;i<4;i++){
            String key ="physical_node"+(i+1);
            physicalNodes.add(new PhysicalNode(key,(1+1)*100,0,"Active",0));
        }
        return physicalNodes;
    }
    public static List<VirtualNode>getVirtualNodes(List<PhysicalNode>physicalNodes){
        List<VirtualNode>virtualNodes=new ArrayList<>();
        int totalVirtualNodes=physicalNodes.size()*2;
        int totalPhysicalNodeCapacity=physicalNodes.stream().mapToInt(PhysicalNode::getCapacity).sum();
        for (PhysicalNode pn :physicalNodes){
            double wtOfPn = (double) pn.getCapacity()/totalPhysicalNodeCapacity;
            int tvn=(int)Math.round(wtOfPn*totalVirtualNodes);
            String cn ="virtual_node_"+pn.getId();
            for(int i=0;i<tvn;i++){
                String vid =cn+(i+1);
                virtualNodes.add(new VirtualNode(vid,pn));
            }
            pn.setWeight(tvn);

        }
        return virtualNodes;
    }
    public static List<Request> getRequests(){
        List<Request>requests=new ArrayList<>();
        for(int i=0;i<15;i++){
            String key ="request_"+i;
            requests.add(new Request(key,"102:093:123:123","user_"+i));
        }
        return requests;
    }
}

