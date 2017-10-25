package arrayChall;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please enter how number to be input in the array\r");
        int numInput = sc.nextInt();
        int[] theArray = getIntegers(numInput);
        System.out.println(printIntegers(theArray));
        System.out.println();
        System.out.println("now let's sort the array...");
        System.out.println();
        System.out.println(Arrays.toString(sortInteger(theArray)));



    }
    public static int[] getIntegers(int numInput){
        System.out.println("please enter "+numInput+" number of your choice\r");
        int[] temArray= new int[numInput];
        for(int i=0;i<temArray.length;i++){
            temArray[i] = sc.nextInt();
        }
        return temArray;
    }
    public static String printIntegers(int [] array){
        return "The array is "+Arrays.toString(array);
    }
    public static int[] sortInteger(int [] array){
        int [] temArray = new int[array.length];
        for (int i=0;i<temArray.length;i++){
            temArray[i]=array[i];
        }
        boolean flag = true;
        int tem;
        while(flag){
            flag = false;
            for(int i=0;i<temArray.length-1;i++){
                if(temArray[i]<temArray[i+1]){
                    tem = temArray[i];
                    temArray[i]= temArray[i+1];
                    temArray[i+1] = tem;
                    flag = true;
                }
            }
        }
        return temArray;
    }
}
