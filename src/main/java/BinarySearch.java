package main.java;

public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {1,3,6,9,12,14,16,17,19,22,25,26,37,62};
        int element= 12;
        int min= 1;
        int max = array.length;
        int index = -1;
        while(min<=max){
            int mid = min+((max-min)/2);
            if(array[mid]<element){
                min=mid+1;
            }else if(array[mid]>element){
                max=mid-1;
            }else if(array[mid]==element){
                index = min;
//                min=1;
//                max=0;
                break;
            }
        }
        if (index == -1){
            System.out.println("element not present");
        }else System.out.println("element is at index"+index);

    }
}
