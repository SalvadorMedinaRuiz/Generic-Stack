// ****************************************************************

// GenericStackTest.java
//
// A simple driver to test a generic stack.

//
// ****************************************************************

public class StackTest
{

	public static void main(String[] args)

	{
		// Declare and instantiate a stack
		GenericStack<Integer> stack = new GenericStack<>();
		GenericStack<Integer> reversedStack = new GenericStack<>();
		GenericStack<Integer> removedStack = new GenericStack<>();


		//push some stuff on the stack
		for (int i=0; i<10; i++) {
			stack.push(i);
		}		
		stack.push(5);
	
		// call printStack to print the stack
		System.out.println("The original stack is: ");
		print(stack);
		// call reverseStack to reverse the stack
		// save the stack returned from this call
		reversedStack = reverseStack(stack);
		// call printStack to print the reversed stack 
		System.out.println("The reversed stack is: ");
		print(reversedStack);
		// call removeElement to remove all occurrences of the value 5 
		// savw the stack returned from this call		
		removedStack = removeElement(stack, 5);
		// call printStack to print the original stack and the new stack.
		System.out.println("The original stack is: ");
		print(stack);
		System.out.println("The removed version of the stack is: ");
		print(removedStack);
	} 
	
	/* Prints the elements in stack s from top to bottom. 
	 * When printStack returns, s should be unchanged.
	 */
	public static <E> void print(GenericStack<E> s) {
		GenericStack<E> stackTest = new GenericStack<>();
		stackTest = s; //only refers to same id? not creates copy? BOTH IDs ARE 22???
		while (!stackTest.isEmpty()) {
				System.out.println(stackTest.pop());
		}
	}

	/* Returns a new stack whose elements are backwards from those in s. 
	 * Again, s is unchanged.
	 */
	public static <E> GenericStack<E> reverseStack(GenericStack<E> s) {
		GenericStack<E> stackTest2 = new GenericStack<>();
		stackTest2 = s;
		GenericStack<E> stackTest3 = new GenericStack<>();
		while (!stackTest2.isEmpty()) {
			stackTest3.push(stackTest2.pop());
		}
		return stackTest3;
	}

	/* Returns a new stack whose elements are the same as those in s 
	 * (and in the same order) except that all occurrences of val have been removed. 
	 * Again, s is unchanged. 
	 */
	public static <E> GenericStack<E> removeElement(GenericStack<E> s, int val) {
		GenericStack<E> stackTest4 = new GenericStack<>(); //for old stack
		stackTest4 = s;
		GenericStack<E> stackTest5 = new GenericStack<>(); //new stack
		int value = 0;
		while(!stackTest4.isEmpty()) { //wont this just reverse the string???? (YES FIX LATER)
			value = (int) stackTest4.pop();
			if(value!=val) {
			//stackTest5.push(value);	
			}
		}
		return stackTest5;
	}
}