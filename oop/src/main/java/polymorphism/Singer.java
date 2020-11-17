package polymorphism;

import java.util.List;

public class Singer extends Person {

    @Override
    public String talk(String word) {
        return String.format("[singing]: %s", word);
    }

    public String sing(String phrase) {
        return String.format("[singing loudly]: %s", phrase);
    }

    public String sing(String phrase1, String phrase2) {
        return String.format("[singing loudly]: %s %n[singing slowly]: %s", phrase1, phrase2);
    }

//    public String sing(String phrase) {
//        return String.format("[singing loudly]: %s", phrase);
//    }

//    public List<String> sing(String phrase) {
//        return List.of(phrase, phrase);
//    }
}
