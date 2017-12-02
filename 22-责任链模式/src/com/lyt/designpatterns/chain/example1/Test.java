package com.lyt.designpatterns.chain.example1;

public class Test {
    
    public static void main(String[] args) {
        
        Approver groupLeader = new GroupApprover("Tom");
        Approver departmentLeader = new DepartmentApprover("Jerry");
        Approver vicePresident = new VicePresidentApprover("Kate");
        Approver president = new PresidentApprover("Bush");
        
        groupLeader.SetSuccessor(vicePresident);
        departmentLeader.SetSuccessor(president);
        vicePresident.SetSuccessor(departmentLeader);
        president.SetSuccessor(groupLeader);
        
        groupLeader.ProcessRequest(new PurchaseRequest(1, 100, 40));
        groupLeader.ProcessRequest(new PurchaseRequest(2, 200, 40));
        groupLeader.ProcessRequest(new PurchaseRequest(3, 300, 40));
        groupLeader.ProcessRequest(new PurchaseRequest(4, 400, 140));
        
    }
    
}
