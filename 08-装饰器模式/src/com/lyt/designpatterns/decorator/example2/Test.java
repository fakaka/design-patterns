package com.lyt.designpatterns.decorator.example2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    
    public static void main(String[] args) {
        int c;
        InputStream in = null;
        try {
            in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
                
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                in.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }
}
