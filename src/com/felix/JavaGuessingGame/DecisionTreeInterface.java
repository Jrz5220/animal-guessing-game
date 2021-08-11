package com.felix.JavaGuessingGame;

/**
 * An interface that specifies operations of a binary decision tree.
 * @author felix lazo
 * @param <T> The type of data in the node of the tree.
 */
public interface DecisionTreeInterface<T> {
	
	/** Sets the data in the root of this binary tree.
	 * @param rootData The object that is the data for the tree's root.
	 */
	public void setRootData(T rootData);
	
	/** Gets the data in the root node.
	 * @return The data object in the root node, or null if the root node is null.
	 */
	public T getRootData();
	
	/** Gets the height of this binary tree.
	 * @return The number of levels in this binary tree.
	 */
	public int getHeight();
	
	/** Gets the number of nodes in this binary tree.
	 * @return The number of nodes within this binary tree.
	 */
	public int getNumberOfNodes();
	
	/** Gets the data in the current node.
	 * @return The data object in the current node, or null if the current node is null.
	 */
	public T getCurrentData();
	
	/** Sets the data in the current node.
	 * @param newData The new data object.
	 */
	public void setCurrentData(T newData);
	
	/** Sets the data in the children of the current node, creating them if they do not exist.
	 * @param responseForNo The new data object for the left child.
	 * @param responseForYes The new data object for the right child.
	 */
	public void setResponses(T responseForNo, T reponseForYes);
	
	/** Sees whether the current node contains an answer.
	 * @return True if the current node is a leaf, false if it is a nonleaf.
	 */
	public boolean isAnswer();
	
	/** Sets the current node to its left child.
	 * If the child does not exist, sets the current node to null.
	 */
	public void advanceToNo();
	
	/** Sets the current node to its right child.
	 * If the child does not exist, sets the current node to null.
	 */
	public void advanceToYes();
	
	/** Sets the current node to the root of the tree. */
	public void resetCurrentNode();
	
	/** Checks to see if this binary tree contains any nodes.
	 * @return True if the root node of this tree is null, false if not.
	 */
	public boolean isEmpty();
	
	/** Sets the root node of this binary tree to null. */
	public void clear();

}
