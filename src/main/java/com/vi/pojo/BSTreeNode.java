package com.vi.pojo;

public class BSTreeNode<T extends Comparable<T>> {
    private BSTreeNode<T> root;
    private T key;
    private BSTreeNode<T> left;
    private BSTreeNode<T> right;
    private  BSTreeNode<T> parent;

    public BSTreeNode(
            T key,
            BSTreeNode<T> left,
            BSTreeNode<T> righ,
            BSTreeNode<T> parent) {
        this.key = key;
        this.left = left;
        this.right = righ;
        this.parent = parent;
    }

    public BSTreeNode<T> getRoot() {
        return root;
    }

    public BSTreeNode<T> setRoot(BSTreeNode<T> root) {
        this.root = root;
        return this;
    }

    public T getKey() {
        return key;
    }

    public BSTreeNode<T> setKey(T key) {
        this.key = key;
        return this;
    }

    public BSTreeNode<T> getLeft() {
        return left;
    }

    public BSTreeNode<T> setLeft(BSTreeNode<T> left) {
        this.left = left;
        return this;
    }

    public BSTreeNode<T> getRight() {
        return right;
    }

    public BSTreeNode<T> setRight(BSTreeNode<T> right) {
        this.right = right;
        return this;
    }

    public BSTreeNode<T> getParent() {
        return parent;
    }

    public BSTreeNode<T> setParent(BSTreeNode<T> parent) {
        this.parent = parent;
        return this;
    }
}