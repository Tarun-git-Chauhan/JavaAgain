package week_01;
import java.util.Arrays;
/* in this program we will learn about how we can use the copyArra method from the system container

* */
class copyTwoArrays{
    static void main() {
        int[] arr01= {1,2,3,4,5};
        int[] arr02 = new int[arr01.length];
        System.arraycopy(arr01,0,arr02,0,arr01.length);
        System.out.println("printing the arr01: "+ Arrays.toString(arr01));
        System.out.println("printing the arr02: "+ Arrays.toString(arr02));
    }
}