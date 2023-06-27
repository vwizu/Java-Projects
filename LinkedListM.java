public class LinkedListM {
    public static void main(String[] args) {
        Joker l=new Joker();
        l.addFirst(6);
        l.addFirst(5);
        l.addFirst(4);
        l.addFirst(2);
        l.addFirst(2);
        l.addFirst(2);
        l.addFirst(2);
        l.addFirst(1);
        l.display();
        l.dup();
        l.display();
        l.findMiddle();

    }
}
class Joker{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static Node tail;
    static int size=0;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void display(){
        Node temp=head;
        if (head==null){
            System.out.println("LinkedList Is Empty");
            return;
        }
        while (temp!=null){
            System.out.print(temp.data + " --> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public void addMiddle(int data,int idx){
        if (idx==0){
            addFirst(data);
            return;
        }
        if (idx==size){
            addLast(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node prev=head;
        Node temp=head;
        for (int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if (size==0){
            System.out.println("LL is already empty");
            return Integer.MIN_VALUE;
        }
        if (size==1){
            int val= head.data;
            head=tail=null;
            size=-0;
            return val;
        }
        int val=head.data;
        head=head.next;
        return val;
    }
    public int removeLast(){
        if (size==0){
            System.out.println("LL is already empty");
            return Integer.MIN_VALUE;
        }
        if (size==1){
            int val= head.data;
            head=tail=null;
            size=-0;
            return val;
        }
        Node prev=head;
        for (int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public void dup(){

        Node temp=head;
        while (temp!=null&&temp.next!=null){
            if (temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else temp=temp.next;
        }
    }
    public Node findMiddle(){
        Node slow=head;
        Node fast=head;
        Node temp=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println("Middle : " + slow.data);
        return slow;
    }
}