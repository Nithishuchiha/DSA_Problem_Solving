package BST;

import java.util.LinkedList;
import java.util.Queue;

class Node {
     int val;
     Node left;
     Node right;
}

class BT {
     Node root = null;

     public Node getRoot() {
          return root;
     }

     public void insertNodeAtBT(int val) {
          Queue<Node> q = new LinkedList<>();
          Node newNode = new Node();
          newNode.val = val;
          if (root == null) {
               root = newNode;
          } else {
               q.add(root);
               while (!q.isEmpty()) {
                    Node current = q.poll();
                    if (current.left == null) {
                         current.left = newNode;
                         break;

                    } else {
                         q.add(current.left);
                    }
                    if (current.right == null) {
                         current.right = newNode;
                         break;

                    } else {
                         q.add(current.right);
                    }
               }
          }

     }

     public void display(Node root) {

          Queue<Node> d = new LinkedList<>();
          if (root == null) {
               return;
          } else {
               d.add(root);
               while (!d.isEmpty()) {
                    Node temp = d.poll();
                    System.out.print(temp.val + " ");
                    if (temp.left != null) {
                         d.add(temp.left);
                    }
                    if (temp.right != null) {
                         d.add(temp.right);
                    }
               }
          }
     }

}

public class BinaryTree {
     public static void main(String[] args) {
          BT b = new BT();
          b.insertNodeAtBT(10);
          b.insertNodeAtBT(20);
          b.insertNodeAtBT(30);
          b.insertNodeAtBT(40);
          b.insertNodeAtBT(50);
          b.insertNodeAtBT(60);

          Node root = b.getRoot();
          b.display(root);
     }

}
