package graduationprojects;

import java.util.InputMismatchException;

public class Tree {

    TreeNode root = null;
    int size = 0;

    public Tree() {

    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int searchYear(int key) {
        if (root == null) //check if trre is empty
        {
            return 0;
        } else //tree is not empty
        {

            TreeNode c = root;        //it works as counter 
            while (c != null) {
                if (key == c.getYear()) {
                    //System.out.println("found"+c.data);
                    return c.getYear();

                } else {
                    if (key < c.getYear()) {
                        c = c.getLeft();
                    } else {
                        c = c.getRight();
                    }

                }

            }//end loop

        }
        return 0;
    }//end search      

    //adding method
    public void insertYear(int d) {
        TreeNode newest = new TreeNode(d);
        if (root == null) {
            root = newest;
            size++;
        } else {
            TreeNode c = root;
            TreeNode g = null;

            while (c != null) {
                g = c;
                if (d < c.getYear()) {
                    c = c.getLeft();
                } else {
                    c = c.getRight();
                }

            }

            if (d < g.getYear()) {

                g.left = newest;
                size++;
            } else {
                g.right = newest;
                size++;
            }
        }

    }//end adding method

//print method
    public void printInOrderYears(TreeNode r) {//print all project
        TreeNode n = r;
        if (n.getLeft() != null) {
            printInOrderYears(n.getLeft());
        }
        System.out.printf("------------    projects in year %d    ------------\n", n.getYear());
        System.out.println("----- " + n.getCategoryOne().getCategory() + " Projects -----");
        n.getCategoryOne().printpreview();
        System.out.println("----- " + n.getCategoryTwo().getCategory() + " Projects -----");
        n.getCategoryTwo().printpreview();
        if (n.getRight() != null) {
            printInOrderYears(n.getRight());
        }

    }//end print method

    
    public void printProjectsInYear(TreeNode c, int y) {//print all project in specific year
        boolean flag = false;
        if (c == null) {//root==null?
            System.out.println("Tree is empty");
        } else {//root!=null
            //If year is found in the given tree then, set the flag to true  
            if (c.getYear() == y) {
                flag = true;
                System.out.printf("------------    projects in year %d    ------------\n", y);
                System.out.println("----- " + c.getCategoryOne().getCategory() + " Projects -----\n");
                c.getCategoryOne().printpreview();
                System.out.println("----- " + c.getCategoryTwo().getCategory() + " Projects -----\n");
                c.getCategoryTwo().printpreview();
            }
            //Search in left subtree  
            if (flag == false && c.getLeft() != null) {
                printProjectsInYear(c.getLeft(), y);
            }
            //Search in right subtree  
            if (flag == false && c.getRight() != null) {
                printProjectsInYear(c.getRight(), y);
            }

        }
    }//end method

    
    
    //search Category in node method 
    public void searchN(TreeNode p ,int data, String e) {
        
        if (p == null) {
          return;
        } 
        else 
        {
            if (data == p.getYear()) 
            {              
                if (p.getCategoryOne().getCategory().equals(e))
                p.getCategoryOne().printpreview();  //  printProjectsInYear(p,data);
                else if (p.getCategoryTwo().getCategory().equals(e) )
                   p.getCategoryTwo().printpreview(); // printProjectsInYear(p,data);
                else
                    throw new InputMismatchException (" this category is not found, try again ");
                
                    
             }
            else if(data != p.getYear())   
                 {searchN(p.getLeft(),data,e) ;}
                
                else
               { searchN(p.getRight(),data,e) ;}
            
            
        }//end outer else
    }//end‏
    
    
//   //search Category in node method 
//    public void searchN(TreeNode p ,int data){
//        if ( p == null){
//            return ;
//        }else{
//            if (data == p.getYear()){
//                
//                r.searchCategorye(p.getCategoryOne(), null);
//                r.searchCategorye(p.getCategoryTwo(), null);
//                return true;
//            }else if (data < p.getYear())
//                return searchN(p.getLeft(), data);
//            else
//                return searchN(p.getRight(), data);
//        }
    }//end

