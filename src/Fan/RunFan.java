package Fan;

public class RunFan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private double radius = 5;
    private String color = "blue";
    private boolean on = true;

    private int getSpeed() {
        return speed;
    }
    private void setSpeed(int speed) {
        this.speed = speed;
    }

    private double getRadius() {
        return radius;
    }
    private void setRadius(double radius){
        this.radius = radius;
    }

    private String getColor() {
        return color;
    }
    private void setColor(String color) {
        this.color = color;
    }

    private boolean isOn() {
        return on;
    }

    private void setOn(boolean on){
        this.on = on;
    }

    public String toString() {
        if (this.on){
            return "Fan{" + " speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", Fan is on " +
                    '}';
        } else {
            return "Fan{" + " speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", Fan is off " +
                    '}';
        }
    }
    public static void main(String[] args) {
        RunFan fan1 = new RunFan();
        RunFan fan2 = new RunFan();

        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("green");
        fan1.setOn(true);
        System.out.println(fan1);

        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("black");
        fan2.setOn(false);
        System.out.println(fan2);
    }
}


