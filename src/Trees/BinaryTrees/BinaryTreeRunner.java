/**
 * 
 */
package datastructure.tree.binarytree;
import datastructure.tree.binarytree.*;
/**
 * @author krishnom
 *
 */
public class BinaryTreeRunner {

	BinaryTreeOperations bto;
	/**
	 * 
	 */
	public BinaryTreeRunner() {
		this.bto = new BinaryTreeOperations();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTreeRunner runner = new BinaryTreeRunner();
		int[] preOrder = {1,2,4,5,3,6,7};
		int[] inOrder =  {4,2,5,1,6,3,7};

		//
		runner.createTree(preOrder, inOrder);	
		runner.printAllOrder();
	}
	
	public void createTree(int[] preOrder, int[] inOrder)
	{
		if(preOrder != null && inOrder != null)
		{
 //			System.out.println(inOrder.length-1);
			bto.rootNode = bto.createBinaryTree(preOrder,inOrder,0,inOrder.length-1);	
		}
	}

	public void printAllOrder()
	{
		System.out.println("-------------PreOrder------------------");
		bto.printPreOrder(bto.rootNode);
		System.out.println("");
		System.out.println("-------------PostOrder------------------");
		bto.printPostOrder(bto.rootNode);
		System.out.println("");
		System.out.println("-------------InOrder------------------");
		bto.printInOrder(bto.rootNode);
		System.out.println("");
		System.out.println("-------------LevelOrder------------------");
		bto.printLevelOrder(bto.rootNode);
		System.out.println("");
	}
}
