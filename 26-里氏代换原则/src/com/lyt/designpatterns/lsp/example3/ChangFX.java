package com.lyt.designpatterns.lsp.example3;

public class ChangFX implements Sibianxing {
    
    private long width;
    
    private long height;
    
    @Override
    public long getWidth() {
        return width;
    }
    
    public void setWidth(long width) {
        this.width = width;
    }
    
    @Override
    public long getHeight() {
        return height;
    }
    
    public void setHeight(long height) {
        this.height = height;
    }
    
}
