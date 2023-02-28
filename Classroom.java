class Classroom{
  public static void main(String[] args) {
  
  Wilder student1 = new Wilder("Anthony", false);
  Wilder student2 = new Wilder("Jack", true);
  
  System.out.println(student1.whoAmI());
  System.out.println(student2.whoAmI());
}
}