package LinkedList.SingleLinkedList;

class ListNode {
     int data;
     ListNode next;

     ListNode() {
          data = 0;
          next = null;
     }

     ListNode(int data) {
          this.data = data;
          next = null;
     }

}

class List1 {
     public ListNode headNode1, tailNode1;

     public void insertList1(int data) {

          ListNode l = new ListNode(data);
          if (headNode1 == null) {
               headNode1 = l;
               tailNode1 = l;
          } else {
               tailNode1.next = l;
               tailNode1 = l;
          }

     }

     public void display() {
          ListNode tempListNode = headNode1;
          while (tempListNode != null) {
               System.out.println(tempListNode.data);
               tempListNode = tempListNode.next;
          }
     }
}

class List2 {
     public ListNode headNode2, tailNode2;

     public void insertList2(int data) {
          ListNode l = new ListNode(data);
          if (headNode2 == null) {
               headNode2 = l;
               tailNode2 = l;
          } else {
               tailNode2.next = l;
               tailNode2 = l;
          }

     }

     public void display() {
          ListNode tempListNode = headNode2;
          while (tempListNode != null) {
               System.out.println(tempListNode.data);
               tempListNode = tempListNode.next;
          }
     }
}

class Merge {
     public void merge(ListNode head1, ListNode head2) {
          ListNode dummyNode = new ListNode(0);
          ListNode tail = dummyNode;

          while (head1 != null && head2 != null) {
               if (head1.data < head2.data) {
                    tail.next = head1;
                    head1 = head1.next;
               } else {
                    tail.next = head2;
                    head2 = head2.next;
               }
               tail = tail.next;
          }

          // Attach the remaining elements
          if (head1 != null) {
               tail.next = head1;
          } else if (head2 != null) {
               tail.next = head2;
          }

          ListNode tempNode = dummyNode.next;
          while (tempNode != null) {
               System.out.println(tempNode.data);
               tempNode = tempNode.next;
          }
          // return dummyNode.next; // Skip the dummy node to return the head of the
          // merged list
     }
}

public class MergeTwoLinkedList {
     public static void main(String[] args) {
          List1 l1 = new List1();
          List2 l2 = new List2();
          Merge m = new Merge();

          l1.insertList1(1);
          l1.insertList1(3);
          l1.insertList1(4);
          // l1.display();
          // System.out.println();

          l2.insertList2(0);
          l2.insertList2(1);
          l2.insertList2(2);
          l2.insertList2(5);
          // l2.display();

          m.merge(l1.headNode1, l2.headNode2);
          System.out.println();

     }

}
