package Tree_QPs;
/*
Leetcode 1597

example 1-
Input: s = "2-3/(5*2)+1"
Output: [+,-,1,2,/,null,null,null,null,3,*,null,null,5,2]

example 2-
Input: s = "3*4-2*5"
Output: [-,*,*,3,4,2,5]

example 3 -
Input: s = "1+2+3+4+5"
Output: [+,+,5,+,4,null,null,+,3,null,null,1,2]
 */
class Node{
    char val;
    Node left;
    Node right;
    Node(){ this.val = ' '; }
    Node(char val) { this.val = val; }
    Node(char val, Node left , Node right){
        this.val=val;
        this.left=left;
        this.right = right;
    }
}
public class Build_Binary_Expression_Tree_From_Infix_Expression {
    

}
