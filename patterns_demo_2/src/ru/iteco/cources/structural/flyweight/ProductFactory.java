package ru.iteco.cources.structural.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductFactory {
    private static Map<String, Size> sizeMap = new HashMap<>();
    private static Map<String, Color> colorMap = new HashMap<>();

    static {
        sizeMap.put("s", new Size(28, "S"));
        sizeMap.put("M", new Size(32, "M"));
        sizeMap.put("XL", new Size(36, "XL"));
        sizeMap.put("XXL", new Size(40, "XXL"));
        sizeMap.put("XXXL", new Size(42, "XXXL"));

        colorMap.put("red", new Color(111, "Red"));
        colorMap.put("green", new Color(222, "Green"));
        colorMap.put("blue", new Color(333, "Blue"));
    }

    public static Product createProduct(String sizeName, String colorName, String name) {
        return new Product(name, sizeMap.get(sizeName), colorMap.get(colorName));
    }
}
