

class Node{
    private String data;
    private Node next;

    public Node(String data){
        this.data = data;
    }

    public void setData(String data){
        this.data = data;
    }

    public void setNext(Node node){
        this.next = node;
    }

    public String getData(){
        return this.data;
    }

    public Node getNext(){
        return this.next;
    }
}

class BasicLinkedList{
    private Node head;
    private Node tail;

    public Node getHead(){
        return this.head;
    }

    public Node getTail(){
        return this.tail;
    }

    public void addAtEnd(String data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public void addAtBeginning(String data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = this.tail = node;
        } else{
            this.head.setNext(node);
            this.head = node;
        }

    }

    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public Node find(String data){
        Node temp = this.head;
        while(temp != null){
            if(temp.getData().equals(data)){
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }


    public static void main(String[] args) {
        BasicLinkedList list = new BasicLinkedList();
        list.addAtEnd("Trilochna");
        list.addAtEnd("Piyush");
        list.addAtEnd("A");
        list.addAtEnd("B");
//        list.addAtBeginning("C");
        list.display();
        if(list.find("A") != null){
            System.out.println("NODE FOUND");
        } else {
            System.out.println("NODE NOT FOUND");
        }
    }
}