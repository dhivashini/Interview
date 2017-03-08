package com.dhiva.memory;

public class LRUNode {
    public int key;
    public int value;
    public LRUNode previous;
    public LRUNode next;

    public LRUNode(int key, int value) {
        this.key = key;
        this.value = value;
        previous = null;
        next = null;
    }
}