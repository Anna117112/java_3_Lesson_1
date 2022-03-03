package task3;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange = new Orange();
        Box <Apple>appleBox = new Box<>(apple1,apple2);
        Box<Orange> orangeBox = new Box<>(orange);
        Box<Apple> appleBox1 = new Box<>(apple3);
        System.out.println(appleBox.getWeight());
        System.out.println( orangeBox.compare(appleBox));
        appleBox.addBox(apple3);
        System.out.println(appleBox.getWeight());
        appleBox.shift(appleBox1);



       appleBox.getWeight();
        System.out.println(appleBox.getWeight());
    }
}
