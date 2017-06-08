package com.uchoice.ucenter.biz.common;

/**
 * Created by ${admin} on 2017/5/30.
 */
public class Node<T> {
    private T current;
    private Node parent;
    private Node next;
    private boolean hasNext;
    public T getCurrent() {
        return current;
    }

    public Node<T> newNext(){
        return new Node<>();
    }
    public void setCurrent(T current) {
        this.current = current;
        if(null != parent){
            parent.setHasNext(true);
        }
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        parent.setHasNext(true);
    }
}
