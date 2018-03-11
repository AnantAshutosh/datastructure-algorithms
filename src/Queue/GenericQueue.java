package datastructure.queue;

import java.util.LinkedList;
/**
* A generic Circular queue implementation using LinkedLists
*/
public class GenericQueue<E>{

	private LinkedList<E> list = new LinkedList<E>();
	

	/* get front element without removing it */	
	public E getFront()
	{
		return	list.peekFirst();
	}	

	public void enqueue(E data)
	{
		list.addLast(data);
	}

	public E dequeue()
	{
		return list.pollFirst();	
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
}

