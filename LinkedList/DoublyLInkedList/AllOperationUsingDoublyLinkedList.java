package LinkedList.DoublyLInkedList;

class Node {
     int data;
     Node previousNode;
     Node nextNode;
}

class Doubly {

     Node headNode, tailNode;

     // INSERT ELEMENTS FROM BEGGINGING OR END
     public void insert(int data) {

          Node n = new Node();
          n.data = data;
          if (headNode == null) {
               headNode = n;
               tailNode = n;
          } else {
               tailNode.nextNode = n;
               n.previousNode = tailNode;
               tailNode = n;
          }

     }

     // INSERT AT NODE AT BEGIN
     public void insertAtBegin(int data) {
          Node n = new Node();
          n.data = data;
          headNode.previousNode = n;
          n.nextNode = headNode;
          headNode = n;

     }

     // INSERT ELEMENT AT END
     public void insertElementAtEnd(int data) {

          Node n = new Node();
          n.data = data;
          tailNode.nextNode = n;
          n.previousNode = tailNode;
          tailNode = n;
     }

     // INSERT ELEMENT IN SPECIFIED POSITION
     public void insertAtSpecifiedPosition(int pos, int data) {

          Node temNode = headNode;
          Node n = new Node();
          n.data = data;
          for (int i = 0; i < pos - 1; i++) {
               temNode = temNode.nextNode;
          }
          n.nextNode = temNode.nextNode;
          n.previousNode = temNode;
          temNode.nextNode = n;
     }

     // DELETE AN NODE
     public void deleteNode(int pos) {
          Node tempNode = headNode;
          if (headNode == null) {

               System.out.println("No elements in a linked list");
               return;
          }

          if (pos == 0) {
               headNode = headNode.nextNode;
               headNode.previousNode = null;
          } else {
               if (tempNode.nextNode != null && tempNode.nextNode.nextNode != null) {

                    for (int i = 0; i < pos - 1; i++) {
                         tempNode = tempNode.nextNode;

                    }
                    if (tempNode.nextNode.nextNode != null) {

                         tempNode.nextNode = tempNode.nextNode.nextNode;
                         tempNode.nextNode.previousNode = tempNode;
                    } else {
                         tailNode = tempNode;
                         tailNode.nextNode = null;
                    }
               }

          }

     }

     // DISPLAY AN ELEMENT
     public void display() {
          Node tempNode = headNode;
          while (tempNode != null) {
               System.out.println(tempNode.data + " ");
               tempNode = tempNode.nextNode;
          }
     }
}

public class AllOperationUsingDoublyLinkedList {
     public static void main(String[] args) {
          Doubly d = new Doubly();
          d.insert(10);
          d.insert(11);
          d.insert(12);
          d.insert(13);
          d.insert(14);
          d.insert(15);
          // d.insertAtBegin(0);
          // d.insertElementAtEnd(6);
          // d.insertAtSpecifiedPosition(4, 30);
          d.deleteNode(4);

          d.display();

     }
}
