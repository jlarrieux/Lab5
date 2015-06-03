//--------------------------------------------------------------------
//
//  Laboratory 5, In-lab Exercise 1                    AStackDwn.jshl
//
//  Class definition for the array implementation of the Stack ADT
//  that grows from the end of the array downward toward the
//  beginning
//
//  The student is to complete all missing or incomplete method 
//     implementations for this class
//
//--------------------------------------------------------------------


class AStackDwn implements Stack    // Array based stack class
{
    // Data members
    private int top;               // Index for the top element
    private Object[] element;     // Array containing stack elements


    // Constructors
    public AStackDwn()                 // Default constructor
    {
    }


    public AStackDwn(int sz)           // Construct stack of specific size
    {
    }


    // Class methods
    private void setup(int sz)         // Called by Constructors only
    {
    }

    //--- Complete these method implementations for the interface Stack  ---//


    //Stack manipulation operations
    public void push(Object newElement)     // Push Object onto stack
    {
        // make sure newElement isn't null and stack isn't full
        if(newElement == null){
            System.out.println("Element is null -- added nothing to the stack"); return;
        } if(isFull()){
        System.out.println("Stack is full -- added nothing to the stack"); return;
    }
        // add code here to add an element to the top of the stack


    }


    public Object pop()                   // Pop Object from top of stack
    {
        // make sure stack isn't empty
        if(isEmpty()){
            System.out.println("Empty stack -- removed nothing from stack"); return null;
        }
        // add code here to remove an element from the top of the stack and
        // return its value


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

    // --- Define remaining methods for the interface Stack here --- //


    public void showStructure()
    // "Downward" array implementation. Outputs the elements in a stack.
    // If the stack is empty, outputs "Empty stack". This operation is
    // intended for testing and debugging purposes only.
    {
        int j;   // Loop counter

        if(isEmpty()) System.out.println("Stack is empty");
        else{
            System.out.print("top = "); System.out.println(top); for(j = 0; j < element.length; j++)
                System.out.print(j + "\t"); System.out.println(); for(j = 0; j < element.length; j++){
                if(j < top) System.out.print("\t");
                else System.out.print(element[j] + "\t");
            } System.out.println();
        }
    } // showStructure for AStackDwn

} // class AStackDwn
