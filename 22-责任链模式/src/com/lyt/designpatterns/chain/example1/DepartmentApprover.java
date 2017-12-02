package com.lyt.designpatterns.chain.example1;

public class DepartmentApprover extends Approver {
    
    public DepartmentApprover(String Name) {
        super(Name + " DepartmentLeader");
    }
    
    @Override
    public void ProcessRequest(PurchaseRequest request) {
        
        if ((request.getSum() >= 5000) && (request.getSum() < 10000)) {
            System.out.println("**This request " + request.getID() + " will be handled by " + this.Name + " **");
        }
        else {
            successor.ProcessRequest(request);
        }
        
    }
    
}
