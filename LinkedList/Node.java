package com.learn.linkedlist;

public class Node {
	
	public Node next;
	public String data;
	
	public Node(){
		next = null;
		data = null;
	}
	
	

	public Node(String data,Node node) {
		this.next = node;
		this.data = data;
	}

	public Node getNode() {
		return next;
	}

	public String getData() {
		return data;
	}
	
	public void setData(String s){
		this.data = s;
	}
}
