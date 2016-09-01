import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzyuemeng1 on 2016/8/30.
 */
public class TestList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("trhree");
        list.add("Four");
        for (String str:
             list) {
            System.out.println(str);
        }

    }
}
