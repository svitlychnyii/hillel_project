package Lesson4;

public class Cylinder {
    //об'єм циліндра
    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    public static void main(String[] args) {
        double radius = 5.0;
        double height = 10.0;

        double volume = calculateCylinderVolume(radius, height);
        System.out.println("Об'єм циліндра с радіусом " + radius + " і висотою " + height + " = " + volume);
    }
}
