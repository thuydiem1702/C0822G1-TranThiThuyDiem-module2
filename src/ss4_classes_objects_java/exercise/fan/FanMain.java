package ss4_classes_objects_java.exercise.fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setColor("Yellow");
        fan1.setRadius(10);
        fan1.setSpeed(fan1.FAST);
        fan1.setOn(true);
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setColor("Blue");
        fan2.setRadius(5);
        fan2.setSpeed(fan1.MEDIUM);
        fan2.setOn(false);
        System.out.println(fan2);
    }
}
