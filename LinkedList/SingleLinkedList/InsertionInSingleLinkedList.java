package LinkedList.SingleLinkedList;

class Node {
     int data;
     Node nextNode;
}

class InsertList {

     Node headNode, tailNode;

     // Insert Element at first Position
     public void insertAtBegin(int data) {

          Node n = new Node();
          n.data = data;
          n.nextNode = headNode;
          headNode = n;
          tailNode = n;
     }

     public void insertAtSpecifiedPosition(int pos, int data) {
          Node newNode = new Node();
          newNode.data = data;

          Node tempNode = headNode;
          for (int i = 0; i < pos - 1; i++) {
               tempNode = tempNode.nextNode;
          }
          newNode.nextNode = tempNode.nextNode;
          tempNode.nextNode = newNode;
     }

     // Delete an Node
     public void delete(int pos) {

          Node temNode = headNode;
          for (int i = 0; i < pos - 1; i++) {

               if (pos == 0) {

                    temNode.nextNode = null;
                    headNode = temNode.nextNode.nextNode;
               }

          }
     }

     // Insert At Last Position
     public void insertAtLast(int data) {

          Node temNode = headNode;
          Node n = new Node();
          n.data = data;
          while (temNode.nextNode != null) {

               temNode = temNode.nextNode;

          }
          if (temNode.nextNode == null) {
               temNode.nextNode = n;
               temNode = temNode.nextNode;

          }

     }

     public void insert(int data) {

          Node n = new Node();
          n.data = data;
          if (headNode == null) {
               headNode = n;
               tailNode = n;
          } else {

               tailNode.nextNode = n;
               tailNode = n;
          }

     }

     // Display an element
     public void display() {
          Node tempNode = headNode;
          while (tempNode != null) {
               System.out.println(tempNode.data + " ");
               tempNode = tempNode.nextNode;
          }
     }
}

public class InsertionInSingleLinkedList {
     public static void main(String[] args) {

          InsertList l = new InsertList();

          // l.insertAtBegin(0);

          l.insert(1);
          l.insert(2);

          l.insertAtSpecifiedPosition(0, 0);

          l.insert(5);
          l.insert(6);

          l.insertAtLast(7);
          l.display();
     }

}
