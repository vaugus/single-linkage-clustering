package edu.algorithm.design.datastructures;


import org.junit.jupiter.api.Test;

import edu.algorithm.design.model.HeapNode;
import edu.algorithm.design.model.PriorityQueue;

import static edu.algorithm.design.data.MockUtils.createHeapNode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryHeapTest {

    private final HeapNode priorityTwenty = createHeapNode(20.0); 
    private final HeapNode priorityTen = createHeapNode(10.0);
    private final HeapNode priorityFive = createHeapNode(5.0);

    private BinaryHeap heap;

    @Test
    public void testBinaryHeapInitialization() {
        heap = new BinaryHeap(10);

        assertTrue(heap.getIndexMap() != null);
        assertTrue(heap.getPriorityQueue() != null);
        assertArrayEquals(new int[10], heap.getIndexMap());
        assertEquals(10, heap.getPriorityQueue().size());
        heap.getPriorityQueue().stream().forEach(node -> assertNull(node));
    }

    @Test
    public void testBubbleDownWorstCase() {
        heap = new BinaryHeap(3);
        setupBubbleDownWorstCase();

        assertPriorityQueueOrder(2, 1, 0);

        heap.bubbleDown(0);

        assertPriorityQueueOrder(0, 1, 2);
    }
    
    @Test
    public void testBubbleBestCase() {
        heap = new BinaryHeap(3);
        setupBubbleDownBestCase();

        assertPriorityQueueOrder(0, 1, 2);

        heap.bubbleDown(0);

        assertPriorityQueueOrder(0, 1, 2);
    }

    @Test
    public void testBubbleAverageCase() {
        heap = new BinaryHeap(3);
        setupBubbleAverageCase();

        assertPriorityQueueOrder(1, 0, 2);

        heap.bubbleDown(0);

        assertPriorityQueueOrder(0, 1, 2);
    }

    private void assertPriorityQueueOrder(int... order) {
        assertEquals(heap.getPriorityQueue().at(order[0]), priorityFive);
        assertEquals(heap.getPriorityQueue().at(order[1]), priorityTen);
        assertEquals(heap.getPriorityQueue().at(order[2]), priorityTwenty);
    }
    
    private void setupBubbleDownWorstCase() {
        setupBubbleDown(2, 1, 0);
    }

    private void setupBubbleDownBestCase() {
        setupBubbleDown(0, 1, 2);
    }

    private void setupBubbleAverageCase() {
        setupBubbleDown(1, 0, 2);
    }
    
    private void setupBubbleDown(int... order) {
        priorityFive.setIndex(order[0]);
        priorityTen.setIndex(order[1]);
        priorityTwenty.setIndex(order[2]);

        heap.getIndexMap()[1] = order[1];
        heap.getIndexMap()[2] = order[2];

        heap.getPriorityQueue().insert(order[0], priorityFive);
        heap.getPriorityQueue().insert(order[1], priorityTen);
        heap.getPriorityQueue().insert(order[2], priorityTwenty);
    }
}