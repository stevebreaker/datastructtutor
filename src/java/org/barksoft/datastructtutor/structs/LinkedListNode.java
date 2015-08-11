package org.barksoft.datastructtutor.structs;

public class LinkedListNode {
	private int data;

	private LinkedListNode next = null;

	public LinkedListNode(int data){

		this.data = data;
	}

	public void appendToTail(LinkedListNode node){

		LinkedListNode currentNode = this;


		while(currentNode.getNext() != null){
			currentNode = currentNode.getNext();
		}

		currentNode.setNext(node);
	}

	public LinkedListNode getNext(){
		return this.next;
	}

	public void setNext(LinkedListNode node){
		this.next = node;
	}

	public int getSize(){
		LinkedListNode currentNode = this;

		int count = 1;

		while (currentNode.getNext() != null){
			count += 1;
			currentNode = currentNode.getNext();
		}

		return count;
	}

	public void deleteAtNode(int index){

		deleteAtNode(this,1,index);
	}

	public void deleteAtNode(LinkedListNode checkNode, int count, int target){
		if (target < 1){
			throw new UnsupportedOperationException(
				"Cannot remove head node from linked list.");
		}

		if (checkNode == null){

			StringBuffer message = new StringBuffer();
			message.append("Linked list does not have requested node at");
			message.append(" postiton ");
			message.append(target);
			message.append(".");

			throw new UnsupportedOperationException(message.toString());
		}

		if (count == target){
			checkNode.setNext(checkNode.getNext().getNext());
		} else {
			deleteAtNode(checkNode.getNext(),count + 1,target);
		}
	}
}
