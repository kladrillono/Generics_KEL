package linkedlist;

/**
 * This class models a GenericNode object that can contain any type of object. Each
 * node has its internal data (Integers, Doubles, Strings) and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson/kladrillono
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericNode<T> {
	
	private T data;  //data that the object stores
	private GenericNode nextNode; //pointer to the nextNode that will be in LinkedList
	
	/**
	 * Constructor build GenericNode object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode()
	{
		setNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 */
	public void setData(T data) {
		
		this.data=data;
		
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return Integers, Doubles, or Strings (data)
	 */
	public T getData() {
		
		return this.data;
		
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	public GenericNode getNode() {
		
		return this;
		
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode
	 */
	public void setNextNode(GenericNode nextNode)
	{
		this.nextNode=nextNode;
		
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return GenericNode object
	 */
	public GenericNode getNextNode() {
		
		return nextNode;
		
	}//end getNextNode
	
}//end class

