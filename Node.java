
package graduationprojects;

/**
 *
 * @author WAE9BGRY
 */
public class Node {

    
//    private String data;
    private Project p; //this is where we will store the data( project object)
    private Node next ;
    private Node prev;

    public Node() {
        p=new Project();
        next = null;
        prev=null;
    }

    public Node(Project p) {
        this.p = p;
        next = null; 
        prev=null;
    }
    

    public void setProject(Project p) {
        this.p = p;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Project getProject() {
        return p;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

      

}
