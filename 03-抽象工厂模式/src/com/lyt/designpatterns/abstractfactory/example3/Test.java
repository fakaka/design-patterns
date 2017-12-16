package com.lyt.designpatterns.abstractfactory.example3;

public class Test {
    
    public static void main(String[] args) throws Exception {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Train train = (Train) factory.getBean("train");
        train.run();
    }
    
}
