//--------------------------------------------------------------------
//
//  Laboratory 5                                        AStack.jshl
//
//  Definitions for the array implementation of the Stack ADT
//
//  The student is to complete all missing or incomplete method 
//     implementations for this class
//
//--------------------------------------------------------------------


class AStack implements Stack    // Array based stack class
{
    // Data members
    private int top = 0;               // Index for the top element
    private Object[] element;     // Array containing stack elements


    // Constructors
    public AStack()                     // Constructor: default size
    {
        setup(DEF_MAX_STACK_SIZE);
    }


    public AStack(int size)              // Constructor: specific size
    {
        setup(size);
    }


    // Class methods
    private void setup(int size)         // Called by Constructors only
    {
        element = new Object[size];
    }

    // --- Complete these method implementations for the interface Stack  --- //


    // Stack manipulation operations
    public void push(Object newElement)     // Push Object onto stack
    {
        // make sure newElement isn't null and stack isn't full
        if(newElement == null){
            System.out.println("Element is null -- added nothing to the stack");
            return;
        }
        if(isFull()){
            System.out.println("Stack is full -- added nothing to the stack");
            return;
        }

        element[top]=newElement;
        System.out.printf("At location %d, we have element %s\n", top, String.valueOf(element[top]));
        top++;



    }


    public Object pop()                // Pop Object from top of stack
    {
        // make sure stack isn't empty
        Object toReturn =new Object();
        if(isEmpty()){
            System.out.println("Empty stack -- removed nothing from stack");
            return null;
        }
        // add code here to remove an element from the top of the stack and
        // return its value
        toReturn= element[top];
        top --;
        return toReturn;
    }


    @Override
    public void clear() {
        top = 0;
    }


    @Override
    public boolean isEmpty() {
        if(top == 0) return true;
        else return false;
    }


    @Override
    public boolean isFull() {
        if(top == element.length ) return true;
        else return false;
    }

    // --- Define remaining methods for the interface Stack here --- //


    public void showStructure()
    // Array implementation. Outputs the elements in a stack. If the
    // stack is empty, outputs "Empty stack". This operation is intended
    // for testing and debugging purposes only.
    {
        int j;   // Loop counter

        if(isEmpty()) System.out.println("Stack is empty");
        else{
            System.out.print("top = ");
            System.out.println(top);
            for(j = 0; j < element.length; j++)
                System.out.print(j + "\t");
            System.out.println();
            for(j = 0; j < top; j++){
                System.out.print(element[j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    } // showStructure for AStack

} // class AStack
