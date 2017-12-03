package com.lyt.designpatterns.mediator.example3;

public class Market implements Department {
    
    private Mediator mediator;  // 持有中介者(总经理)的引用
    
    public Market(Mediator m) {
        super();
        this.mediator = m;
        m.register("market", this);
    }
    
    @Override
    public void outAction() {
        System.out.println("汇报工作！项目承接的进度，需要资金支持！");
        
        mediator.command("finacial");
    }
    
    @Override
    public void selfAction() {
        System.out.println("跑去接项目！");
    }
    
}
