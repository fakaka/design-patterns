package com.lyt.designpatterns.composite.example2;

public class Test {
    
    public static void main(String[] args) {
        Folder rootFolder = new Folder("/");
        
        Folder beifengFolder = new Folder("/beifeng");
        
        File beifengFile = new File("beifeng.txt");
        
        rootFolder.add(beifengFolder);
        rootFolder.add(beifengFile);
        
        Folder ibeifengFolder = new Folder("/ibeifeng");
        File ibeifengFile = new File("ibeifeng.txt");
        beifengFolder.add(ibeifengFolder);
        beifengFolder.add(ibeifengFile);
        
        Folder iibeifengFolder = new Folder("/iibeifeng");
        File iibeifengFile = new File("iibeifeng.txt");
        ibeifengFolder.add(iibeifengFolder);
        ibeifengFolder.add(iibeifengFile);
        
        displayTree(rootFolder, 0);
        
    }
    
    public static void displayTree(IFile rootFolder, int deep) {
        print(deep);
        rootFolder.display();
        for (IFile file : rootFolder.getChildren()) {
            if (file instanceof File) {
                print(deep + 1);
                file.display();
            }
            else {
                displayTree(file, deep + 1);
            }
        }
    }
    
    private static void print(int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("└- ");
        }
    }
    
}
