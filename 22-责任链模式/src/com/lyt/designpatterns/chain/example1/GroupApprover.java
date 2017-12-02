package com.lyt.designpatterns.chain.example1;

public class GroupApprover extends Approver {
    
    public GroupApprover(String Name) {
        super(Name + " GroupLeader");
    }
    
    @Override
    public void ProcessRequest(PurchaseRequest request) {
        
        if (request.getSum() < 5000) {
            System.out.println("**This request " + request.getID() + " will be handled by " + this.Name + " **");
        }
        else {
            successor.ProcessRequest(request);
        }
        
    }
    
}
