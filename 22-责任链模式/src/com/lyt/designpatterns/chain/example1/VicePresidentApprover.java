package com.lyt.designpatterns.chain.example1;

public class VicePresidentApprover extends Approver {
    
    public VicePresidentApprover(String Name) {
        super(Name + " Vice President");
    }
    
    @Override
    public void ProcessRequest(PurchaseRequest request) {
        if ((request.getSum() >= 10000) && (request.getSum() < 50000)) {
            System.out.println("**This request " + request.getID() + " will be handled by " + this.Name + " **");
        }
        else {
            successor.ProcessRequest(request);
        }
    }
    
}
