package main;
import linkedlist.Node;
import linkedlist.LinkedList;
import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);

		
		//test code for Integers linked list
		GenericLinkedList<Integer> intList = new GenericLinkedList<Integer>();
		
		GenericNode node1 = new GenericNode();
		node1.setData(2);
		intList.addNode(node1);
		node1 = new GenericNode();
		node1.setData(4);
		intList.addNode(node1);
		
		GenericNode tempgenericnode = intList.getList();
		do 
		{
			System.out.println(tempgenericnode.getData());
			tempgenericnode = tempgenericnode.getNextNode();
		} while (tempgenericnode != null);
		
		//test code for Doubles linked list
		GenericLinkedList<Double> doubleList = new GenericLinkedList<Double>();
		
		GenericNode node2 = new GenericNode();
		node2.setData(56.7);
		doubleList.addNode(node2);
		node2 = new GenericNode();
		node2.setData(34.5);
		doubleList.addNode(node2);
		
		GenericNode tempgenericnode2 = doubleList.getList();
		
		do 
		{
			System.out.println(tempgenericnode2.getData());
			tempgenericnode2 = tempgenericnode2.getNextNode();
		} while (tempgenericnode2 != null);
		
		//test code for Strings linked list
		GenericLinkedList<String> stringList = new GenericLinkedList<String>();
		
		GenericNode node3 = new GenericNode();
		node3.setData("mushroom");
		stringList.addNode(node3);
		node3 = new GenericNode();
		node3.setData("pepperoni");
		stringList.addNode(node3);
		
		GenericNode tempgenericnode3 = stringList.getList();
		
		do 
		{
			System.out.println(tempgenericnode3.getData());
			tempgenericnode3 = tempgenericnode3.getNextNode();
		} while (tempgenericnode3 != null);
		
	}//end main

}//end class
