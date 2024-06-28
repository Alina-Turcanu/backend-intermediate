package demo.arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Item[] items = new Item[3];

        Object[] items2 = new Object[3];

        items2[0]= new Item("sdfdsf","sdfsdf",12);
        items2[1] ="asdfsfds";
        items2[2]= "bcf";

        ArrayList list = new ArrayList();
        list.set(0,new Item("sdfd","dsfsdf",13));
        list.set(1, "dsfsdf");*/

        ArrayList<Item> itemsArrayList = new ArrayList<>();


        itemsArrayList.add(new Item("sdfdsf","dsffds",14));
        itemsArrayList.add(new Item("sdfdsf","dsffds",14));

        System.out.println(itemsArrayList.get(0));


        itemsArrayList.remove(1);
















    }
}
