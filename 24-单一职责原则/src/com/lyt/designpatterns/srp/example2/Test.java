package com.lyt.designpatterns.srp.example2;

public class Test {
    
    public static void main(String[] args) {
        Input input = new Input();
        input.shuru();
        Validator validator = new Validator();
        if (validator.validate(input.getUsername(), input.getUpassword())) {
            DBManager.getConnection();
            DAOImpl dao = new DAOImpl();
            dao.save(input.getUsername(), input.getUpassword());
        }
    }
    
}
