package java.advance.factory;

public class FoodFactory {
    public Food getFood(String order) {
        switch (order){
            case "cake":
                return new Cake();
            case "pizza":
                return new Pizza();
            default:
                System.out.println("Wrong Input!");
        }
        return null;
    }
}
