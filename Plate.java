
public class Plate {
    private int food;

    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        processFood(food);
    }
    public Plate(int food) {
        this.food = food;
    }

    private void processFood(int food){
        if (food < 0){
            System.out.println("В тарелке недостаточно еды.");
        }
        else {
            this.food = food;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void replenish(int addfood) {
        food = food + addfood;
     }
}