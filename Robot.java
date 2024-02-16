public class Robot {
  private int id;
  private String name;
  private static int total;
  public Robot(String name) {
    this.name = name;
    total++;
    this.id = total;
  }
  public void introduce() {
    System.out.println(id + name);
  }
  public static int getTotal() {
    return total;
  }
}

Robot r1 = new Robot(" A");
Robot r2 = new Robot(" B");
Robot r3 = new Robot(" C");
r2.introduce();
System.out.println(Robot.getTotal());