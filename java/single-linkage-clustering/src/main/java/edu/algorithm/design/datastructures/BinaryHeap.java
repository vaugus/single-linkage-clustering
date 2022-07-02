package edu.algorithm.design.datastructures;

import edu.algorithm.design.model.HeapNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryHeap {

    private Queue<HeapNode> priorityQueue = new PriorityQueue<>();
    private int heapSize;
    List<Integer> indexMap;

    public BinaryHeap(int heapSize) {
        this.heapSize = heapSize;
        this.indexMap = new ArrayList<Integer>(Collections.nCopies(heapSize, 0));
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
}
