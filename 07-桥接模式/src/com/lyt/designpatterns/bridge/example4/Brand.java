package com.lyt.designpatterns.bridge.example4;

public interface Brand {
    
    void sale();
}

class Lenovo implements Brand {
    
    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
    
}

class Dell implements Brand {
    
    @Override
    public void sale() {
        System.out.println("销售戴尔电脑");
    }
    
}

class Shenzhou implements Brand {
    
    @Override
    public void sale() {
        System.out.println("销售神舟电脑");
    }
    
}
