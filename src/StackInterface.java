/**
 * Interface to the Stack class which defines the methods that must
 * be implemented
 * 
 * @author Michael Ida
 *
 */
public interface StackInterface {

	/*
	 * Add a value to the top of the stack
	 */
	public void push(String newValue);
	
	/*
	 * Remove the top element in the stack and return its value
	 */
	public String pop();
	
	/*
	 * Return the number of elements in the stack
	 */
	public int getSize();
	
	/*
	 * Return a string containing the elements in the stack
	 * from top to bottom
	 */
	public String toString();
	
}
