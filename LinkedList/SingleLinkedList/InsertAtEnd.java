package LinkedList.SingleLinkedList;

// class Node {
//      int data;
//      Node nextNode;

// }

class LinkedList {

     Node headNode, tailNode;

     public void insert(int data) {
          Node n = new Node();
          n.data = data;
          n.nextNode = null;
          if (headNode == null) {
               headNode = n;
               tailNode = n;
          } else {
               tailNode.nextNode = n;
               tailNode = n;
          }

     }

     public void display() {
          Node tempNode = headNode;
          while (tempNode != null) {

               System.out.println(tempNode.data + " ");
               tempNode = tempNode.nextNode;
          }
     }
}

public class InsertAtEnd {

     public static void main(String[] args) {
          LinkedList l = new LinkedList();

          l.insert(10);
          l.insert(20);
          l.insert(30);
          l.display();
     }
}
