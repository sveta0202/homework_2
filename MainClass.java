import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5, false);
        Cat cat2 = new Cat("Murka", 3, false);
        Cat cat3 = new Cat("Houp", 6, false);
        Plate plate = new Plate(10);
        plate.info();
        ArrayList<Cat> catlist = new ArrayList<>();
        catlist.add(cat1);
        catlist.add(cat2);
        catlist.add(cat3);
        cat1.eat(plate.getFood(), cat1.getAppetite());
        plate.setFood(plate.getFood() - cat1.getAppetite());
        cat1.eatinfo();

        cat2.eat(plate.getFood(), cat2.getAppetite());
        plate.setFood(plate.getFood() - cat2.getAppetite());
        cat2.eatinfo();

        cat3.eat(plate.getFood(), cat3.getAppetite());
        plate.setFood(plate.getFood() - cat3.getAppetite());
        cat3.eatinfo();
        
        plate.info();
        plate.replenish(10);
        plate.info();
        

        

    }
}
