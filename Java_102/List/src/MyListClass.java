import java.util.ArrayList;
import java.util.Arrays;

public class MyListClass <T>{
    private int capacity;
    private int elementCount;
    private T[] array;
    private int index;

    public MyListClass() {
        this.capacity = 10;
        this.array = (T[]) new Object[capacity];
        this.elementCount = 0;
        this.index = 0;
    }
    public MyListClass(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.elementCount = 0;
        this.index = 0;

        for (T i :array){
            System.out.println(i);
        }
    }
    public void add(T data) {
        if (this.elementCount == getCapacity()) {
            setCapacity(getCapacity() * 2);
        }
        try{
            this.array[index] = data;
        }catch (Exception e){
            this.array[index] = data;
        }
        setElementCount(this.getElementCount() + 1);
        this.index++;
    }
    public T get(int index){
        try {
            return this.array[index];
        }catch (Exception e) {
            return null;
        }
    }
    public void remove(int Rindex) {
        try {
            for (int i = Rindex; i < this.getElementCount() - 1; i++) {
                this.array[i] = this.array[i + 1];
            }
            int newCapacty = this.getElementCount() - 1;

            T[] newArray = Arrays.copyOf(this.array, newCapacty);

            this.array = newArray;
            this.setElementCount(newCapacty);
            this.setCapacity(capacity);
            this.index --;
        }catch (Exception e) {

        }
    }
    public void set(int index, T data) {
        try {
            this.array[index] = data;
        }catch (Exception e) {

        }
    }
    public String toString() {
        String arrayString = "";
        int i = 0;
        while (i < getElementCount()) {
            arrayString += this.array[i] + " ";
            i++;
        }
        return arrayString;
    }
    public int getElementCount() {
        return elementCount;
    }
    public void setElementCount(int elementCount){
        this.elementCount = elementCount;
    }
    public int size() {
        return getElementCount();
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(this.array, 0, newArray, 0, this.array.length);
        this.array = newArray;
        this.capacity = capacity;
    }
}
