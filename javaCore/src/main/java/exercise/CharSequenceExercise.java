package exercise;

public class CharSequenceExercise implements CharSequence {
    private char[] value;

    public CharSequenceExercise() {
    }

    public CharSequenceExercise(char[] value) {
        this.value = value;
    }

    public void setValue(char[] value) {
        this.value = value;
    }

    public char[] getValue() {
        return this.value;
    }

    @Override
    public int length() {
        return this.value.length;
    }

    @Override
    public char charAt(int pos) {
        if(pos < 0 || this.value.length <= pos) {
            throw new IndexOutOfBoundsException("Index out of range: " + pos);
        }
        return this.value[pos];
    }

    @Override
    public CharSequence subSequence(int begin, int end) {
        if(this.value.length <= end || begin < 0 || begin > end) {
            throw new IndexOutOfBoundsException(String.format("begin %d, end %d, length %d", begin, end, this.value.length));
        }
        char[] response = new char[end - begin];
        System.arraycopy(this.value, begin, response, 0, end - begin);

//        for (int index = 0; index < (end - begin); index++) {
//            response[index] = this.value[index + begin];
//        }
        return new CharSequenceExercise(response);
    }

    public char[] invert() {
        char[] response = new char[this.value.length];
        for (int index = 0; index < this.value.length; index++) {
            response[index] = this.value[this.value.length - index -1];
        }
        return response;
    }

    @Override
    public String toString() {
        return value == null ? "" : new String(value);
    }
}
