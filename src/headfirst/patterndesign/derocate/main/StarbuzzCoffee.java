package headfirst.patterndesign.derocate.main;

import headfirst.patterndesign.derocate.Beverage;
import headfirst.patterndesign.derocate.DarkRoast;
import headfirst.patterndesign.derocate.Espresso;
import headfirst.patterndesign.derocate.decorator.Mocha;

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
