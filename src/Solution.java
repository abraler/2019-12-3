

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution{
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=reConsrtuctBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    private static TreeNode reConsrtuctBinaryTree(int []a,int begin,int end,int[]b,int begin1,int end1){
        if(begin>end){
            return null;
        }
        TreeNode root=new TreeNode(a[begin]);
        for(int i=0;i<b.length;i++){
            if(b[i]==root.val){
                root.left=reConsrtuctBinaryTree(a,begin+1,begin+i-begin1,b,begin1,i-1);
                root.right=reConsrtuctBinaryTree(a,i-begin1+1+begin,end,b,i+1,end1);
                break;
            }

        }
        return root;
    }
}    