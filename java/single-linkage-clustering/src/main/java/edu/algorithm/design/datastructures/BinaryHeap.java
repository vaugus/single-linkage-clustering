package edu.algorithm.design.datastructures;

import edu.algorithm.design.model.HeapNode;
import edu.algorithm.design.model.PriorityQueue;

import java.util.Arrays;

public class BinaryHeap {

    private static final Double INFINITY = Double.MAX_VALUE;

    private final PriorityQueue priorityQueue;
    private int heapSize;
    private final int[] indexMap;

    public BinaryHeap(final int heapSize) {
        this.heapSize = heapSize;
        this.priorityQueue = new PriorityQueue(heapSize);
        this.indexMap = new int[heapSize];
        Arrays.fill(this.indexMap, 0);
    }

    public void bubbleUp(int index) {
        int parent = (index - 1) / 2;
        while(index >= 0 && priorityQueue.hasLowerPriority(index, parent)) {
            indexMap[priorityQueue.at(index).getIndex()] = parent;
            indexMap[priorityQueue.at(parent).getIndex()] = index;
            priorityQueue.swap(index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    public void bubbleDown(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int minIndex = index;

        if (left < heapSize && priorityQueue.hasLowerPriority(left, minIndex))
            minIndex = left;

        if (right < heapSize && priorityQueue.hasLowerPriority(right, minIndex))
            minIndex = right;

        if (minIndex != index) {
            indexMap[priorityQueue.at(index).getIndex()] = minIndex;
            indexMap[priorityQueue.at(minIndex).getIndex()] = index;
            priorityQueue.swap(index, minIndex);
            bubbleDown(minIndex);
        }
    }

    public HeapNode extractMin() {
        if (heapSize <= 0) return null;

        if (heapSize == 1) {
            heapSize--;
            return priorityQueue.at(0);
        }
  
        indexMap[priorityQueue.at(0).getIndex()] = heapSize - 1;
        indexMap[priorityQueue.at(heapSize - 1).getIndex()] = 0;
        priorityQueue.swap(0, heapSize - 1);
        heapSize--;
        bubbleDown(0);
        return priorityQueue.at(heapSize);
    }

    public void decreaseKey(int index, double priority) {
        double currentPriority = priorityQueue.at(index).getPriority();
        priorityQueue.at(index).setPriority(priority);

        if (priority < currentPriority)
            bubbleUp(index);
        else
            bubbleDown(index);
    }

    public void heapify(int startIndex) {
        for (int i = 0; i < heapSize; i++) {
            priorityQueue.insert(i, new HeapNode.Builder()
                                                .withIndex(i)
                                                .withPriority(INFINITY)
                                                .build());
        }

        priorityQueue.at(0).setPriority(0.0);
        priorityQueue.at(startIndex).setIndex(startIndex);
    
        for (int i = heapSize - 1; i >= 0; i--) bubbleDown(i);
    }

    public PriorityQueue getPriorityQueue() {
        return priorityQueue;
    }

    public int[] getIndexMap() {
        return indexMap;
    }

    @Override
    public String toString() {
        return "BinaryHeap [heapSize=" + heapSize + ", indexMap=" + Arrays.toString(indexMap) + ", priorityQueue="
                + priorityQueue + "]";
    }

    
}

// TODO
// Easier extractMin implementation

// // Store the minimum value, and remove it from heap
// HeapNode root = priorityQueue.at(0);
// priorityQueue.insert(0, priorityQueue.at(heapSize - 1));
// heapSize--;

// heapify(0);

// return root;