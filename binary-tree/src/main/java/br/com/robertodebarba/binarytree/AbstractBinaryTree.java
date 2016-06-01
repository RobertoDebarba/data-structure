package br.com.robertodebarba.binarytree;

public abstract class AbstractBinaryTree<T> {

	protected BinaryTreeNode<T> root;

	protected void setRoot(final BinaryTreeNode<T> root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return this.root == null;
	}

	public boolean contains(final T info) {
		return this.contains(info, this.root);
	}

	private boolean contains(final T info, final BinaryTreeNode<T> node) {
		if (node == null) {
			return false;
		}

		if (node.getInfo().equals(info)) {
			return true;
		}

		return this.contains(info, node.getLeft()) || this.contains(info, node.getRight());
	}

	@Override
	public String toString() {
		return this.toString(this.root);
	}

	private String toString(final BinaryTreeNode<T> node) {
		if (node == null) {
			return "";
		}

		return String.format("%s <%s,%s>", node.getInfo(), this.toString(node.getLeft()),
				this.toString(node.getRight()));
	}

	public int calcularFolhas() {
		return this.countLeaves(this.root);
	}

	private int countLeaves(final BinaryTreeNode<T> no) {
		if (no == null) {
			return 0;
		}

		if (no.getLeft() == null && no.getRight() == null) {
			return 1;
		}

		return this.countLeaves(no.getLeft()) + this.countLeaves(no.getRight());
	}

}
