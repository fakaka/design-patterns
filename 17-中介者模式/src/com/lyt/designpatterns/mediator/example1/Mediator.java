package com.lyt.designpatterns.mediator.example1;

public class Mediator {
    
    private Man man;
    
    private Woman woman;
    
    public void setMan(Man man) {
        this.man = man;
    }
    
    public void setWoman(Woman woman) {
        this.woman = woman;
    }
    
    public void getPartner(Person person) {
        if (person instanceof Man) {
            setMan((Man) person);
        }
        else {
            setWoman((Woman) person);
        }
        if (man == null || woman == null) {
            System.out.println("我不是同性恋!");
            return;
        }
        if (man.getCondition() == woman.getCondition()) {
            System.out.println(man.getName() + "和" + woman.getName() + "绝配");
        }
        else {
            System.out.println(man.getName() + "和" + woman.getName() + "不般配");
        }
    }
    
}
