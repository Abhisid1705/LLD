package consistenthashing;

import consistenthashing.interfaces.Node;

public class VirtualNode implements Node {
    private String id;
    private PhysicalNode physicalNode;

    public VirtualNode(String id , PhysicalNode physicalNode){
       this.id=id;
       this.physicalNode=physicalNode;


    }
    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean isActive() {
        return this.physicalNode.isActive();
    }

    @Override
    public void handleRequests() {
        this.physicalNode.handleRequests();
    }

    public VirtualNode setId(String id) {
        this.id = id;
        return this;
    }

    public PhysicalNode getPhysicalNode() {
        return physicalNode;
    }

    public VirtualNode setPhysicalNode(PhysicalNode physicalNode) {
        this.physicalNode = physicalNode;
        return this;
    }
}
