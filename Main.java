public class Main {
  public static void main(String[] args) {
    int[] students = {86,64,64,64};
    int total = 0;
    for (int i = 0; i < students.length; i++) {
      total += students[i];
      }

    double average = (double)total / students.length;
    System.out.println("Average: " + average);
  }
}