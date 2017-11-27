package com.lyt.designpatterns.composite.example2;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile {
    
    private String name;
    
    private List<IFile> children;
    
    public Folder(String name) {
        this.name = name;
        children = new ArrayList<>();
    }
    
    @Override
    public void display() {
        System.out.println(name);
    }
    
    @Override
    public List<IFile> getChildren() {
        return children;
    }
    
    @Override
    public boolean add(IFile file) {
        return children.add(file);
    }
    
    @Override
    public boolean remove(IFile file) {
        return children.remove(file);
    }
    
}
