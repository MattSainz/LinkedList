package may.projects.three;

/**
 * Created by Matthias on 10/24/16.
 *
 */

class Node {

    private Node next;
    private String description;
    private int dueDate;

    Node(){
        description = "";
        dueDate = 0;
        next = null;
    }

    Node(String description, int dueDate){
        this.description = description;
        this.dueDate = dueDate;
        next = null;
    }

    Node(String description, int dueDate, Node next){
        this.description = description;
        this.dueDate = dueDate;
        this.next = next;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
