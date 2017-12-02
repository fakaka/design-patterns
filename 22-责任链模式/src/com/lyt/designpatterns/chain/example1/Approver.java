package com.lyt.designpatterns.chain.example1;

public abstract class Approver {
    
    Approver successor;
    
    String Name;
    
    public Approver(String Name) {
        this.Name = Name;
    }
    
    public abstract void ProcessRequest(PurchaseRequest request);
    
    public void SetSuccessor(Approver successor) {
        this.successor = successor;
    }
}
