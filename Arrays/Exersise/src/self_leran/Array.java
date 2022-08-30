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
    //printing array
    public void print(){
        for(int i=0;i<count;i ++){
            System.out.println(items[i]);
        }
    }

}
