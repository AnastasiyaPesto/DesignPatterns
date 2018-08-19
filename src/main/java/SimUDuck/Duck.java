package SimUDuck;

public abstract class Duck {
    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    };

    public void swim() {
        System.out.println("Я умею плыть");
    }

    public abstract void display();

}
