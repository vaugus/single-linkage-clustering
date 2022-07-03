package edu.algorithm.design.model;

import org.junit.jupiter.api.Test;

import static edu.algorithm.design.data.MockUtils.createHeapNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeapNodeTest {

    @Test
    public void testHeapNodeCompareTo() {
        HeapNode lowerPriority = createHeapNode(0,10.0);
        HeapNode samePriority = createHeapNode(1, 10.0);
        HeapNode higherPriority = createHeapNode(2, 20.0);

        assertEquals(-1, lowerPriority.compareTo(higherPriority));
        assertEquals(1, higherPriority.compareTo(lowerPriority));
        assertEquals(0, samePriority.compareTo(lowerPriority));
    }
}
