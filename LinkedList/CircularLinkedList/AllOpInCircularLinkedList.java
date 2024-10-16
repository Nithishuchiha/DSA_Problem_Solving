package LinkedList.CircularLinkedList;

class Node {
     int key;
     int data;
     Node nextNode;

     Node() {

          key = 0;
          data = 0;
          nextNode = null;
     }

     Node(int key, int data) {

          this.key = key;
          this.data = data;
          nextNode = null;
     }
}

class CircularLinkedList {
     Node head, tailNode;

     // INSERTING ELELMENTS IN A CIRCULAR LINKED LIST
     public void insert(int key, int data) {
          Node n = new Node(key, data);

          if (head == null) {
               head = n;
               tailNode = n;
               n.nextNode = n;
          } else {

               n.nextNode = head;
               tailNode.nextNode = n;
               tailNode = n;

          }

     }

     // PREPAND NODE AT BEGIN
     public void insertAtBegin(int key, int data) {
          Node n = new Node(key, data);
          // IF LIST IS EMPTY
          if (head == null) {
               head = n;
               tailNode = n;
               head.nextNode = n;
          } else {
               n.nextNode = head;
               tailNode.nextNode = n;
               head = n;

          }
     }

     // APPEMD NDDE AT END
     public void insertAtEnd(int key, int data) {
          Node tempNode = head;
          Node n = new Node(key, data);
          if (head == null) {
               head = n;
               tailNode = n;
               head.nextNode = n;
          } else {
               do {
                    tempNode = tempNode.nextNode;
               } while (tempNode.nextNode != head);

               tempNode.nextNode = n;
               n.nextNode = head;

          }
     }

     // INSERT NODE AT SPECIFIED POSITION
     public void insertAt(int pos, int key, int data) {
          Node tempNode = head;
          Node n = new Node(key, data);
          if (tempNode.nextNode != null) {
               for (int i = 0; i < pos - 1; i++) {
                    tempNode = tempNode.nextNode;

               }
               n.nextNode = tempNode.nextNode;
               tempNode.nextNode = n;
          }

     }

     // DELETE AN NODE (0 BASED INDEXING)
     public void deleteNode(int pos) {

          Node temNode = head;
          if (head == null) {
               System.out.println("List is already empty");
          } else {

               // DELETE THE FIRST NODE IN A CIRCULAR LINKED LIST
               if (pos == 0) {
                    head = head.nextNode;
                    do {
                         temNode = temNode.nextNode;
                    } while (temNode != tailNode);
                    temNode.nextNode = head;

               } else {
                    for (int i = 0; i < pos - 1; i++) {
                         temNode = temNode.nextNode;
                    }
                    if (temNode.nextNode.nextNode != null) {
                         temNode.nextNode = temNode.nextNode.nextNode;

                    }
                    // DELETE THE LAST NODE IN CIRCULAR LINKED LIST
                    else {
                         temNode.nextNode = head;

                    }
               }

          }
     }

     // TRANSVERSE AND DISPLAY AN LIST
     public void display() {
          Node tempNode = head;
          do {
               System.out.println(tempNode.data + " ");
               tempNode = tempNode.nextNode;
          } while (tempNode != head);

     }
}

public class AllOpInCircularLinkedList {

     public static void main(String[] args) {
          CircularLinkedList c = new CircularLinkedList();

          c.insert(0, 10);
          c.insert(1, 20);
          c.insert(2, 30);
          c.insert(3, 40);
          c.insert(4, 50);
          c.insertAtBegin(0, 0);
          c.insertAtEnd(0, 60);
          c.insertAt(5, 0, 80);
          c.deleteNode(2);

          c.display();
     }

}
