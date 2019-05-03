package creational.simlpefactory;
public class FoodFactory {
    private static IFood food;

    private static FoodFactory foodFactory;

    public static FoodFactory getInstance(){
        if (null == foodFactory) {
            foodFactory = new FoodFactory();
        }
        return foodFactory;
    }

}
