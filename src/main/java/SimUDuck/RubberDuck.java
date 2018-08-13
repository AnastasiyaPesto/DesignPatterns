package SimUDuck;

public class RubberDuck extends Duck{

    @Override
    public void quack() {
        System.out.println("Пи-пи-пи-пииии!");
    }

    public void display() {
        System.out.println("Я резиновая уточка! И я НЕ умею летать");
    }

    @Override
    public void fly() {

    }
}
