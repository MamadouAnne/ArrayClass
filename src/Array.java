public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }
    public void insert(int item){
        // if the Array is full resize it
        // add the new item at the end
        items[count++] = item;

    }
    public void print(){
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
