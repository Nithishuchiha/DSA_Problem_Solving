package LinkedList.SingleLinkedList;

// class Node {
//      int data;
//      Node nextNode;
// }

class List {

     Node headNode;

     public void Begin(int data) {
          Node n = new Node();
          n.data = data;
          if (headNode == null) {
               headNode = n;
          } else {
               n.nextNode = headNode;
               headNode = n;
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

public class InsertAtBegin {
     public static void main(String[] args) {
          List l = new List();
          l.Begin(0);
          l.Begin(1);
          l.Begin(2);
          l.Begin(3);
          l.Begin(4);

          l.display();

     }

}
