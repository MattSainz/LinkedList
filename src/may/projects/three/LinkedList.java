package may.projects.three;

/**
 * Created by May on 10/24/16.
 *
 */
public class LinkedList {

    private Node head = null;

    /*
     * No args constructor initializes head of the list
     */
    public LinkedList(){
        head = new Node();
        head.setDueDate(-1);
    }

    /*
     * Takes node elements and constructs new node ot insert into list
     * also keeps track of new elements in the list
     */
    public void addNode(String description, int dueDate){
        addNode(new Node(description, dueDate));
    }

    /*
     * Inserts a new node into the list smallest due date first
     */
    private void addNode(Node newNode){
       if(head.getNext() == null){
           //Empty list
           head.setNext(newNode);
       }else{
          Node iterator = head;

          while (iterator.getNext() != null && iterator.getNext().getDueDate() < newNode.getDueDate()){
              //move to the correct insertion point
             iterator = iterator.getNext();
          }

          newNode.setNext(iterator.getNext());
          iterator.setNext(newNode);
           //insert the new node
       }
    }

    /*
     * Removes a node from the list by index position
     * returns true of element was successfully removed
     */
    public boolean removeNode(int idx){
       if(idx < 0) return false;

       Node iterator = head;

       int i = 0;
       while(iterator.getNext() != null && i < idx){
           iterator = iterator.getNext();
           i++;
       }

       if(iterator.getNext() == null){
           //end of list
           iterator.setNext(null);
           return true;
       }

       iterator.setNext(iterator.getNext().getNext());
       return true;
    }

    /*
     * prints the list
     */
    public String display(){
        Node iterator = head;
        String toRet = "";
        while (iterator.getNext() != null ){
            toRet +=
                    iterator.getNext().getDescription() + " due the " +
                    iterator.getNext().getDueDate() + " \n";

            iterator = iterator.getNext();
        }
        return toRet;
    }

    /*
     * Returns the assingment due the soonest
     */
    public String findSoonest(){
        if(head.getNext() == null) return "Empty list";
        return head.getNext().getDueDate() + ":" + head.getNext().getDescription() + " ";
    }
}
