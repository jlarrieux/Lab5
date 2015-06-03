//--------------------------------------------------------------------
//
//  Laboratory 5                                       StackNode.jshl
//
//  Class definition for a linked list implementation
//  
//  The student is to complete all missing or incomplete method 
//     implementations for this class
//
//--------------------------------------------------------------------


//Facilitator class for the Stack class
class StackNode                     // A singly linked list node
{
    // Data members
    private Object element;           // Object for this node
    private StackNode next;           // Reference to next node in list


    // because there are no access labels (public, private or protected),
    // access is limited to the package where these methods are declared
    StackNode(Object newElement, StackNode nextval) // Constructor
    {
        this.element = newElement;
        setNext(nextval);
    }


    // Class methods
    // Other classes in this package need to know about next and element
    // or set next
    StackNode getNext()                  // Returns reference to next node
    {
        return next;
    }


    void setNext(StackNode nextVal)     // Sets value of next
    {
        next = nextVal;
    }


    Object getElement()                  // Returns element's value
    {
        return element;
    }

} // class StackNode
