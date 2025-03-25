package liskovsubstitutionprinciple;

public class BirdImproved {
    void eat(){
        System.out.println("Bird is eating..");
    }
}
class Sparrow extends BirdImproved implements Flyable{
    @Override
    void eat() {
        System.out.println("Sparrow is eating..");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying..");
    }
}
class Penguins extends BirdImproved{
    @Override
    void eat() {
        System.out.println("penguin is eating ...");
    }
}
