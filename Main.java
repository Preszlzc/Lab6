class Main {
 public static void main(String[] args) {
   tree tree1 = new tree();
   tree tree2 = new tree("maple", "broadleaf", true, "red");
   tree1.print();
   tree2.print();

   tree2.setName("spruce");
   tree2.setType("conifer");
   tree2.setFall(false);
   tree2.setColor("");
   tree2.print();
 }
}