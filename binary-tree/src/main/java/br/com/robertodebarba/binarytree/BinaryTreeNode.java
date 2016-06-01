package br.com.robertodebarba.binarytree;

public class BinaryTreeNode<T> {

	private final T info;
	private BinaryTreeNode<T> right;
	private BinaryTreeNode<T> left;

	public BinaryTreeNode(final T info) {
		this.info = info;
	}

	public BinaryTreeNode(final T info, final BinaryTreeNode<T> left, final BinaryTreeNode<T> rigth) {
		this.info = info;
		this.right = rigth;
		this.left = left;
	}

	public T getInfo() {
		return info;
	}

	public BinaryTreeNode<T> getRight() {
		return right;
	}

	public BinaryTreeNode<T> getLeft() {
		return left;
	}

	public void setRight(final BinaryTreeNode<T> right) {
		this.right = right;
	}

	public void setLeft(final BinaryTreeNode<T> left) {
		this.left = left;
	}

	@Override
	public String toString() {
		return String.format("%s <%s,%s>", this.info, this.left, this.right);
	}

}
