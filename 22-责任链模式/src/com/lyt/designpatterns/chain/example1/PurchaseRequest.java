package com.lyt.designpatterns.chain.example1;

public class PurchaseRequest {
    
    private int Type = 0;
    
    private int Number = 0;
    
    private float Price = 0;
    
    public PurchaseRequest(int Type, int Number, float Price) {
        this.Type = Type;
        this.Number = Number;
        this.Price = Price;
    }
    
    public int getType() {
        return Type;
    }
    
    public float getSum() {
        return Number * Price;
    }
    
    public int getID() {
        return (int) (Math.random() * 1000);
    }
}
