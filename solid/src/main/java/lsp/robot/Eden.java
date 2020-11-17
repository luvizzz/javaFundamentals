package lsp.robot;

//Liskov substitution principle
public class Eden extends Sam{

    String name = this.getClass().getSimpleName();

    public Eden() {
        System.out.println(String.format("Hi, I am %s. Sam's child!", name));
    }

    @Override
    public String makeCoffee() {
        return "Here is a cappuccino!";
    }
}
