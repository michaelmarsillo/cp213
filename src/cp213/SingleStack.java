package cp213;

/**
 * A single linked stack structure of <code>Node T</code> objects. Only the
 * <code>T</code> object contained in the stack is visible through the standard
 * stack methods. Extends the <code>SingleLink</code> class. Note that the rear
 * attribute should be ignored as the rear is not used in a stack.
 *
 * @author David Brown
 * @version 2024-09-01
 * @param <T> the SingleStack data type.
 */
public class SingleStack<T> extends SingleLink<T> {

    /**
     * Combines the contents of the left and right SingleStacks into the current
     * SingleStack. Moves nodes only - does not refer to objects in any way, or call
     * the high-level methods pop or push. left and right SingleStacks are empty
     * when done. Nodes are moved alternately from left and right to this
     * SingleStack.
     *
     * You have two source stacks named left and right. Move all nodes from these
     * two stacks to the current stack. It does not make a difference if the current
     * stack is empty or not, just get nodes from the right and left stacks and add
     * them to the current stack. You may use any appropriate SingleLink helper
     * methods available.
     *
     * Do not assume that both right and left stacks are of the same length.
     *
     * @param left  The first SingleStack to extract nodes from.
     * @param right The second SingleStack to extract nodes from.
     */
    public void combine(final SingleStack<T> left, final SingleStack<T> right) {

	// your code here
	while (left.front != null && right.front != null) {
	    this.moveFrontToFront(left);
	    this.moveFrontToFront(right);
	}

	while (left.front != null) {
	    this.moveFrontToFront(left);
	}

	while (right.front != null) {
	    this.moveFrontToFront(right);
	}

	return;
    }

    /**
     * Returns the top object of the stack and removes that object from the stack.
     * The next node in the stack becomes the new top node. Decrements the stack
     * length.
     *
     * @return The object at the top of the stack.
     */
    public T pop() {

	// your code here
	T value = this.front.getObject();

	this.front = this.front.getNext();
	this.length--;

	return value;
    }

    /**
     * Adds data to the top of the stack. Increments the stack length.
     *
     * @param object The object to add to the top of the stack.
     */
    public void push(final T object) {

	// your code here
	this.front = new SingleNode<T>(object, this.front);
	this.length++;

	return;
    }

    /**
     * Splits the contents of the current SingleStack into the left and right
     * SingleStacks. Moves nodes only - does not move object or call the high-level
     * methods insert or remove. this SingleStack is empty when done. Nodes are
     * moved alternately from this SingleStack to left and right. left and right may
     * already contain objects.
     *
     * This is the opposite of the combine method.
     *
     * @param left  The first SingleStack to move nodes to.
     * @param right The second SingleStack to move nodes to.
     */
    public void splitAlternate(final SingleStack<T> left, final SingleStack<T> right) {

	// your code here
	while (this.front != null) {
	    left.moveFrontToFront(this);
	    if (this.front != null) {
		right.moveFrontToFront(this);
	    }
	}

	return;
    }
}