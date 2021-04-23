import java.util.function.Consumer;

public class SmartArray {
    private int[] elements;
    private int index;

    public SmartArray() {
        this.elements = new int[4];
        this.index = 0;
    }

    public void add(int element) {
        if (this.size() == this.elements.length) {
            this.elements = grow();
        }
        this.elements[index] = element;
        this.index++;
    }

    private int[] grow() {
        int[] newElement = new int[this.elements.length * 2];
        System.arraycopy(this.elements, 0, newElement, 0, this.elements.length);
        return newElement;
    }

    public int get(int index) {
        ensureIndex(index);
        return this.elements[index];
    }

    private void ensureIndex(int index) {
        if (index >= this.size() || this.index < 0) {
            throw new IndexOutOfBoundsException("SmartArray out of bounds for index " + index + " with size " + this.size());
        }
    }

    public int size() {
        return this.index;
    }

    public int remove(int index) {
        int element = get(index);

        if (this.size() - 1 - index >= 0) {
            System.arraycopy(this.elements, index + 1, this.elements, index, this.size() - 1 - index);
        }
        this.elements[this.size() - 1] = 0;
        this.index--;
        return element;
    }

    public boolean contains(int element) {
        return true;
    }

    public void add(int firstIndex, int secondIndex) {

    }

    public void forEach(Consumer<Integer> consumer) {

    }

}
