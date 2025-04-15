package Queue;


public class QueueUsingArray {
    static class Q{
    static int arr[];
    static int size;
    static int rear;
    static int front;
    
    Q(int n){
        arr= new int[n];
        size = n;
        rear = -1;
        front = -1;
    }

    public static boolean isEmpty(){
        return rear==-1 && front ==-1;  
    }
    public static boolean isFull(){
        return (rear+1) %size == front;
    }

    public static void add(int data){
        if(isFull()) {
            System.out.println("Q is full");
            return;
        }

        if (front ==-1) {
            front = 0;
            
        }

        rear = (rear+1)%size;
        arr[rear]= data; 
    }
public static int remove(){
    if(isEmpty()){
        System.out.println("q is empty");
        return -1;
    }
int res = arr[ front];
   
    if(front == rear){
        front =-1;
        rear =-1;
    }else {
        front  =(front+1)%size;
    }

    return res;
}
public static int peek(){
    if(isEmpty()){
        return -1;
    }
    return arr[front];
}

    }
    
    
    public static void main(String[] args) {
        Q q = new Q(3);
        Q.add(1);
        Q.add(2);
        Q.add(3);
        System.out.println(q.remove());
        q.add(4);
    
        System.out.println(q.remove());
        q.add(5);
        
        while (!q.isEmpty()) {
            System.out.println(q.peek()+" ");
            q.remove();
            
        }


        
    }
    
}

