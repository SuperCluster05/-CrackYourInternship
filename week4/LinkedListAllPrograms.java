package week3;

public class LinkedListAllPrograms {
    public class Node{
        int data ;
        Node next ;

        public Node(int data){
            this.data = data ;
            this.next = null;
        }
    }
    public static Node head ;
    public static Node tail;
    public static int size;

    public void addFirst(int data ){
        //create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail= newNode;
            return ;
        }
        newNode.next = head ;
        head = newNode ;
    }
    public void addlast(int data ){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode ;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int removeFirst(){
        if(size ==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = head.data;
            head = head.next ;
            return val;
        }
        int val = head.data ;
        head = head.next;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty ");
            return Integer.MIN_VALUE;
        }else if(size ==1 ){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        //prev : 1 = size -2
        Node prev = head ;
        for(int i =0;i<size-2;i++){
            prev = prev.next;

        }
        int val = prev.next.data ;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
   public int itr_Search(int key){
        Node temp = head ;
        int i =0;

        while(temp != null){
            if(temp.data == key){
                return  i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
   }
    public static void PrintLinked(){
        if(head == null){
            System.out.println("LL is empty ");
            return ;
        }
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
   public int helper(Node head , int key ){
        if(head == null){
            return -1;
        }
        if(head.data == key ){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1 ;

   }
   public int recSearch(int key){
        return helper(head,key);

   }