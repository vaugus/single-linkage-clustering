package edu.algorithm.design.model;

public class HeapNode implements Comparable<HeapNode> {
    private float priority;
    private int index;

    public float getPriority() {
        return priority;
    }

    public void setPriority(float priority) {
        this.priority = priority;
    }

    public int compareTo(HeapNode o) {
        return 0;
    }
}
