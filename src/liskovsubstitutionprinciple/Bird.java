package liskovsubstitutionprinciple;

public class Bird {
    void fly(){
        System.out.println("Bird is flying");
    }
}
class Sparrows extends Bird{
    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }
}
class Penguin extends Bird{
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins can not fly");
    }
}
