import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Sorter {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    String s = in.nextLine();

    for(String num: s.split(" ")) {
      a.add(Integer.parseInt(num));
    }
    for(int i = 0; i < a.size(); i += 1) {
      System.out.print(a.get(i));
      if(i < a.size() - 1) { System.out.print(" "); }
    }
    System.out.println();
  }
}
