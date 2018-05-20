package head.first.pattern.derocate.main;

import head.first.pattern.derocate.Beverage;
import head.first.pattern.derocate.DarkRoast;
import head.first.pattern.derocate.Espresso;
import head.first.pattern.derocate.decorator.Mocha;

public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        printBeverage(beverage);

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        printBeverage(beverage1);
    }

    private static void printBeverage(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
