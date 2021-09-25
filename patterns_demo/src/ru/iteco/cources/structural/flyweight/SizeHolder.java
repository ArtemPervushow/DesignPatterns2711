package ru.iteco.cources.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SizeHolder {
    private static Map<String, Size> sizeMap = new HashMap<>();
    static {
        sizeMap.put("Seuro", new Size("S", true));
        sizeMap.put("S", new Size("S", false));
        sizeMap.put("Meuro", new Size("M", true));
        sizeMap.put("M", new Size("S", false));
        sizeMap.put("XLeuro", new Size("XL", true));
        sizeMap.put("XL", new Size("XL", false));
    }

    public static Size getByName(String name){
        return sizeMap.get(name);
    }
}
