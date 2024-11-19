package Decorator;

public class Runner {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new Milk(coffee);
        coffee = new Sugar(coffee);

        System.out.println(coffee.getDescription()); // Output: Simple Coffee, Milk, Sugar
        System.out.println(coffee.getCost()); // Output: 7.0
    }
}
