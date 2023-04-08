
package graduationprojects;

public class TreeNode{
    
    private int year =0;
    DLL_Category categoryOne =new DLL_Category();
    DLL_Category categoryTwo= new DLL_Category();
      TreeNode  right =null;
      TreeNode left = null;
    
   
    
    public TreeNode() {
     
    }
    
      public TreeNode(int y) 
      {
         
        this.year=y;

      }
    public int getYear() {
        return year;
    }

    public TreeNode getRight() {
     
        return  right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    
    public void setYear(int year) {
        this.year = year;
    }

    public void setCategoryOne(DLL_Category categoryOne) {
        this.categoryOne = categoryOne;
    }

    public void setCategoryTwo(DLL_Category categoryTwo) {
        this.categoryTwo = categoryTwo;
    }

    public DLL_Category getCategoryOne() {
        return categoryOne;
    }

    public DLL_Category getCategoryTwo() {
        return categoryTwo;
    }
    
    

    @Override
    public String toString() {
        return  "year=" + year;
    }
    
    
 
    
}
