package self_leran;

public class Array {
    // define empty array
    private int[] items;
    //keep track number of items on the array using this count variable
    private int count;

    // constructor
    public Array(int length) {
        // assign array length via constructer
        items = new int[length];
    }

    //insert new element to array
    public void insert(int item){
        //if the array is full resize it
        if(items.length==count){
            //create a new array(twice the size)
            int[] newItems = new int[count*2];
            //copy all existing items
            for(int i=0;i<count;i ++){
               newItems[i]=items[i];
            }
            //set items to this new array
            items = newItems;
        }
        //Add the new Item at the end of array
        items[count++] = item;

    }
    //printing array
    public void print(){
        for(int i=0;i<count;i ++){
            System.out.println(items[i]);
        }
    }
    //implement remove method
    public void removeAt(int index){
        //validate the index
        if(index<0 || index>=count){
            throw new IllegalArgumentException();
        }
        //shift the items to left to fill the hole
        // [10, 30, 40]
        // index: 1
        // 1 <- 2
        // 2 <-3
        for(int i=index;i<count;i ++){
            items[i] = items[i+1];
        }
        count --;
    }
    //serach operation
    //best case scenario
    //0(1)
     //worst case senario 0(n)
    public int indexOf(int item){
        //If we find it,return index
        //otherwise return -1
        for(int i=0;i<count;i++){
            if(items[i]==item)
                return i;
        }
        return -1;
    }

}
