```java
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
```