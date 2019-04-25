
import javax.swing.JOptionPane;

/*




 */
public class LListMenusPlus {
/*********************************************************************
***  Class Name:  LListMenusPlus
***  Class Author:  Lee Douglas
**********************************************************************
*** Purpose of the class: instantiates a root node and uses it in  
*** developing methods for adding to and removing from the linked list
**********************************************************************
*** Date: Dec 2016
**********************************************************************
*** List of changes with dates: all Dec editions
**********************************************************************/
        
    // Counter declared that will help to count the number of operations
    private int count = 0;

    // need a root node, the root node has a value of zero (until initialized)
    private newNode root;
    // the root node points to null (2)when a node is added, it is given a value and the previous node points to it (3)another node will also point to the root node (4)the second node (.next) will point to the second node (4)the subsequent node (.next) will point to every subsequent node

  
    public int removeNode(int removedNum){
    /******************************************************
    ***  Method Name: removeNode
    ***  Method Author : Lee Douglas
    ******************************************************
    *** Purpose of the Method: removes a new node into list
    *** Method Inputs: all short & regular integers
    *** Return value:  n/a
    ******************************************************
    *** Date:  Sep - Dec 2016
    ******************************************************/
      /*
      to remove a node we look at the value of the node, if it is equal to what we are looking for have a temporary node equal to that one have the temporary node.next point to null once that part is taken care of have the node.next before that one point *distracted* point the next to the one that was previously there (make sure that you get that value before the .next is pointed to null, then 
      */
        count=0;
        newNode currentNode = root;                    // search for link
        newNode prevNode = root;
        while(currentNode.value != removedNum){
            if(currentNode.nextLL == null){
                currentNode.emptyMessage();
                return -1;                             // didn't find it
            }else{
                prevNode = currentNode;                // go to next link
                currentNode = currentNode.nextLL;
            }count++;
        } // found it
        if(currentNode == root){                        // if root link,
            root = root.nextLL;                        // change root
            count++;
        }
        else{ // otherwise,
            prevNode.nextLL = currentNode.nextLL;      // bypass it
            count++;
        }return currentNode.value;
    } 
    
    // printing the nodes requires the printer to see the value of the node and 
    // the node that follows it in sequential order    
    public String displayList(){
    /******************************************************
    ***  Method Name: displayList
    ***  Method Author : Lee Douglas
    ******************************************************
    *** Purpose of the Method: prints the linked list
    *** Method Inputs: n/a
    *** Return value: string of numbers representing the list
    ******************************************************
    *** Date:  Sep - Dec 2016
    ******************************************************/                       // display the list
        String toPrint = "";
        newNode printList = root;                      // start at beginning of list
        while(printList != null)                       // until end of list,
        {
            toPrint += printList.value;                //print currentNode value
            if(printList.nextLL !=null){              
            toPrint += (", ");}                         //formatting
            printList = printList.nextLL;               // move to next link
        }
        return toPrint;
    }    
       
    public void insertANode(int inserted){
    /******************************************************
    ***  Method Name: insertANode
    ***  Method Author : Lee Douglas
    ******************************************************
    *** Purpose of the Method: inserts a new node into list
    *** Method Inputs: all short & regular integers
    *** Return value:  n/a
    ******************************************************
    *** Date:  Sep - Dec 2016
    ******************************************************/
        count=0;
        newNode insertInto = new newNode(inserted);
        newNode currentNode = root;                    //iterates starting at root
        newNode prevNode = null;                       //points to the previous node
          
        while(currentNode != null && inserted >= currentNode.value){ // or inserted > current,
            prevNode = currentNode; 
            currentNode = currentNode.nextLL;          // go to next item
            count++;
        }
        if(prevNode==null){                            // at beginning of list
            root = insertInto;                         // first --> newLink
        }else if (inserted == prevNode.value){
            repeats();
            count -=1;
        }else // not at beginning  
            prevNode.nextLL = insertInto;              // old prev --> newLink
            insertInto.nextLL = currentNode;           // newLink --> old //current
            count++;
    } // end method insert
    
    public void repeats(){
    /******************************************************
    ***  Method Name: repeats
    ***  Method Author : Lee Douglas
    ******************************************************
    *** Purpose of the Method: finds the duplicate values 
    *** and simply does nothing, so the process simply 
    *** finishes and the number does not show
    *** Method Inputs: n/a
    *** Return value:  n/a
    ******************************************************
    *** Date:  Sep - Dec 2016
    ******************************************************/
    }//end method repeats
    
    public int giveCount(){
    /******************************************************
    ***  Method Name: giveCount
    ***  Method Author : Lee Douglas
    ******************************************************
    *** Purpose of the Method: returns comparison counts
    *** Method Inputs: n/a
    *** Return value: positive integer
    ******************************************************
    *** Date:  Nov 2016
    ******************************************************/
        return count;
    }
}//end Class
             