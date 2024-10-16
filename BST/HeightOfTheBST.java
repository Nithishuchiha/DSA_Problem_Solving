package BST;

class Node {
     int val;
     Node left;
     Node right;

     Node() {
          val = 0;
          left = right = null;
     }

     Node(int data) {
          val = data;
          left = right = null;
     }

}

class FindHeight {
     Node root = null;

     public Node getRoot() {
          return root;
     }

     // *INSERT AN ELEMENT IN BST */
     public void insert(int val) {

          Node newNode = new Node(val);
          if (root == null) {
               root = newNode;
          } else {
               Node temp = root;
               while (temp != null) {
                    if (temp.val == newNode.val) {
                         return;
                    } else if (temp.val > newNode.val && temp.left == null) {
                         temp.left = newNode;
                    } else if (temp.val > newNode.val && temp.left != null) {
                         temp = temp.left;
                    } else if (temp.val < newNode.val && temp.right == null) {
                         temp.right = newNode;
                    } else {
                         temp = temp.right;
                    }

               }

          }

     }

     // *DISPLAY ELEMENTS IN BST */
     public void display(Node root) {
          if (root == null) {
               return;
          } else {
               display(root.left);
               System.out.print(root.val + " ");
               display(root.right);
          }

     }

     // *DISPLAY ELEMENTS IN BST */
     public int heightOfTree(Node root) {
          if (root == null) {
               return -1;
          } else {
               // 2.1 */
               int lheight = heightOfTree(root.left);
               // 2.2
               int rheight = heightOfTree(root.right);
               if (lheight > rheight) {
                    return lheight + 1;
               } else {
                    return rheight + 1;
               }
          }

     }

}

public class HeightOfTheBST {
     public static void main(String[] args) {
          FindHeight f = new FindHeight();
          f.insert(50);
          f.insert(20);
          f.insert(15);
          f.insert(16);
          f.insert(30);
          f.insert(70);
          f.insert(60);

          Node root = f.getRoot();
          f.display(root);
          System.out.println();
          System.out.println("Height of the Tree :" + f.heightOfTree(root));

     }

}
