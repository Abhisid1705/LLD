package consistenthashing;

import consistenthashing.interfaces.Node;

public class PhysicalNode implements Node {
    private String id ;
    private int capacity;
    private int currentReqNum;
    private String status;

    private int weight;//total v nodes
    public PhysicalNode(String id , int capacity,int currentReqNum,String status,int weight){
        this.id=id;
        this.capacity=capacity;
        this.currentReqNum=currentReqNum;
        this.status=status;
        this.weight=weight;

    }


    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean isActive() {
        return this.status.equals("A");
    }

    @Override
    public void handleRequests() {

    }

    public PhysicalNode setId(String id) {
        this.id = id;
        return this;
    }

    public int getCapacity() {
        return capacity;
    }

    public PhysicalNode setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public int getCurrentReqNum() {
        return currentReqNum;
    }

    public PhysicalNode setCurrentReqNum(int currentReqNum) {
        this.currentReqNum = currentReqNum;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PhysicalNode setStatus(String status) {
        this.status = status;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public PhysicalNode setWeight(int weight) {
        this.weight = weight;
        return this;
    }
}
