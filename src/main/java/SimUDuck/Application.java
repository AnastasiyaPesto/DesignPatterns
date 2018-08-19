package SimUDuck;

public class Application {
    public static void main(String[] args) {

        Duck duckMallar = new MallardDuck();

        duckMallar.performFly();
        duckMallar.performQuack();

        System.out.println("\n");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();


    }
}
