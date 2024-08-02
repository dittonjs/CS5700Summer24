import java.util.Iterator;

public class ArrayIterable<T> implements Iterable<T> {
    private T[] array;
    public ArrayIterable(T[] array) {
        this.array = array;
    }


    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(array);
    }
}
