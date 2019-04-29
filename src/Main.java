import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
          List<String> list = new ArrayList<String>();
          List<String> list1 = new ArrayList<String>();
      /*    list.add("12");
          list.add("33");
          list.add("44");
          list.add("55");
        list = null;*/
          list1.add("aa");
          list1.add("qq");
          list1.add("ww");

          list.addAll(list1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

    }
}
