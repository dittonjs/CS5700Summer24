import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator<T> implements Iterator<T> {
    private ArrayList<T> array;
    private int index = 0;
    public ArrayListIterator(ArrayList<T> array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.size();
    }

    @Override
    public T next() {
        T temp = array.get(index);
        index ++;
        return temp;
    }
}
