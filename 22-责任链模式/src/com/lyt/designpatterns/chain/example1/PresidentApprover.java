package com.lyt.designpatterns.chain.example1;

import com.lyt.designpatterns.chain.example1.Approver;
import com.lyt.designpatterns.chain.example1.PurchaseRequest;

public class PresidentApprover extends Approver {
    
    public PresidentApprover(String Name) {
        super(Name + " President");
    }
    
    @Override
    public void ProcessRequest(PurchaseRequest request) {
        if (50000 <= request.getSum()) {
            System.out.println("**This request " + request.getID() + " will be handled by " + this.Name + " **");
        }
        else {
            successor.ProcessRequest(request);
        }
    }
    
}
