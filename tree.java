public class tree { 
  String treeName;
  String treeType;
  boolean leavesFall;
  String leafColor;

  public tree() { //default
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  public tree(String setTreeName, String  setTreeType, boolean setLeavesFall, String setLeafColor) { //specific constructor
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
  String fall = (leavesFall = true) ? "It does lose its leaves for the winter." : "It does not lose its leaves for the winter."; //gave up. Can't get it to swap. All I feel is pain. Tried using fancy ternary operators. Feedback is appreciated.
  System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and it's leaves are currently " + leafColor + "." + fall);
}
}