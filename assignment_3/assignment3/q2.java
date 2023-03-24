//Question#2

import java.util.ArrayList;

public class q2 {
    public static Integer max(ArrayList<Integer> list) {
        if ((list.isEmpty() == true) || (list.size() == 0))
            return null;
        else {
            int maximum = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > maximum)
                    maximum = list.get(i);
            }
            return maximum;
        }
    }
}