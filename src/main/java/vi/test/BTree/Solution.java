package vi.test.BTree;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        if (pre.length == 0) {
            return null;
        }

        // 根
        int root = pre[0];

        //根节点
        TreeNode tree = new TreeNode(root);


        //中序中root值为分割点 左侧：左子树，右侧：右子树
        int index = 0;
        for (; index < in.length - 1; index++) {
            if (in[index] == root) {//在中序遍历中找到根节点
                break;
            }
        }

        //中序遍历中：左子树的起始位置 0
        // 中序遍历中：左子树的结束位置 index
        // copyOfRange(int[] original, int from, int to)  包括from 不包括to

        //前序中pre的首元素为根节点，
        // 第二个元素是左子树的起始位置，
        // 由于左子树个数与中序的个数是一致的，通过左子树个数相等即可推出，前序中左子树的结束位置
        tree.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, index + 1), Arrays.copyOfRange(in, 0, index));

        //中序遍历中：右子树的起始位置 index+1
        // 中序遍历中：右子树的结束位置 in.length-1
        tree.right = reConstructBinaryTree(Arrays.copyOfRange(pre, index + 1, pre.length), Arrays.copyOfRange(in, index + 1, in.length));

        return tree;
    }

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    //栈：先进后出
    //队列：先进先出


    //把项压入堆栈顶部。
    public void push(int node) {
        stack1.push(node);
    }



    //移除堆栈顶部的对象，并作为此函数的值返回该对象。
    public int pop() {

        while(0 != stack1.size()){
            stack2.push(stack1.pop());
        }

        int val = stack2.pop();
        while(0 != stack2.size()){
            stack1.push(stack2.pop());
        }
        return val;
    }

    public int minNumberInRotateArray(int [] array){
        if(null == array || array.length == 0){
            return 0;
        }

        //起始坐标
        int len = array.length;
        int left = 0;
        int rigth = len - 1;
        int mid = (left + rigth)/2;
        if(array[left] == array[rigth] && array[left] == array[mid]){
            //顺序查找
            return findMin(array);
        }

        while((rigth-left) != 1){
            // 中间元素与第一个元素比较:

            mid = left + (rigth - mid)/2;
            // (1): 若中间元素<第一个元素,则最小元素在中间元素的左侧←,
            if(array[mid]<array[left]){
               rigth = mid;
            }else{
                left = mid;
            }
        }
        return array[rigth];
    }

    public int findMin(int [] array){
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
