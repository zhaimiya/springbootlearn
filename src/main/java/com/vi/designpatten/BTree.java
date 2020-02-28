package com.vi.designpatten;

public class BTree {
    Integer val ;
    BTree leftNode;
    BTree rightNode;

    public BTree() {
        this.val = val;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
    public BTree(Integer val, BTree leftNode, BTree rightNode) {
        this.val = val;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Integer getVal() {
        return val;
    }

    public BTree setVal(Integer val) {
        this.val = val;
        return this;
    }

    public BTree getLeftNode() {
        return leftNode;
    }

    public BTree setLeftNode(BTree leftNode) {
        this.leftNode = leftNode;
        return this;
    }

    public BTree getRightNode() {
        return rightNode;
    }

    public BTree setRightNode(BTree rightNode) {
        this.rightNode = rightNode;
        return this;
    }
}
