package com.felix.JavaGuessingGame;

/**
 * A class for a generic binary Node containing string data types.
 */
class BinaryNode {
	
	private String data;
	private BinaryNode leftChild;
	private BinaryNode rightChild;
	
	/**
	 * Constructs an empty binary node.
	 */
	public BinaryNode() {
		this(null);			// Call next constructor
	}
	
	/**
	 * Constructs a binary node with the specified string as its data.
	 * @param dataPortion The string data object in this binary node.
	 */
	public BinaryNode(String dataPortion) {
		this(dataPortion, null, null);			// Call next constructor
	}
	
	/**
	 * Constructs a binary node with two child nodes.
	 * @param dataPortion The string data object in the root node.
	 * @param newLeftChild The left child node of this root node.
	 * @param newRightChild The right child node of this root node.
	 */
	public BinaryNode(String dataPortion, BinaryNode newLeftChild, BinaryNode newRightChild) {
		data = dataPortion;
		leftChild = newLeftChild;
		rightChild = newRightChild;
	}

	/**
	 * Gets the string data within this root node.
	 * @return The String data object in this binary node, or null if the binary node is null.
	 */
	public String getData() {
		return data;
	}

	/**
	 * Sets the string object inside this root node.
	 * @param data The new string data object.
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * Gets the left child node of this binary node, or null if there is no left child.
	 * @return A reference to this nodes left child.
	 */
	public BinaryNode getLeftChild() {
		return leftChild;
	}

	/**
	 * Sets the left child node of this binary node.
	 * @param leftChild The new binary node that will be the left child.
	 */
	public void setLeftChild(BinaryNode leftChild) {
		this.leftChild = leftChild;
	}
	
	/**
	 * Checks if this binary node has a left child.
	 * @return True if the node has a left child, false if the left child is null.
	 */
	public boolean hasLeftChild() {
		return leftChild != null;
	}

	/**
	 * Gets the right child node of this binary node, or null if there is no right child.
	 * @return A reference to this nodes right child.
	 */
	public BinaryNode getRightChild() {
		return rightChild;
	}

	/**
	 * Sets the right child node of this binary node.
	 * @param leftChild The new binary node that will be the right child.
	 */
	public void setRightChild(BinaryNode rightChild) {
		this.rightChild = rightChild;
	}
	
	/**
	 * Checks if this binary node has a right child.
	 * @return True if the node has a right child, false if the right child is null.
	 */
	public boolean hasRightChild() {
		return rightChild != null;
	}
	
	/**
	 * Checks if this binary node has a left and right child.
	 * @return True if the left and right child are null, false if both of them are not.
	 */
	public boolean isLeaf() {
		return (leftChild == null) && (rightChild == null);
	}
	
	/**
	 * Counts the nodes in the subtree rooted at this node.
	 * @return The number of nodes in the subtree rooted at this node.
	 */
	public int getNumOfNodes() {
		return getNumOfNodes(this);
	}
	
	private int getNumOfNodes(BinaryNode node) {
		int leftNumber = 0;
		int rightNumber = 0;
		if(leftChild != null)
			leftNumber = leftChild.getNumOfNodes();
		if(rightChild != null)
			rightNumber = rightChild.getNumOfNodes(node);
		return 1 + leftNumber + rightNumber;
	}
	
	/**
	 * Computes the height of the subtree rooted at this node.
	 * @return The height of the subtree rooted at this node.
	 */
	public int getHeight() {
		return getHeight(this);
	}
	
	private int getHeight(BinaryNode node) {
		int height = 0;
		if(node != null)
			height = 1 + Math.max(getHeight(node.getLeftChild()), getHeight(node.getRightChild()));
		return height;
	}
	
	/**
	 * Copies the subtree rooted at this node.
	 * @return The root of a copy of the subtree rooted at this node.
	 */
	public BinaryNode copy() {
		BinaryNode newRoot = new BinaryNode(data);
		if(leftChild != null)
			newRoot.setLeftChild(leftChild.copy());
		if(rightChild != null)
			newRoot.setRightChild(rightChild.copy());
		return newRoot;
	}

}
