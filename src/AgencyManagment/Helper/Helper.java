package AgencyManagment.Helper;

import javax.swing.*;
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
    public static void setLayout(){
        for(UIManager.LookAndFeelInfo info:UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                         UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
        }
    }
    public static boolean isFieldEmpty(JTextField textField){
        return textField.getText().trim().isEmpty();
    }
    public static void showMessage(String str){
        String msg;
        String title;
        switch (str){
            case "fill":
                msg="Please fill all fields";
                title="Error Occured";
                break;
            case "done":
                msg="Success";
                title="Result";
                break;
            default:
                msg=str;
                title="Message";
        }
        JOptionPane.showMessageDialog(null,msg,title,JOptionPane.INFORMATION_MESSAGE);
    }
}
