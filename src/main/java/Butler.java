import org.apache.commons.collections.ListUtils;
import java.util.ArrayList;

public class Butler {

    public void welcome() {

        // https://app.snyk.io/vuln/SNYK-JAVA-COMMONSCOLLECTIONS-472711
        // Should appear as Potentially Reachable
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Hello");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("World");

        System.out.println(ListUtils.union(list1, list2));
    }

    // public static void main(String[] args) {
    //     Butler butler = new Butler();
    //     butler.welcome();
    // }
}
