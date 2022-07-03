package edu.algorithm.design.model;

public class PriorityQueue {

    private final HeapNode[] queue;

    public PriorityQueue(int size) {
        this.queue = new HeapNode[size];
    }

    public void insert(int slot, HeapNode heapNode) {
        queue[slot] = heapNode;
    }

    public HeapNode at(int index) {
        return queue[index];
    }

    public int size() {
        return queue.length;
    }

    public boolean hasLowerPriority(int a, int b) {
        return queue[a].compareTo(queue[b]) == -1;
    }
}
