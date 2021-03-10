public class tree { 
  String treeName;
  String treeType;
  boolean leavesFall;
  String leafColor;

  public class tree() { //default
    treeName = "";
    treeType = 0;
    leavesFall = false;
    leafColor = "";
  }

  public class tree(String setTreeName, String  setTreeType, boolean setLeavesFall, String setLeafColor) { //specific constructor
    treeName = setTreeName;
    treeType = setTreeType;
    leavesFall = setLeavesFall;
    leafColor = setLeafColor;
  }

//Mutator methods
  public void setName(String newName) {
    treeName = newName;
  }
  public void setType(String newType) {
    treeType = newType;
  }
  public void setFall(boolean newFall) {
    leavesFall = newFall;
  }
  public void setColor(String newColor) {
    leafColor = newColor;
  }

//Accessor methods
  public String getName() {
    return treeName;
  }
  public String getType() {
    return treeType;
  }
  public boolean getFall() {
    return leavesFall;
  }
  public String getColor() {
    return leafColor;
  }

//print method
void print() {
if(leavesFall = true) {
  System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and it's leaves are currently " + leafColor + ". It does lose its leaves for the winter.")
}
else{
  System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and it's leaves are currently " + leafColor + ". It does not lose its leaves for the winter.")
}
}
}