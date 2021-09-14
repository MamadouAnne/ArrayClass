public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }
    public void insert(int item){
        // if the Array is full resize it
        if(items.length == count) {
            //create a new Array (twice the size)
            int[] newItems = new int[count * 2];
            //copy all existing items
            for(int i = 0; i < count; i++)
                newItems[i] = items[i];
            //set "items" to this new Array
            items = newItems;
            // add the new item at the end
            items[count++] = item;
        }

    }
    public void print(){
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
