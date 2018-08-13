package SimUDuck;

public abstract class Duck {
    public void quack() {
        System.out.println("Кря-кря-кря");
    }

    public void swim() {
        System.out.println("Я умею плыть");
    }

    public abstract void display();

    public void fly() {
        System.out.println("Я умею летать");
    }
}
