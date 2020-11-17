package lsp.robot;

//Liskov substitution principle
public class Sam {

    String name = this.getClass().getSimpleName();

    public Sam() {
        System.out.println(String.format("Hi, I am %s. I make coffee!", name));
    }

    public String makeCoffee() {
        return "Here is your coffee";
    }
}
