package Classes;

import java.util.Random;

public class Dog extends Animal {
    private int speed;
    private int distanсeToCalling;
    private boolean sit;
    private boolean down;
    private boolean stay;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        speed = 10;
        Random random = new Random();
        this.distanсeToCalling = random.nextInt(10, 25);
        this.sit = false;
        this.stay = false;
        this.down = false;
    }

    public int getDistanсeToCalling() {
        return distanсeToCalling;
    }

    public boolean isSit() {
        return sit;
    }

    public boolean isDown() {
        return down;
    }

    public boolean isStay() {
        return stay;
    }

    public int getSpeed() {
        return speed;
    }

    public void setDistanсeToCalling(int distanсeToCalling) {
        this.distanсeToCalling = distanсeToCalling;
    }

    public void setSit(boolean sit) {
        this.sit = sit;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setStay(boolean stay) {
        this.stay = stay;
    }

    @Override
    public String toString() {
        String condition = "free";
        if (sit) { condition = "sit";}
        if (stay) { condition = "stay";}
        if (down) { condition = "down";}
        return  "Dog" + ':' + ' ' +
                getName() + ',' + ' ' +
                getColor() + ',' + ' ' +
                condition + ',' + ' ' +
                "distantion:" + ' ' + getDistanсeToCalling();
    }
}
