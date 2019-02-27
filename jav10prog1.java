import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
   
      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      Set<Integer> integers = Set.copyOf(list);
      System.out.println(integers);
  }

    }

