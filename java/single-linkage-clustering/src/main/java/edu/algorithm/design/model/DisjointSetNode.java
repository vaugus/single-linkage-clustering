package edu.algorithm.design.datastructures;

public class DisjointSetNode {

    private int value;
    private int rank;
    private DisjointSetNode parent;

    public DisjointSetNode() {

    }

    public DisjointSetNode(int value) {
        this.value = value;
        this.rank = 0;
        this.parent = this;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public DisjointSetNode getParent() {
        return parent;
    }

    public void setParent(DisjointSetNode parent) {
        this.parent = parent;
    }
}
