public class Array {

    int length = 0;
    int size = 5;
    int[] numbers = new int[this.size];

    void doubleArray() {

        int newSize = size*2;

        int[] newArray = new int[newSize];

        for(int i=0; i<size; i++) {
            newArray[i] = numbers[i];
        }

        this.numbers = newArray;

    }

    void insert(int number) {

        // Arr full
        if(this.length == this.size) {
            this.doubleArray();
            this.numbers[this.length] = number;
        }

        this.numbers[this.length] = number;
        this.length++;
    }

    void removeAt(int index) {
        for(int i= index+1;i<this.length;i++) {
            this.numbers[i-1] = this.numbers[i];
        }
        this.length--;
    }

    int indexOf(int number) {
        for(int i=0; i < this.length; i++) {
            if(this.numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }

    void print() {
        for(int i=0;i<this.length;i++) {
            System.out.println(this.numbers[i]);
        }
    }
}
