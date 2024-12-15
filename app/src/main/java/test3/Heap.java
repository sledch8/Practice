package test3;

public class Heap {
    public int[] data;
    public int maxCapacity;
    public int size = 0;

    public Heap(int cap){
        this.maxCapacity = cap;
        data = new int[maxCapacity];

    }

    public void insert(int num){
        //check if the heap is full
        //if it is, double the capacity and copy the heap to a new list
        if (this.size == this.maxCapacity){
            this.maxCapacity *= 2;
            int[] newheap = new int[this.maxCapacity];
            for (int i = 0; i < this.maxCapacity; i++){
                newheap[i] = data[i];
            }
        }

        //add the value at the end, the bubble up if the child is larger than the parent
        this.data[this.size] = num;
        this.size += 1;

        int index = this.size - 1;
        int parent = (index-1)/2;
        
        while (index > 0 && this.data[index] < this.data[parent]){
            int tmp = this.data[parent];
            this.data[parent] = this.data[index];
            this.data[index] = tmp;

            index = parent;
            parent = (index-1)/2;
        }
        
    }

    public int delete(int num){
        int max = this.data[0];
        int last = this.size-1;

        int tmp = this.data[max];
        this.data[max]= this.data[last];
        this.data[last] = tmp;

        this.size -= 1;

        int index = this.data[0];
        int leftchild = 2*index + 1;
        int rightchild = 2*index + 2;
        int smallest = index;

        while (index < this.size){
            if (this.data[index] < leftchild){
                smallest = leftchild;
            }

            if (this.data[index] > rightchild){
                smallest = rightchild;
            }

            if (smallest == index){
                break;
            }

            int swap = smallest;
            this.data[smallest] = this.data[index];
            this.data[index] = swap;

            index = smallest;
        }


        return max;
    }
    
}
