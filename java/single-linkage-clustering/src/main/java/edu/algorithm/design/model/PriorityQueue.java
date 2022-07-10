package edu.algorithm.design.model;

import java.util.Arrays;
import java.util.stream.Stream;

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

    public void swap(int source, int target) {
        HeapNode temporaryNode = queue[source];
        queue[source] = queue[target];
        queue[target] = temporaryNode;
    }

    public Stream<HeapNode> stream() {
        return Arrays.stream(queue);
    }

    public boolean hasLowerPriority(int a, int b) {
        return queue[a].compareTo(queue[b]) == -1;
    }

    @Override
    public String toString() {
        return "PriorityQueue [queue=" + Arrays.toString(queue) + "]";
    }
}
