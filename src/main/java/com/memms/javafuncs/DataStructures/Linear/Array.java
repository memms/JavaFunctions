package com.memms.javafuncs.DataStructures.Linear;

import java.util.Arrays;

public class Array {
    private int[] arr;
    private int[][] arr2D;
    public Array(int size) {
        arr = new int[size];
        arr2D = new int[size][size];
        System.out.println("Note that the array is initialized with all elements set to 0.");
    }

    public Array() {
        arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        arr2D = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
    }

    public Array(int[] arr) {
        this.arr = arr;
    }

    public void printArray() {
        System.out.println("We cannot print an array by simply + arr as it would print the memory address like this: " + arr);
        System.out.println("Instead, we must iterate through the array and print each element individually.");
        System.out.print("[");
        int i =0;
        do{
            System.out.print(arr[i]+", ");
            i++;
        }while(i<arr.length-1);
        System.out.println(arr[arr.length-1]+ "]");
        System.out.println("Another way to print an array is to use the Arrays.toString() method from the java.util.Arrays library.");
        System.out.println(Arrays.toString(arr));
    }

    public void print2DArray() {
        System.out.println("We cannot print a 2D array by simply + arr2D as it would print the memory address like this: " + arr2D);
        System.out.println("Instead, we must iterate through the array and print each element individually.");
        System.out.print("[");
        int i =0;
        do{

            int [] tmp = arr2D[i];
            System.out.print("[");
            int j =0;
            do{
                System.out.print(tmp[i]+", ");
                j++;
            }while(j<tmp.length-1);
            System.out.print(tmp[tmp.length-1]+ "], ");

            //This can be used instead of iterating the inner array
            //System.out.print(Arrays.toString(arr2D[i])+ ", ");

            i++;
        }while(i<arr2D.length-1);
        System.out.println(Arrays.toString(arr2D[arr2D.length-1])+ "]");
        System.out.println("Another way to print a 2D array is to use the Arrays.deepToString() method from the java.util.Arrays library.");
        System.out.println(Arrays.deepToString(arr2D));
    }

    public boolean addElement(int element) {
        for(int i =0; i<arr.length; i++){
            if(arr[i]!=0){
                continue;
            }
            arr[i] = element;
            return true;
        }
        return false;
    }

    /**
     * Replacement strategy add at index
     * @param element
     * @param index
     * @return
     */
    public boolean addAtIndex(int element, int index) {
        if(index<0 || index>arr.length-1){  //out of bounds
            return false;
        }
        arr[index] = element;
        return true;
    }


    public boolean removeElement(int element) {
        for(int i =0; i<arr.length; i++){
            if(arr[i]!=element){
                continue;
            }
            arr[i] = 0;
            System.out.println("Note that the element is not actually removed, but instead replaced with 0.");
            System.out.println("In real world scenario you would most likely apply a shifting strategy to remove the element.");
            System.out.println("Meaning, when you remove an element, you would shift all elements to the right of the removed element to the left by 1, making the last index of array a 0.");
            System.out.println("This is expensive as you would need to itterate through the array [n-i] times to remove an element.");
            System.out.println("For example, if you havve an array of [1, 2, 3, 4, 5] and you want to remove 3, you would shift 4 and 5 to the left by 1, resulting in [1, 2, 4, 5, 0].");
            System.out.println("Another way would be a replacement strategy, where you replace the element you want to remove with the last element in the array and then set the last element to 0.");
            System.out.println("This is much less expensive as this is direct replacement with no need for iteration (other than to find the element).");
            System.out.println("However, this strategy would not work if you need to preserve the order of the elements in the array.");
            System.out.println("For example, if you have an array of [1, 2, 3, 4, 5] and you want to remove 3, you would replace 3 with 5 and set 5 to 0, resulting in [1, 2, 5, 4, 0].");
            return true;
        }
        return false;
    }

    public boolean removeAtIndex(int index) {
        if(index<0 || index>arr.length-1){  //out of bounds
            return false;
        }
        arr[index] = 0;
        System.out.println("Note that the element is not actually removed, but instead replaced with 0.");
        System.out.println("Also note that no shifting or replacement strategy is used here as the element is removed by index.");
        return true;
    }

    public int getElement(int index) {
        if(index<0 || index>arr.length-1){  //out of bounds
            return -1;
        }
        return arr[index];
    }

    public int[] getArray() {
        return arr;
    }

    public void setArray(int[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return arr.length;
    }

    public void setSize(int size) {
        System.out.println("Note that the size of the array cannot be changed once it is initialized.");
        System.out.println("Thus, this method will create a new array and void the previous array.");
        arr = new int[size];
    }




}
