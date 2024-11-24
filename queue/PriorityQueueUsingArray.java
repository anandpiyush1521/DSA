package com.sorting;

public class PriorityQueueUsingArray {
    static int size;
    static int capacity;
    static int[] arr;

    PriorityQueueUsingArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    public static void enqueue(int value){
        if(size == capacity){
            System.out.println("Queue is full");
            return;
        }
        arr[size] = value;
        size++;
    }

    public static int dequee(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return -1;
        }
        int maxIndex = 0;
        for(int i=0; i<size; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }

        int highestPriorityElement = arr[maxIndex];
        
        for(int i=maxIndex; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        return highestPriorityElement;
    }

    public static int peek(){
        if(size == 0){
            System.out.println("Queue is Empty");
        }
        int maxIndex = 0;
        for(int i=0; i<size; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }

        return arr[maxIndex];
    }

    public static void display(){
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "<--");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueUsingArray qu = new PriorityQueueUsingArray(9);
        qu.enqueue(56);
        qu.enqueue(12);
        qu.enqueue(15);
        qu.enqueue(9);
        qu.enqueue(7);
        qu.enqueue(10);
        qu.enqueue(5);
        qu.enqueue(6);
        qu.enqueue(2);
        // qu.enqueue(590);

        display();

        System.out.println("Dequeue Operation");
        System.out.println(dequee());
        System.out.println(dequee());

        display();

        System.out.println("Peek Operation");
        System.out.println(peek());




    }

}
