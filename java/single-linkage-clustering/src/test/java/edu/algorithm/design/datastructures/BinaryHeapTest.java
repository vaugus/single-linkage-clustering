package edu.algorithm.design.datastructures;


import org.junit.jupiter.api.Test;

import edu.algorithm.design.model.HeapNode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryHeapTest {

    @Test
    public void testBinaryHeapInitialization() {
        BinaryHeap binaryHeap = new BinaryHeap(10);

        assertTrue(binaryHeap.getIndexMap() != null);
        assertTrue(binaryHeap.getPriorityQueue() != null);
        assertArrayEquals(new int[10], binaryHeap.getIndexMap());
        assertArrayEquals(new HeapNode[10], binaryHeap.getPriorityQueue());
    }
}