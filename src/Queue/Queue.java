package datastructure.queue;

/**
* Circular queue implementation using array
*/
public class Queue{

	int front;
	int rear;
	int[] queue;
	int size;
	public Queue(int size)
	{
		front = -1;
		rear = -1;
		this.size = size;
	
		queue = new int[size];
	}

	/* get front element without removing it */	
	public int getFront()
	{
		return queue[front];
	}	

	public void enqueue(int data)
	{
		if(rear == -1)
		{
			rear++;
			queue[rear] = data;
			front = rear;
			return;			
		}
		
		if(!isFull())
		{
			rear++;
			queue[rear%size] = data;
		}
		else
		{
			System.out.println("Queue is Full");
		}
	}

	public int dequeue()
	{
		int temp = front;
		front = (front+1)%size;

		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		}
		else
		{
			//if this is the last element then reset the queue	
			if(rear == front)
				rear = -1;
				front = -1;
			return queue[temp];	
		}
	}
	
	public boolean isFull()
	{
		return (rear+1)%size == front;
	}
	
	public boolean isEmpty()
	{
		return (front == -1);
	}
 
}

