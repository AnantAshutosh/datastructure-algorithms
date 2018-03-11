/**
 * 
 */
package datastructure.tree.binarytree;
import datastructure.tree.binarytree.BinaryTreeNode;
import datastructure.queue.GenericQueue;
/**
 * @author krishnom
 *
 */
public class BinaryTreeOperations {

	int preOrderIndex; 
	BinaryTreeNode rootNode;
	/**
	 * 
	 */
	public BinaryTreeOperations() {
		// TODO Auto-generated constructor stub
		preOrderIndex = 0;
		rootNode = null;
	}

	public void printPreOrder(BinaryTreeNode root){
		if(root == null)
			return;

		System.out.print(root.data+",");
		printPreOrder(root.left);
		printPreOrder(root.right);
	}

	public void printInOrder(BinaryTreeNode root){
		if(root == null)
			return;

		printInOrder(root.left);
		System.out.print(root.data+ ",");
		printInOrder(root.right);
	}

	public void printPostOrder(BinaryTreeNode root)
	{
		if(root == null)
			return;

		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(root.data+ ",");
	}

	public void printLevelOrder(BinaryTreeNode root)
	{
		GenericQueue queue = new GenericQueue<BinaryTreeNode>(); //creating a queue which can hold A BTNode
		
		if(root == null)
			return;
		queue.enqueue(root);
		while(!queue.isEmpty())
		{
			BinaryTreeNode temp = (BinaryTreeNode)queue.dequeue();
			System.out.print(temp.data);
		
			if(null != temp.left)
				queue.enqueue(temp.left);
			if(null != temp.right)
				queue.enqueue(temp.right);
		}
		
	}

	/*
	 * Creates binary tree given preOrder and inOrder traversal.
	 */
	public BinaryTreeNode createBinaryTree(int[] preOrder, int[] inOrder, int inOrderStartIndex, int inOrderEndIndex){
		
		if(inOrderStartIndex > inOrderEndIndex)
				return null;
//		System.out.println(preOrderIndex);
		BinaryTreeNode newNode = new BinaryTreeNode(preOrder[preOrderIndex]);
		preOrderIndex++;
			
		//if only one index is there
		if(inOrderStartIndex == inOrderEndIndex)
			return newNode;
		
		//search for the same data in inOrder string
		int indexInOrder = inOrder[newNode.data];
		
		newNode.left = createBinaryTree(preOrder, inOrder, inOrderStartIndex, indexInOrder-1);
		newNode.right = createBinaryTree(preOrder, inOrder, indexInOrder+1, inOrderEndIndex);
		
		return newNode;
	}

	//Find Mas Element in Tree
	
	public int maxElement(BinaryTreeNode root)
	{
		int max = Integer.MIN_VALUE;
		int root_val;
	
		if(null != root)
		{
			root_val = root.data;
			int leftMax = maxElement(root.left);
			int rightMax = maxElement(root.right);

			if(leftMax > rightMax)
				max = leftMax;
			else
				max = rightMax;

			if(root_val > max)
				max = root_val;
		}
		return max;
	
	}

}
