package com.lyt.designpatterns.srp.example2;

public class DAOImpl {
    
    public void save(String username, String upassword) {
        System.out.println("将 " + username + " 保存到了数据库");
        System.out.println("将 " + upassword + " 保存到了数据库");
    }
    
}
