package AgencyManagment.Helper;

import java.awt.*;

public class Helper {
    public static int screenCenterPoint(String axis, Dimension size){
        int point=0;
        switch (axis){
            case "x":
                point=(Toolkit.getDefaultToolkit().getScreenSize().width-size.width)/2;
                break;
            case "y":
                point=(Toolkit.getDefaultToolkit().getScreenSize().height- size.height)/2;
                break;
            default:
                point=0;
        }
        return point;
    }
}
