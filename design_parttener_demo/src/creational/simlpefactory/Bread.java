package creational.simlpefactory;

public class Bread implements IFood {
    @Override
    public void addAddivties() {
        System.out.printf("面包加酵母");
    }

    @Override
    public void addColor() {
        System.out.printf("脏脏包");
    }
}
