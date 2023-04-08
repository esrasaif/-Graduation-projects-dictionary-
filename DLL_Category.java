package graduationprojects;

public class DLL_Category {

    private String category;
    private Node head;
    private Node tail;
    private int size;

    public DLL_Category() {
        head = new Node();
        tail = new Node();
        head.setNext(tail);
        tail.setPrev(head);
        size = 0;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public String getCategory() {
        return category;
    }

    public Node traversal(String projectName) {
        Node savenode = tail;
        Node traversal = head.getNext();

        while (traversal != tail) {
            if (projectName == traversal.getProject().getProjectName()) {
                savenode = traversal;
                break;
            } else {
                traversal = traversal.getNext();
            }
        }
        return savenode;
    }

    void addAfter(Node p, Project obj) {/////////////////////////////////////////////////////////////

        Node successor = p.getNext();
        Node newest = new Node(obj);
        newest.setNext(successor);
        newest.setPrev(p);
        p.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    void addFirs(Project value) {
        addAfter(head, value);
    }

    public void addBefore(Node f, Project value) {//////////////////////////////////////////////////////////////
        if (size == 0) {
            addFirs(value);
        } else {
            Node pre = f.getPrev();
            Node newest = new Node(value);
            newest.setNext(f);
            newest.setPrev(pre);
            f.setPrev(newest);
            pre.setNext(newest);
            size++;
        }
    }

    public void addlast(Project data) {///////////////////////////////////////////////////////////////////////////////////
        addBefore(tail, data);
    }

    public void print() {
        Node c = head.getNext();
        while (c != tail) {
            System.out.print(c.getProject().toString());
            c = c.getNext();
        }
        System.out.println();

    }
    
    public void printpreview()
    {
        Node c = head.getNext();
        while (c != tail) 
        {
            System.out.printf("Project name:%8s\nDepartment:%8s\nYear:%8d\nDescribrion:%8s\n",c.getProject().getProjectName(),c.getProject().getDepartment(),c.getProject().getYear(),c.getProject().getDescribrion());
            c = c.getNext();
            System.out.println("-----------------------------------------------------");
        }
        System.out.println();
    }
}//end class
   
//search Category method 
//    public boolean searchCategorye(DLL_Category n, String e) {
//        if (n == null) {
//            return false;
//        } else if (e == n.getCategory()) {
//            return true;
//        }else if (e != n.getCategory()) {
//            return true;
//        }
//        return false;
//    }//end
//}