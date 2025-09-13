
import java.util.Random;

public class MyVector {
    private int[] v;
    // ocupacao para controlar o numero de valores validos
    private int occupation;

    // Overload
    public MyVector() {
        this.v = new int[10];
        this.occupation = 0;
    }

    public MyVector(int capacity) {
        this.v = new int[capacity];
        this.occupation = 0;
    }

    private boolean isFull() {
        if (this.occupation == this.v.length)
            return true;
        else
            return false;
    }

    private void rezise(int newSize) {
        int[] newVector = new int[newSize];
        for (int i = 0; i < occupation; i++) {
            newVector[i] = v[i];
        }
        this.v = newVector;
    }

    public int getPositionValue(int position) {
        return v[position];
    }

    public void setPositionValue(int position, int value) {
        v[position] = value;
    }

    public int[] getV() {
        return this.v;
    }

    public boolean isEmpty() {
        if (this.v.length == 0)
            return true;
        else
            return false;

    }

    public void setValue(int value) {
        if (isFull())
            rezise(v.length * 2);
        this.v[occupation++] = value;
    }

    public int remove() {
        if (!isEmpty()) {
            occupation--;
            v[occupation] = 0;
            if (v.length > 4 && occupation <= (v.length / 4))
                rezise(v.length / 2);
            return v[occupation];
        }
        return -1;
    }

    // Busca simples
    public boolean contains(int value) {
        for (int i = 0; i < this.occupation; i++) {
            if (this.v[i] == value)
                return true;
        }
        return false;
    }

    public MyVector clone() {
        MyVector newVector = new MyVector(v.length);
        newVector.occupation = this.occupation;
        for (int i = 0; i < this.occupation; i++) {
            newVector.v[i] = v[i];
        }
        return newVector;
    }

////////////////////////////////////////////////////////////////
    private void swap(int a, int b) {
        v[a] ^= v[b];
        v[b] ^= v[a];
        v[a] ^= v[b];
    };

    // Busca logaritma, funciona somente com vetor ordenado
    public boolean binarySearch(int value) {
        int start = 0, end = v.length;

        while (start <= end) {
            int medium = (start + end) / 2;
            if (value == v[medium])
                return true;
            if (value > v[medium])
                start = medium + 1;
            else
                end = medium - 1;
        }
        return false;
    }

    public int size() {
        return this.occupation;
    }

    public void fillVector() {
        Random random = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(v.length * 10);
        }
        occupation = v.length;
    }

    public void selectionSort() {
        for (int i = 0; i < this.v.length - 1; i++) {
            int pos = i;
            for (int j = i + 1; j < this.v.length; j++)
                if (v[j] < v[pos])
                    pos = j;
            if (pos != i) {
                swap(i, pos);
            }
        }
    }

    public void bubbleSort() {
        for (int i = 1; i < v.length; i++) {
            for (int j = 0; j < v.length - i; j++) {
                if (v[j] > v[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void insertionSort() {
        for (int i = 1; i < v.length; ++i) {
            int aux = v[i];
            int j;
            for (j = i - 1; j >= 0 && v[j] > aux; --j)
                v[j + 1] = v[j];
            v[j + 1] = aux;
        }
    }
////////////////////////////////////////////////////////////////

    // Override
    @Override
    public String toString() {
        String s = "tamanho = " + v.length + "\nocupacao = " + occupation + "\n";
        for (int i = 0; i < v.length; i++) {
            s += (v[i] + " ");
        }
        return s;
    }
};