package etc;

public class HelloWorld {
    public static void main(String[] args) {
        Coffee latte = CoffeeRecipe.OrderCoffee("Latte");
        Coffee Americano = CoffeeRecipe.OrderCoffee("Americano");
        System.out.println("latte = " + latte);
        System.out.println("Americano = " + Americano);
    }
}
