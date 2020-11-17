package commonObjectMethods;

public class CommonMethods {

    int someValue;

    public CommonMethods() {
    }

    public CommonMethods(int someValue) {
        this.someValue = someValue;
    }

    public int getSomeValue() {
        return someValue;
    }

    public void setSomeValue(int someValue) {
        this.someValue = someValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonMethods that = (CommonMethods) o;

        return someValue == that.someValue;
    }

    @Override
    public int hashCode() {
        return someValue;
    }

    @Override
    public String toString() {
        return "CommonMethods{" +
                "someValue=" + someValue +
                '}';
    }
}
