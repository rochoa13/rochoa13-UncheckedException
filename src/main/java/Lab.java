
public class Lab {
    /**
     * This method must throw an unchecked exception.
     * unchecked means that you do not need to wrap the method in a try/catch or a throws declaration.
     * Unchecked exceptions may include situations like arithmetic errors like dividing by zero,
     * accessing an index of an array which is out of bounds, stack overflow (result of infinite recursion), etc.
     *
     * For this challenge, I recommend creatively causing such an exception rather than using the 'throws' keyword,
     * which would also work since RuntimeExceptions are still technically Exceptions.
     *
     * You could view the entire Exception family here: https://programming.guide/java/list-of-java-exceptions.html
     * Notice that errors are separate from exceptions. Errors are external to Java and can occur when some external
     * event happens, like running out of computer memory.
     */
    public void throwUncheckedException(){
        int arr[] = {0,1,2,3,4}; // declaring an array variable with 5 elements
        System.out.println(arr[6]); // attempting to print out a nonexistent 6th element of the arr array
    }
}
