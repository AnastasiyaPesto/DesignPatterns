package SimUDuck;

public class Application {
    public static void main(String[] args) {

        Duck duckMallar = new MallardDuck();
        Duck duckRedHead = new RedHeadDuck();
        Duck duckRubber = new RubberDuck();
        Duck duckDecoy = new DecoyDuck();

        duckMallar.quack();
        duckMallar.swim();
        duckMallar.display();
        duckMallar.fly();

        System.out.print("\n");

        duckRedHead.quack();
        duckRedHead.swim();
        duckRedHead.display();
        duckRedHead.fly();

        System.out.print("\n");

        duckRubber.quack();
        duckRubber.swim();
        duckRubber.display();
        duckRubber.fly();

        System.out.print("\n");

        duckDecoy.quack();
        duckDecoy.swim();
        duckDecoy.display();
        duckDecoy.fly();
    }
}
