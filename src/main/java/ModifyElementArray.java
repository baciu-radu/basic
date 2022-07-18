package main.java;

import java.lang.reflect.Array;

public class ModifyElementArray {
    public static void main(String[] args) {

        int array[] = { 2,7,9,8,3};
        for(int i=0; i<array.length; i++){
            if(array[i]%2 == 0){
                array[i]=array[i]*2;
            }else {
                array[i]=array[i]-7;
            }
        }
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
