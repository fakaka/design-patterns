package com.lyt.designpattens.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 缓存式
 * 
 * @author MJ
 *
 */
public class Singleton7 {
    
    private static Map<String, Singleton7> map = new HashMap<>();
    
    private Singleton7() {}
    
    public static Singleton7 getInstance() {
        Singleton7 instance = map.get("KEY");
        if (instance == null) {
            instance = new Singleton7();
            map.put("KEY", instance);
        }
        return instance;
    }
}
