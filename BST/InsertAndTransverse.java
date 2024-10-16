package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
     int data;
     TreeNode leftTreeNode;
     TreeNode rightTreeNode;
}

class InsertBST {
     TreeNode root = null;

     public void insert(int data) {

          TreeNode newNode = new TreeNode();
          newNode.data = data;
          if (root == null) {
               root = newNode;
          } else {
               TreeNode temp = root;
               while (temp != null) {
                    if (temp.data == newNode.data) {
                         // System.out.println("Duplicates are not allowed");
                         // return;
                         break;
                    } else if (temp.data > newNode.data && temp.leftTreeNode == null) {
                         temp.leftTreeNode = newNode;

                    } else if (temp.data > newNode.data && temp.leftTreeNode != null) {
                         temp = temp.leftTreeNode;
                    } else if (temp.data < newNode.data && temp.rightTreeNode == null) {
                         temp.rightTreeNode = newNode;

                    } else {
                         temp = temp.rightTreeNode;
                    }

               }

          }

     }

     public TreeNode getRootNode() {
          return root;
     }

     // *INORDER TRAVERSAL */
     public void inOrder(TreeNode root) {

          if (root == null) {
               return;
          } else {

               inOrder(root.leftTreeNode);
               System.out.print(root.data + " ");
               inOrder(root.rightTreeNode);
          }
     }

     // *POSTORDER TRAVERSAL */
     void postOrder(TreeNode root) {
          if (root == null) {
               return;
          }
          postOrder(root.leftTreeNode);
          postOrder(root.rightTreeNode);
          System.out.print(root.data + " ");
     }

     // *PREORDER TRAVERSAL */
     void preOrder(TreeNode rootNode) {
          if (rootNode == null) {
               return;
          } else {
               System.out.print(rootNode.data + " ");
               inOrder(rootNode.leftTreeNode);
               inOrder(rootNode.rightTreeNode);
          }
     }

     // *LEVEL ORDER TRAVERSAL */
     public void levelOrder(TreeNode root) {

          if (root == null) {
               return;
          } else {
               Queue<TreeNode> q = new LinkedList<>();

               q.add(root);
               while (!q.isEmpty()) {
                    int size = q.size();
                    for (int i = 0; i < size; i++) {

                         TreeNode current = q.poll();

                         System.out.print(current.data + " ");

                         if (current.leftTreeNode != null) {
                              q.add(current.leftTreeNode);
                         }
                         if (current.rightTreeNode != null) {
                              q.add(current.rightTreeNode);
                         }
                    }
                    System.out.println();

               }

          }

     }
}

public class InsertAndTransverse {
     public static void main(String[] args) {
          InsertBST bst = new InsertBST();
          bst.insert(30);
          bst.insert(49);
          bst.insert(23);
          bst.insert(24);
          bst.insert(39);

          TreeNode root = bst.getRootNode();
          // bst.inOrder(root);
          // bst.postOrder(root);
          // bst.preOrder(root);
          bst.levelOrder(root);
     }
}
