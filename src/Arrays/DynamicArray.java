package Arrays;

public class DynamicArray {
    int[] numbers;
    int next_index_insertion = 0;

    public DynamicArray(int length) {
       this.numbers = new int[length];
    }

    public void print() {
        for(int i=0;i<next_index_insertion;i++) {
            System.out.println(this.numbers[i]);
        }
    }

    public void insert(int number) {
        if(numbers.length == next_index_insertion) {
            this.expand();
        }
        numbers[this.next_index_insertion] = number;
        this.next_index_insertion++;
    }

    public void expand() {
        int new_size = this.next_index_insertion * 2;
        int[] new_numbers = new int[new_size];
        for(int i=0;i<this.numbers.length;i++) {
            new_numbers[i] = this.numbers[i];
        }
        this.numbers = new_numbers;
    }

    public void removeAt(int index) {
        // valid indexes
        if(index < this.next_index_insertion && index >= 0) {
            shiftElementsLeft(index+1);
            this.next_index_insertion--;
        }
    }

    public int indexOf(int num) {
        for(int i=0;i<this.next_index_insertion;i++) {
            if(this.numbers[i] == num)
                return i;
        }
        return -1;
    }

    public void shiftElementsLeft(int start_index) {
        for(int i=start_index;i<this.next_index_insertion;i++) {
            this.numbers[i-1] = this.numbers[i];
        }
    }

}
