package edu.algorithm.design.model;

public class HeapNode implements Comparable<HeapNode> {
    private int index;
    private double priority;

    public double getPriority() {
        return priority;
    }

    public void setPriority(double priority) {
        this.priority = priority;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int compareTo(HeapNode anotherHeapNode) {
        if (this.priority == anotherHeapNode.priority) return 0;
        return this.priority > anotherHeapNode.priority ? 1 : -1;
    }
}
