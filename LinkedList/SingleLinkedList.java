package com.learn.linkedlist;

public class SingleLinkedList {
	private Node head;
	private Node tail;
	
	private int size;
	
	public SingleLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public int getSize(){
		return size;
	}
	
	public void add(String data){
		Node node = new  Node(data,null);
		if(head == null){
			head = node;
			
		}
		else {
			Node currentNode = head;
			while(currentNode.next!=null){
				currentNode = currentNode.next;
			}
			currentNode.next = new Node(data,null);
		}
		size++;
	}
	
	public  void deleteData(String data){
		// Traverse the List  and find the Node
		Node currentNode = head;
		Node previousNode = null;
		while(currentNode.next !=null){
			if(currentNode.data.equals(data)){
				break;
				
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		
		previousNode.next = currentNode.next;
		size--;
	}
	
	public void display(){
		Node node = head;
		System.out.print("[");
		while(node.next!=null){
			System.out.print(node.data + "->");
			node = node.next;
			
		}
		System.out.print(node.data + "]");
		
		System.out.println("");
	}
	
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.display();
		
		list.deleteData("b");
		
		list.display();
		
		
	}
	
}
