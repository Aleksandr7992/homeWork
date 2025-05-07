package week_5;

interface Coffee {
    String getDescription();
}

class BlackCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Чёрный кофе";
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription();
    }
}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", молоко";
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", сахар";
    }
}

public class Decorator {
    public static void main(String[] args) {
        Coffee coffee = new BlackCoffee();
        System.out.println(coffee.getDescription());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription());
    }
}
