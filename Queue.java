import java.util.*;
class Queue{
    private int maxSize;
    private int front;
    private int rear;
    private int arr[];

    Queue(int maxSize){
        this.maxSize = maxSize;
        this.front =0;
        this.rear =-1;
        this.arr = new int[this.maxSize];
    }

    public boolean isFull(){
        if(rear == maxSize-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(front > rear){
            return true;
        }else{
            return false;
        }
    }

    public boolean enqueue(int data){
        if(isFull()){
            return false;
        }else{
            arr[++rear] = data;
            return true;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }else{
            int data = arr[this.front];
            arr[front++] = Integer.MIN_VALUE;
            return data;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            for(int i = front; i <= rear; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args){
        Queue qu = new Queue(100);
        qu.enqueue(1);
        qu.enqueue(2);
        qu.enqueue(8);
        qu.enqueue(15);
        qu.enqueue(87);

        qu.display();
        System.out.println(" ");

        System.out.println(qu.dequeue());
        System.out.println(qu.dequeue());

        qu.display();

    }
}