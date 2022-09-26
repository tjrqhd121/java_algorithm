package etc;

import java.util.HashMap;
import java.util.Map;

//공장을 위한 기계 틀
public abstract class Coffee {
    public abstract int getPrice();
    public abstract String getType();

    @Override
    public String toString() {
        return "Hi this Coffee is "+ this.getType()+ " and price " + this.getPrice();
    }
}

//팩토리 공장
class CoffeeFactory{
    public static Coffee getCoffee(String type,int price){
        if("Latte".equalsIgnoreCase(type)) return new Latte(type,price);
        else if("Americano".equalsIgnoreCase(type)) return new Americano(type,price);
        else {
            return new DefaultCoffee(type,price);
        }
    }
}

//if else 문이 없는 구현(MAP 방식)
class CoffeeRecipe {
    private static Map<String, Coffee> recipe = new HashMap<>();
    static {
        recipe.put("Latte",new Latte("Latte",5500));
        recipe.put("Americano",new Latte("Americano",4500));
        recipe.put("DefaultCoffee",new Latte("DefaultCoffee",3500));
    }

    public static Coffee OrderCoffee(String order) {
        return recipe.get(order);
    }
}

//공장 레시피들
class DefaultCoffee extends Coffee{
    private int price;
    private String type;
    public DefaultCoffee(String type ,int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Latte extends Coffee{
    private int price;
    private String type;
    public Latte(String type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Americano extends Coffee{
    private int price;
    private String type;
    public Americano(String type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

