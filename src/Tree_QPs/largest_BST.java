package Tree_QPs;

/*
Given a binary tree, find the largest subtree which is a Binary Search Tree (BST),
where largest means subtree with largest number of nodes in it.
Note:
A subtree must include all of its descendants.
Input: [10,5,15,1,8,null,7]

   10
   / \
  5  15
 / \   \
1   8   7

Output: 3
Explanation: The Largest BST Subtree in this case is the highlighted one.
             The return value is the subtree's size, which is 3.
 */
class bstPair{
    boolean isbst = true;
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;

    int size = 0;
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class largest_BST {

    public boolean isValidBST(TreeNode root) {
        return validBST(root).isbst;
    }

    public bstPair validBST(TreeNode root){
        if(root == null){
            return new bstPair();
        }
        bstPair lbp = validBST(root.left);
        bstPair rbp = validBST(root.right);
        bstPair sbp = new bstPair();
        sbp.max =  Math.max(lbp.max , Math.max(rbp.max,root.val));
        sbp.min = Math.min(lbp.min , Math.min(rbp.min,root.val));
        if(lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min>root.val){
            sbp.isbst = true;
            sbp.size=lbp.size+rbp.size+1;
        }
        else{
            sbp.isbst = false;
            sbp.size=Math.max(lbp.size, rbp.size);
        }
        return sbp;
    }

    public int largestBSTSubtree(TreeNode root){
        return validBST(root).size;
    }
    public static void main(String[] args) {

    }
}
