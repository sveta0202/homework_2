
public class Cat {
    private String name;
    private int appetite;
    private Boolean satiety;

    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }
    public Boolean getSatiety() {
        return satiety;
    }
    public Cat(String name, int appetite, Boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(int plate, int appetite ) {
        if(plate > appetite){
            plate = plate - appetite;
            satiety = true;
        }
        else{
            System.out.println("В тарелке не хватает еды, чтобы утолить аппептит котика.");
        }
    }
    public void eatinfo() {
        System.out.println(name);
        System.out.println(satiety);
    }
}