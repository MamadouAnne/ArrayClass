public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item) {
        //if the Array is full resize it
        if (items.length == count) {
            //create a new Array (twice the size)
            int[] newItems = new int[count * 2];
            //copy all existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            //set "items" to this new Array
            items = newItems;
        }
            // add the new item at the end
            items[count++] = item;
    }

    public void removeAt(int index){
        //validate the index
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        //shift the items to the left to fill the hole
        for(int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;
    }
    public int indexOf(int item){
        // search item, if we find we return the index
        //otherwise we return -1
        for (int i = 0; i < count; i++)
            if (items[i] == item)
            return i;

            return -1;
    }
    public int max(int max) {
       //Assign the first (or any) array element to the variable that will hold the maximum value.
        items[0] = max;
        //Loop through the remaining array elements, starting at the second element (subscript 1).
        // When a larger value is found, that becomes the new maximum.
        for (int i = 1; i < count; i++)
            if (items[i] > max)
                max = items[i];
            return max;
    }

    public int[] intersect(){
        int[] commonItems = {};
        for (int i = 0; i < count; i++){
            for (int j =0; j < count; j++)
                if (items[i] == items[j])
                    commonItems[i] = items[i];
        }
        return commonItems;
    }

    public void print(){
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
