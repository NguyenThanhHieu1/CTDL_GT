package com.hieunt2008110113.tuan07;

public class Node {   
         int data;

    //Liên kết đến nút tiếp theo --> là 1 tham chiếu
    Node next; //biến tham chiếu kiểu note 

    public Node(){

    }
    public Node(int d){
        data = d;
    }

    public Node(int d, Node n){
        data = d;
        next = n;
    }
}
    
}
