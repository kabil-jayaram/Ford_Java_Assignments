package Streams.Question10;

import java.util.*;

class CustomObject {
    private int id;
    private String name;

    public CustomObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CustomObject: " + "id=" + id + ", name='" + name;
    }
}

class CustomSorting {
    public static List<CustomObject> sortObjects(List<CustomObject> objects) {
        return objects.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).toList();
    }
}

public class Main {
    public static void main(String[] args) {
        CustomObject customObject1 = new CustomObject(101, "Laptop");
        CustomObject customObject2 = new CustomObject(102, "Drone");
        List<CustomObject> objects = Arrays.asList(customObject1, customObject2);
        List<CustomObject> sortedObjects = CustomSorting.sortObjects(objects);
        System.out.println("Sorted Objects: " + sortedObjects);
    }
}
