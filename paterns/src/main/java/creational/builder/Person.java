package creational.builder;

import org.joda.time.DateTime;

public class Person {

    private String name;
    private DateTime birthDate;
    private int height;
    private int weight;
    private Color eyeColor;

    private Person(Builder builder) {
        this.name = builder.name;
        this.birthDate = builder.birthDate;
        this.height = builder.height;
        this.weight = builder.weight;
        this.eyeColor = builder.eyeColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", height=" + height +
                ", weight=" + weight +
                ", eyeColor=" + eyeColor +
                '}';
    }

    public static class Builder {

        private String name;
        private DateTime birthDate;
        private int height;
        private int weight;
        private Color eyeColor;

        public Builder(String name) {
            if (name == null) {
                throw new IllegalArgumentException("name must not be null");
            }
            this.name = name;
        }

        public Builder withBirthDate(DateTime birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder withHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder withWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder withEyeColor(Color eyeColor) {
            this.eyeColor = eyeColor;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
