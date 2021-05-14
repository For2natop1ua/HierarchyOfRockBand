package main;

public abstract class Human {
    public abstract int getHairLength();

    public static void hairLength(Human human) {
        System.out.println("Hair Length is: " + human.getHairLength()+ "\"\n");
    }
}

