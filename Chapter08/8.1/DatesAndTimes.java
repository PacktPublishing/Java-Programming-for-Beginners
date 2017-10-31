package DatesAndTimes;

import java.util.*;

public class DatesAndTimes {
    Calendar now = Calendar.getInstance();
    
    now.setTimeInMillis(0);
    
    System.out.println(now.get(Calendar.MONTH) + 1);
    System.out.println(now.get(Calendar.DAY_OF_MONTH));
    System.out.println(now.get(Calendar.YEAR));
}
