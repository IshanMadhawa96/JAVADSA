package self_leran;

public class Array {
    private int[] items;
    // constructor
    public Array(int length) {
        items = new int[length];
    }
    //printing array
    public void print(){
        for(int i=0;i<items.length;i ++){
            System.out.println(items[i]);
        }
    }

}
