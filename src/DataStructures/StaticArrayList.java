package DataStructures;

public class StaticArrayList {

    private int [] list;
    private int size;
    private int capacity;

    public StaticArrayList (int setCapacity){
        this.capacity = setCapacity;
        this.list = new int [setCapacity];
        this.size = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void printArray(){
        for (int i = 0; i < this.capacity; i++){
            System.out.print(this.list[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull(){
        return this.size == this.capacity;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void pushBack(int key){
        if(isFull()){
            System.out.println("The array is full");
        }else{
            this.list[this.size++] = key; //Here the size is updated.
        }
    }

    public void pushFront (int key){
        if(isFull()){
            System.out.println("The array is full");
        }else{
            for (int i = this.size ; i >= 1; i--){
                this.list[i] = this.list[i-1];
            }
            this.list[0] = key;
            this.size++;
        }
    }

    public int topFront (){
        return this.list[0];
    }

    public int topBack (){
        return this.list[this.size];
    }

    public void popFront(){
        if (isEmpty()){
            System.out.println("The list is empty.");
        } else {
            for(int i = 0; i < this.capacity; i++){
                if ((i + 1) < this.capacity){
                    this.list[i] = this.list[i + 1];
                }
            }
            this.list[this.size - 1] = 0; //here the size isn't manipulated
            this.size--; //here it is manipulated

        }
    }

    public void popBack(){
        this.list[this.size - 1] = 0;
        this.size--;
    }

    public int getSize() {
        return size;
    }

    public boolean find (int key){
        int i = 0;

        if (isEmpty()){
            return false;

        } else if (this.size == this.capacity){

            while (this.list[i] != key && i < this.capacity) {
                i++;
            }
        }else {

            while (this.list[i] != key && i <= this.size){
                i++;
            }
        }
        return this.list[i] == key;
    }

    public void erase (int key) {
        if (this.list[0] == key){
            popFront();
        } else if (this.size < this.capacity && find(key)){
            popBack();
        }
    }
}
