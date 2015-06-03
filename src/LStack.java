//--------------------------------------------------------------------
//
//  Laboratory 5                                        LStack.jshl
//
//  Definitions for the Linked List implementation of the Stack ADT
//
//  The student is to complete all missing or incomplete method 
//     implementations for this class
//
//--------------------------------------------------------------------


class LStack implements Stack           // Linked stack class
{
    // Data member
    private StackNode top;               // Reference to top of stack


    // Constructors and helper method setup
    public LStack()                    // Default Constructor1
    {
        setup();
    }


    public LStack(int size)             // Constructor2: ignore size
    // for compatibility with AStack
    {
        System.out.printf("No size limit, size of %d will be ignored!", size);
        setup();
    }


    // In-lab2 operation
    // Creates a duplicate copy of valueStack
    LStack(LStack valueStack)          // Copy constructor
    {
    }


    // Class Methods
    private void setup()               // Called by Constructors only
    {
        top = null;
    }

    // Insert method clone( ) here

    //----- Insert method implementations for the interface Stack here -----//


    @Override
    public void push(Object newElement) {
        if(top==null) {

            top.setNext(null);
        }
        else {
            top.setNext(top);

        }
        top = new StackNode(new Character(String.valueOf(newElement).charAt(0)), top);
    }


    @Override
    public Object pop() {
        Object obj = top.getElement();
        top = top.getNext();
        return obj;
    }


    @Override
    public void clear() {

    }


    @Override
    public boolean isEmpty() {
        return false;
    }


    @Override
    public boolean isFull() {
        return false;
    }


    public void showStructure()
    // Linked list implementation. Outputs the elements in a stack. If
    // the stack is empty, outputs "Empty stack". This operation is
    // intended for testing and debugging purposes only.
    {
        StackNode p;                        // Iterates through the stack

        if(isEmpty()) System.out.println("Stack is empty");
        else{
            System.out.print("top \n");
            for(p = top; p != null; p = p.getNext())
                System.out.print(p.getElement() + " \n");
            System.out.println("bottom");
        }
    } // showStructure for LStack

} // class LStack
