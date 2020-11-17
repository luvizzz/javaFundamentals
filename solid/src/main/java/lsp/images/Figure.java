package lsp.images;

//Liskov substitution principle
public class Figure {

    String name = this.getClass().getSimpleName();

    public String getName() {
        return name;
    }
}
