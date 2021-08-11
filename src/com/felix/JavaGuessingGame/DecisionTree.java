package com.felix.JavaGuessingGame;

/**
 * A binary decision tree class for string data types.
 */
public class DecisionTree {
	
	private BinaryNode root;
	private BinaryNode currentNode;
	
	/**
	 * Constructs an empty Binary Decision Tree.
	 */
	public DecisionTree() {
		this(null);
	}
	
	/**
	 * Constructs a Binary Decision Tree with only one node, the root node.
	 * @param rootData The string data object in the root node
	 */
	public DecisionTree(String rootData) {
		this(rootData, null, null);
	}
	
	/**
	 * Constructs a Binary Decision Tree with the specified string as the data in the root node and two different Decision Tree objects as the left and right child of that root node.
	 * @param rootData The string data object in the root node
	 * @param leftTree The left child of this root node.
	 * @param rightTree	The right child of this root node.
	 */
	public DecisionTree(String rootData, DecisionTree leftTree, DecisionTree rightTree) {
		initializeTree(rootData, leftTree, rightTree);
	}
	
	private void initializeTree(String rootData, DecisionTree leftTree, DecisionTree rightTree) {
		root = new BinaryNode(rootData);
		currentNode = root;
		if((leftTree != null) && !leftTree.isEmpty())
			root.setLeftChild(leftTree.root);
		if((rightTree!= null) && !rightTree.isEmpty()) {
			if(rightTree != leftTree)
				root.setRightChild(rightTree.root);
			else
				root.setRightChild(rightTree.root.copy());
		}
		if((leftTree != null) && (leftTree != this))
			leftTree.clear();
		if((rightTree != null) && (rightTree != this))
			rightTree.clear();
	}
	
	/** 
	 * Gets the data in the current node.
	 * @return The data object in the current node, or null if the current node is null.
	 */
	public String getCurrentData() {
		return currentNode.getData();
	}
	
	/** 
	 * Sets the data in the current node.
	 * @param newData The new data object.
	 */
	public void setCurrentData(String newData) {
		currentNode.setData(newData);
	}
	
	/** 
	 * Sets the data in the children of the current node, creating them if they do not exist.
	 * @param responseForNo The new data object for the left child.
	 * @param reponseForYes The new data object for the right child.
	 */
	public void setResponses(String responseForNo, String responseForYes) {
		currentNode.setLeftChild(new BinaryNode(responseForNo));
		currentNode.setRightChild(new BinaryNode(responseForYes));
	}
	
	/** 
	 * Sees whether the current node contains an answer.
	 * @return True if the current node is a leaf, false if it is a nonleaf.
	 */
	public boolean isAnswer() {
		return currentNode.isLeaf();
	}
	
	/** 
	 * Sets the current node to its left child.
	 * If the child does not exist, sets the current node to null.
	 */
	public void advanceToNo() {
		currentNode = currentNode.getLeftChild();
	}
	
	/** 
	 * Sets the current node to its right child.
	 * If the child does not exist, sets the current node to null.
	 */
	public void advanceToYes() {
		currentNode = currentNode.getRightChild();
	}
	
	/** Sets the current node to the root of the tree. */
	public void resetCurrentNode() {
		currentNode = root;
	}
	
	/** 
	 * Sets the data in the root node.
	 * @param rootData The new data object.
	 */
	public void setRootData(String rootData) {
		root.setData(rootData);
	}
	
	/**
	 * Gets the data in the current node.
	 * @return The data object in the root node, or null if the current node is null.
	 */
	public String getRootData() {
		return root.getData();
	}
	
	/** 
	 * Gets the height of this binary tree.
	 * @return The number of levels in this binary tree.
	 */
	public int getHeight() {
		int height = 0;
		if(root != null)
			height = root.getHeight();
		return height;
	}
	
	/** 
	 * Gets the number of nodes in this binary tree.
	 * @return The number of nodes within this binary tree.
	 */
	public int getNumberOfNodes() {
		int numOfNodes = 0;
		if(root != null)
			numOfNodes = root.getNumOfNodes();
		return numOfNodes;
	}

	/** Sets the root node of this binary tree to null. */
	public void clear() {
		root = null;
	}

	/** 
	 * Checks to see if this binary tree contains any nodes.
	 * @return True if the root node of this tree is null, false if not.
	 */
	public boolean isEmpty() {
		return root == null;
	}

}
