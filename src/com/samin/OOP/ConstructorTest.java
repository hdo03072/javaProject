package com.samin.OOP;

class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) {
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2(2);
    }
}

class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    Car(Car c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);

        System.out.println(c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println(c2.color + ", " + c2.gearType + ", " + c2.door);

        c1.door = 100;
        System.out.println(c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println(c2.color + ", " + c2.gearType + ", " + c2.door);
    }
}
