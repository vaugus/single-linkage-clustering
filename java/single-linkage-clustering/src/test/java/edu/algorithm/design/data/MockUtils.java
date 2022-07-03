package edu.algorithm.design.data;

import edu.algorithm.design.model.HeapNode;
import edu.algorithm.design.model.PriorityQueue;

public abstract class MockUtils {

    public static HeapNode createHeapNode(int index, double priority) {
        HeapNode heapNode = new HeapNode();
        heapNode.setPriority(priority);
        heapNode.setIndex(index);
        return heapNode;
    }

    public static PriorityQueue createPriorityQueue(HeapNode... heapNodes) {
        PriorityQueue queue = new PriorityQueue(heapNodes.length);
        for (int i = 0; i < heapNodes.length; i++) {
            queue.insert(i, heapNodes[i]);
        }

        return queue;
    }
}
