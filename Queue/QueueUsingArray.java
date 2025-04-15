package Queue;


public class Queue {
    static class Q{
    static int arr[];
    static int size;
    static int rear;
    
    Q(int n){
        arr= new int[n];
        size = n;
        rear = -1;
    }

    public static boolean isEmpty(){
        return rear==-1;
    }

    public static void add(int data){
        if(rear == size-1) {
            System.out.println("Q is full");
            return;
        }

        rear = rear+1;
        arr[rear]= data; 
    }
public static int remove(){
    if(isEmpty()){
        System.out.println("q is empty");
        return -1;
    }

    int front  =arr[0];
    for(int i =0;i<rear;i++){
        arr[i]= arr[i+1];
    }
    rear--;
    return front;
}
public static int peek(){
    if(isEmpty()){
        return -1;
    }
    return arr[0];
}

    }
    
    
    public static void main(String[] args) {
        Q q = new Q(5);
        Q.add(1);
        Q.add(2);
        Q.add(33);
        Q.add(30);

        while (!q.isEmpty()) {
            System.out.print(q.peek() +" ");
            q.remove();
            
        }

        
    }
    
}

