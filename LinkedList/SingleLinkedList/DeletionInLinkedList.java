package LinkedList.SingleLinkedList;

class Node {
     int data;
     Node nextNode;
}

class Deletion {

     Node head, tailNode;

     // INSERT ELEMENT IN LINKED LIST
     public void insert(int data) {
          Node n = new Node();
          n.data = data;
          if (head == null) {
               head = n;
               tailNode = n;
          } else {
               tailNode.nextNode = n;
               tailNode = n;
          }
     }

     // DELETE ELEMENT IN BEGGINGING
     public void deleteAtBegin() {
          Node tempNode = head;

          tempNode = tempNode.nextNode;
          head = tempNode;

     }

     // DELETE ELEMENT AT SPECIFIED POSITION
     public void deleteAtSpecifiedPosition(int pos) {
          Node temNode = head;

          for (int i = 0; i < pos - 1; i++) {

               temNode = temNode.nextNode;
          }
          temNode.nextNode = temNode.nextNode.nextNode;
     }

     // DELETE AT END
     public void deleteAtEnd() {
          Node temNode = head;
          while (temNode.nextNode != tailNode) {

               // System.out.println(temNode.data + " ");

               temNode = temNode.nextNode;
          }
          temNode.nextNode = null;
          tailNode = temNode;

     }

     // DISPLAY AN ELEMENT
     public void display() {
          Node temp = head;
          while (temp != null) {
               System.out.println(temp.data + " ");
               temp = temp.nextNode;
          }
     }
}

public class DeletionInLinkedList {

     public static void main(String[] args) {
          Deletion d = new Deletion();
          d.insert(0);
          d.insert(1);
          d.insert(2);
          d.insert(3);
          d.insert(4);
          d.insert(5);
          d.insert(6);

          // d.deleteAtBegin();
          // d.deleteAtSpecifiedPosition(3);
          // d.deleteAtEnd();

          d.display();
     }

}
