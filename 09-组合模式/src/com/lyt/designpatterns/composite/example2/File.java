package com.lyt.designpatterns.composite.example2;

import java.util.List;

public class File implements IFile {
    
    private String name;
    
    public File(String name) {
        this.name = name;
    }
    
    @Override
    public void display() {
        System.out.println(name);
    }
    
    @Override
    public List<IFile> getChildren() {
        return null;
    }
    
    @Override
    public boolean add(IFile file) {
        return false;
    }
    
    @Override
    public boolean remove(IFile file) {
        return false;
    }
    
}
