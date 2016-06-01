package br.com.robertodebarba.binarytree;

public class BinarySearchTree<T extends Comparable<T>> extends AbstractBinaryTree<T> {

	public void insert(final T info) {
		final BinaryTreeNode<T> newNode = new BinaryTreeNode<>(info);

		if (super.root == null) {
			super.root = newNode;
		} else {
			BinaryTreeNode<T> p = super.root;

			while (true) {
				final BinaryTreeNode<T> parent = p;
				if (info.compareTo(p.getInfo()) < 0) {
					p = parent.getLeft();

					if (p == null) {
						parent.setLeft(newNode);
						break;
					}
				} else {
					p = parent.getRight();

					if (p == null) {
						parent.setRight(newNode);
						break;
					}
				}
			}
		}
	}

	public BinaryTreeNode<T> find(final T info) {
		BinaryTreeNode<T> p = super.root;

		while (p != null && !p.getInfo().equals(info)) {
			if (info.compareTo(p.getInfo()) < 0) {
				p = p.getLeft();
			} else {
				p = p.getRight();
			}
		}

		return p;
	}

	public BinaryTreeNode<T> findRecursively(final T info) {
		return this.findRecursively(info, super.root);
	}

	private BinaryTreeNode<T> findRecursively(final T info, final BinaryTreeNode<T> no) {
		if (no == null) {
			return null;
		}

		if (info == no.getInfo()) {
			return no;
		} else {
			if (info.compareTo(no.getInfo()) < 0) {
				return this.findRecursively(info, no.getLeft());
			} else {
				return this.findRecursively(info, no.getRight());
			}
		}
	}

	public void remove(final T info) {
		// Find -------------------------------
		boolean leftChild = false;

		BinaryTreeNode<T> p = this.root;
		BinaryTreeNode<T> parent = null;

		while (p != null && !p.getInfo().equals(info)) {
			parent = p;
			if (info.compareTo(p.getInfo()) < 0) {
				leftChild = true;
				p = p.getLeft();
			} else {
				leftChild = false;
				p = p.getRight();
			}
		}

		if (p != null) {
			final int childsCount = this.countChilds(p);

			// remove leaf ------------------------------
			if (childsCount == 0) {
				if (p == this.root) {
					this.root = null;
				} else {
					if (leftChild) {
						parent.setLeft(null);
					} else {
						parent.setRight(null);
					}
				}
			}

			// Remove when has 1 child -----------------------
			if (childsCount == 1) {
				if (p.getRight() == null) {
					if (p == this.root) {
						this.root = p.getLeft();
					} else {
						if (leftChild) {
							parent.setLeft(p.getLeft());
						} else {
							parent.setRight(p.getLeft());
						}
					}
				} else if (p.getLeft() == null) {
					if (p == this.root) {
						this.root = p.getRight();
					} else {
						if (leftChild) {
							parent.setLeft(p.getRight());
						} else {
							parent.setRight(p.getRight());
						}
					}
				}
			}

			// Remove when has 2 childs -----------------------
			if (childsCount == 2) {
				final BinaryTreeNode<T> successor = getSuccessor(p);

				if (p == root) {
					root = successor;
				} else {
					if (leftChild) {
						parent.setLeft(successor);
					} else {
						parent.setRight(successor);
					}
				}

				successor.setLeft(p.getLeft());
			}
		}

	}

	private int countChilds(final BinaryTreeNode<T> node) {
		int result = 0;
		if (node.getLeft() != null) {
			result++;
		}
		if (node.getRight() != null) {
			result++;
		}
		return result;
	}

	private BinaryTreeNode<T> getSuccessor(final BinaryTreeNode<T> excludeNode) {
		BinaryTreeNode<T> p = excludeNode.getRight();
		BinaryTreeNode<T> successorParent = excludeNode;
		BinaryTreeNode<T> successor = excludeNode;

		while (p != null) {
			successorParent = successor;
			successor = p;
			p = p.getLeft();
		}

		if (successor != excludeNode.getRight()) {
			successorParent.setLeft(successor.getRight());
			successor.setRight(excludeNode.getRight());
		}

		return successor;
	}

}
