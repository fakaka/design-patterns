package com.lyt.designpatterns.visitor.example3;

/**
 * 比如有一个公园，有一到多个不同的组成部分；  
 * 该公园存在多个访问者：清洁工A负责打扫公园的A部分，清洁工B负责打扫公园的B部分，公园的管理者负责检点各项事务是否完成，上级领导可以视察公园等等。  
 * 也就是说，对于同一个公园，不同的访问者有不同的行为操作，而且访问者的种类也可能需要根据时间的推移而变化（行为的扩展性）。  
 * 根据软件设计的开闭原则（对修改关闭，对扩展开放），我们怎么样实现这种需求呢？
 */
public class Test {
    
    public static void main(String[] args) {
        Park park = new Park();
        park.setName("古林公园");
        
        park.accept(new VisitorA());
        
        park.accept(new VisitorB());
        
        park.accept(new VisitorManager());
    }
}
