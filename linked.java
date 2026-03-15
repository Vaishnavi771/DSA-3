import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head=null;
    Node tail=null;
    public void insert(int y){
        Node sn=new Node(y);
        if(head==null){
            head=sn;
            tail=sn;

        }
        else{
            tail.next=sn;
            tail=sn;
        }
        
    }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}

public class Main{
    public static void main(String[]args){
        Scanner run=new Scanner(System.in);
        int u=run.nextInt();
        LinkedList obj=new LinkedList();
        for(int i=0;i<u;i++){
            int y=run.nextInt();
            obj.insert(y);
        }
        obj.display();
    }
}