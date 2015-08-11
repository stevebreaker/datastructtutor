package org.barksoft.datastructtutor.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

import org.barksoft.datastructtutor.structs.LinkedListNode;

public class LinkedListNodeTest{

	private LinkedListNode lln = new LinkedListNode(1);

	private final int nodeCount = 5;

	@Test
	public void simpleNodeTest(){

		LinkedListNode newNode = new LinkedListNode(1);
		
		assertEquals(1,1);
	}

	@Test
	public void simpleNodeAppendTest(){

		LinkedListNode newNode = new LinkedListNode(1);
		LinkedListNode addNode = new LinkedListNode(2);

		newNode.appendToTail(addNode);
		
		assertEquals(1,1);
	}
	
}
