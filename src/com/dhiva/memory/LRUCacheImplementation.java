package com.dhiva.memory;

import java.util.HashMap;

public class LRUCacheImplementation {
    private int capacity;
    private HashMap<Integer, LRUNode> data;
    private LRUNode head;
    private LRUNode end;

    public LRUCacheImplementation(int capacity) {
        this.capacity = capacity;
        data = new HashMap<>();
        head = null;
        end = null;
    }

    private void addNodeToHead(LRUNode node) {
        node.previous = null;
        node.next = null;
        if(head != null) {
            head.previous = node;
            node.next = head;
        }
        head = node;
        if(end == null) {
            end = head;
        }
    }

    private void removeNode(LRUNode node) {
        if(node.previous == null)
            head = node.next;
        else
            node.previous.next = node.next;
        if(node.next != null)
            node.next.previous = node.previous;
        else
            end = node.previous;
    }

    public int get(int key) {
        if(data.containsKey(key)) {
            LRUNode node = data.get(key);
            int value = node.value;
            removeNode(node);
            addNodeToHead(node);
            return value;
        }
        return -1;
    }

    public void set(int key, int value) {
        if(data.containsKey(key)) {
            LRUNode node = data.get(key);
            node.value = value;
            removeNode(node);
            addNodeToHead(node);
            return;
        }
        LRUNode node = new LRUNode(key, value);
        if(data.size() >= capacity) {
            data.remove(end.key);
            removeNode(end);
            addNodeToHead(node);
        }
        else {
            addNodeToHead(node);
        }
        data.put(key, node);
    }
}