/**
 * Tester program for the Stack class.
 * Do not modify the code in this class.
 * 
 * @author Michael Ida
 *
 */
public class StackTester {

	public static void main(String[] args) {
		
		Stack testStack = new Stack();
		int stackSize = testStack.getSize();
		if (stackSize == 0) {
			System.out.println("Correct initialization.");
		} else {
			System.out.println("Incorrect initialization.");
		}
		
		System.out.println("\nAdding some values...");
		testStack.push("Alice");
		testStack.push("Bob");
		testStack.push("Cathy");
		testStack.push("Dave");
		testStack.push("Emma");
		testStack.push("Fred");
		System.out.println("Stack contents:");
		System.out.println(testStack.toString());
		System.out.println("Should be:\nFred\nEmma\nDave\nCathy\nBob\nAlice");
		stackSize = testStack.getSize();
		if (stackSize == 6) {
			System.out.println("Correct size check.");
		} else {
			System.out.println("Incorrect size check.");
		}
		
		System.out.println("\nRemoving values...");
		String topValue = testStack.pop();
		stackSize = testStack.getSize();
		if (topValue.equals("Fred") && stackSize == 5) {
			System.out.println("Item successfully removed.");
		} else {
			System.out.println("Item unsuccessfully removed.");
		}
		System.out.println("Stack contents:");
		System.out.println(testStack.toString());
		System.out.println("Should be:\nEmma\nDave\nCathy\nBob\nAlice");
	}
}
