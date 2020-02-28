package com.vi.designpatten;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BTreeTest {

    public static BTree root = new BTree();


    public static void preOrder(BTree node) {
        if (null == node)
            return;
        System.out.println("节点值" + node.getVal());
        preOrder(node.leftNode);
        preOrder(node.rightNode);
    }


    public static void inOrder(BTree node) {
        if (null == node)
            return;
        inOrder(node.leftNode);
        System.out.println("节点值" + node.getVal());
        inOrder(node.rightNode);
    }

    public static void postOrder(BTree node) {
        if (null == node)
            return;
        postOrder(node.leftNode);
        postOrder(node.rightNode);
        System.out.println("节点值" + node.getVal());
    }

    //插入节点
    public static void insertNode(Integer val) {
        BTree newNode = new BTree();
        newNode.setVal(val);
        if (root.val == null) {
            root = newNode;
            return;
        }
        BTree targetNode = root;
        BTree lastNode = null;
        do {
            lastNode = targetNode;
            if (val < targetNode.getVal()) {
                targetNode = targetNode.getLeftNode();
            } else {
                targetNode = targetNode.getRightNode();
            }
        } while (null != targetNode);

        if (null == lastNode)
            return;

        if (val < lastNode.getVal()) {
            lastNode.setLeftNode(newNode);
        } else {
            lastNode.setRightNode(newNode);
        }
    }

    public static boolean checkPath(BTree node, Integer targetVal) {
        boolean flg = false;
        if (null == node) {
            return flg;
        }
        // 记录当前的路径,第一个路径为根节点
        List<Integer> path = new ArrayList<>();
        path.add(node.getVal());
        //记录当前路径的所有值的和,默认值为根节点的值
        int curSum = node.getVal();


        return flg;
    }

    /**
     * @param node      当前节点
     * @param curSum    到达当前节点的值
     * @param targetVal 目标值
     * @param pathVal   记录所走过的路径
     * @return
     */
    public static void searchPath(BTree node, Integer curSum, Integer targetVal, List<Integer> pathVal) {
        if (null == node.getLeftNode() && null == node.getRightNode()) {
            if (curSum == targetVal) {
                System.out.println("恭喜您已经找到路径");
            }
        }
        if (null != node.getLeftNode()) {
            //先走左边的路径
            curSum += node.getLeftNode().getVal();
            if (curSum < targetVal) {
                pathVal.add(node.getLeftNode().getVal());
                searchPath(node.getLeftNode(), curSum, targetVal, pathVal);
            } else {
                //如果超值了,则返回上一层
                curSum = curSum - node.getLeftNode().getVal();
                pathVal.remove(pathVal.size() - 1);

            }
            if (null != node.getRightNode()) {
                curSum += node.getRightNode().getVal();
                pathVal.add(node.getRightNode().getVal());
                searchPath(node.getRightNode(), curSum, targetVal, pathVal);
            }
        }
    }


    public static List<List<Integer>> binaryTreePathSum(BTree node, int target) {
        List<List<Integer>> Result = new ArrayList<>();
        List<Integer> path = new ArrayList<Integer>();
        if (node == null) {
            return Result;
        }
        path.add(node.val);
        helper(Result, path, node.val, target, node);
        //这里的根节点的值我一开始忘记加了，这是我的一个错误
        return Result;
    }

    private static void helper(List<List<Integer>> Result, List<Integer> path, int sum, int target, BTree root) {
        System.out.println("List<List<Integer>> Result"+Result);
        System.out.println("List<Integer> path"+path);
        System.out.println("int sum"+sum);
        System.out.println("int target"+target);
        System.out.println("BTree root"+root);
        System.out.println("***********************");
        if (root.leftNode == null && root.rightNode == null) {
            //判断已到达了叶子节点，如果到达了叶子节点的话还没有和sum相等的话那就放弃这个path数组
            if (sum == target) {
                Result.add(new ArrayList<Integer>(path));
            }
        }
        if (root.leftNode != null) {  //左子树
            path.add(root.leftNode.val);
            helper(Result, path, sum + root.leftNode.val, target, root.leftNode);
            path.remove(path.size() - 1);
            //这个remove的作用是，如果找到了sum==target的路径的话，
            // 由于每一在遍历左子树的时候就已经把每一个节点add到path数组里面了，
            // 在最后一个节点那里也已经将path值添加到了Result值里面了，
            // 所以要将path清空留个下一个右节点。
            // 同时要想合理的删除path里面的内荣最好的办法就是从后往前删，
            // 这是remove的一个弊端。
        }
        if (root.rightNode != null) {
            path.add(root.rightNode.val);
            helper(Result, path, sum + root.rightNode.val, target, root.rightNode);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
//        insertNode(23);
//        insertNode(45);
//        insertNode(16);
//        insertNode(37);
//        insertNode(3);
//        insertNode(81);
//        insertNode(22);
//        insertNode(1);
//        insertNode(44);
//
//        List<List<Integer>> result = binaryTreePathSum(root, 149);
//        System.out.println(result);

        Map<Character, Integer> map = new HashMap<>();
        map.put('4', 1);
        System.out.println(map);
    }
}
