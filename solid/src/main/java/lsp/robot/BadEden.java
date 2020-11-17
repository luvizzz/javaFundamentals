package lsp.robot;

//Liskov substitution principle
public class BadEden { //does not extend Sam

    String name = this.getClass().getSimpleName();

    public BadEden() {
        System.out.println(String.format("Hi, I am %s. Sam's child (but not really)!", name));
    }

    //@Override
    public String makeCoffee() {
        return "I can't make coffee, but here is water!";
    }
}
