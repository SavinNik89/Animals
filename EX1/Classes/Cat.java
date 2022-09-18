package Classes;

import java.util.Random;

public class Cat extends Animal{
    private int speed;
    private int distanсeToCalling;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.speed = 5;
        Random random = new Random();
        this.distanсeToCalling = random.nextInt(10, 25);
    }

    public int getSpeed() {
        return speed;
    }

    public int getDistanсeToCalling() {
        return distanсeToCalling;
    }

    public void setDistanсeToCalling(int distanсeToCalling) {
        this.distanсeToCalling = distanсeToCalling;
    }

    @Override
    public String toString() {
        return  "Cat" + ':' + ' ' +
                getName() + ',' + ' ' +
                getColor() + ',' + ' ' +
                "free" + ',' + ' ' +
                "distantion:" + ' ' + getDistanсeToCalling();
    }
}
