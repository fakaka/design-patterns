package com.lyt.designpattens.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 多实例缓存
 * 
 * @author MJ
 *
 */
public class Singleton8 {
    
    private static Map<String, Singleton8> map = new HashMap<>();
    
    private static final int MAX = 3;
    
    private static int idx = 0;
    
    private Singleton8() {}
    
    public static Singleton8 getInstance() {
        Singleton8 instance = map.get("KEY" + idx);
        if (instance == null) {
            instance = new Singleton8();
            map.put("KEY" + idx, instance);
        }
        idx = (idx + 1) % MAX;
        return instance;
    }
}
