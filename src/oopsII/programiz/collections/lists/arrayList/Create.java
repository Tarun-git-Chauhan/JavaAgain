package oopsII.programiz.collections.lists.arrayList;

// here this is the class where we will use the to call the from option 1

import java.util.ArrayList;

public class Create {
    // we created the userlist from the Main.java if the cx uses option 1.
    private String nameOfList=null;
    private ArrayList<String> arrayList=new ArrayList<>();
    // here we inserted the name of the list
    public Create(String nameOfList) {
        this.nameOfList = nameOfList;
//        System.out.println(nameOfList); // used for debugging
        // hope we dont need it
//        ArrayList<String> arrayList2=new ArrayList<>();
//        arrayList.add(String.valueOf(arrayList2));


    }

    public String getNameOfList() {
//        System.out.println(nameOfList); //used for debugging
        return nameOfList;
    }
    public boolean add(String item) {
        /*if(arrayList.add(item)){
            return true;
        }
        else {
            return false;
        }*/
        return arrayList.add(item);
    }
    public boolean remove(String item) {
       /* if(arrayList.remove(item)){
            return true;
        }
        else {
            return false;
        }*/
        return arrayList.remove(item);
    }
    public boolean contains(String item) {
        return arrayList.contains(item);
    }
}
