package pl.n2god.exercises.ExceptionExercise;


public class BoxErrorinitial<T> {

    private final T attribute;

    public BoxErrorinitial(T attribute) {
        this.attribute = attribute;
    }

    public T getAttribute() {
        return attribute;
    }
}
