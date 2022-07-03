package edu.algorithm.design.datastructures;

import edu.algorithm.design.model.HeapNode;

import java.util.Arrays;

public class BinaryHeap {

    private final HeapNode[] priorityQueue;
    private int heapSize;
    private final int[] indexMap;

    public BinaryHeap(final int heapSize) {
        this.heapSize = heapSize;
        this.priorityQueue = new HeapNode[heapSize];
        this.indexMap = new int[heapSize];
        Arrays.fill(this.indexMap, 0);
    }

    public void bubbleUp(int index) {

    }

    public void bubbleDown(int index) {
    }

    public HeapNode extractMin() {
        return null;
    }

    public void decreaseKey(int index, float priority) {

    }

    public void heapify(int startIndex) {}

    public HeapNode[] getPriorityQueue() {
        return priorityQueue;
    }

    public int[] getIndexMap() {
        return indexMap;
    }
}
