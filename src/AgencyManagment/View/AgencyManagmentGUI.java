package AgencyManagment.View;

import AgencyManagment.Helper.Config;
import AgencyManagment.Helper.Helper;
import AgencyManagment.Models.Hotel;

import javax.swing.*;
import java.util.Objects;

public class AgencyManagmentGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tab_hotel;
    private JTextField fld_hotel_name;
    private JTextField fld_hotel_address;
    private JTextField fld_hotel_mail;
    private JTextField fld_hotel_phone;
    private JComboBox cmb_star_selection;
    private JCheckBox ch_free_park;
    private JCheckBox ch_free_wifi;
    private JCheckBox ch_hotel_concierge;
    private JCheckBox ch_swimming_pool;
    private JCheckBox ch_spa;
    private JCheckBox ch_fitness_center;
    private JCheckBox ch_room_service;
    private JComboBox cmb_hostel_type;
    private JComboBox cmb_bed_count;
    private JCheckBox ch_tv;
    private JCheckBox ch_minibar;
    private JCheckBox ch_game_console;
    private JCheckBox ch_case;
    private JCheckBox ch_projection;
    private JTextField fld_centare;
    private JButton btn_add;
    private JTextField a150TextField;

    public AgencyManagmentGUI(){
        add(wrapper);
        setSize(500,700);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        btn_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_hotel_name)||Helper.isFieldEmpty(fld_hotel_address)||Helper.isFieldEmpty(fld_hotel_mail)
            ||Helper.isFieldEmpty(fld_hotel_phone)|| Helper.isFieldEmpty(fld_centare)){
                Helper.showMessage("fill");
            }else{
                String hotelName=fld_hotel_name.getText();
                String hotelAddress=fld_hotel_address.getText();
                String hotelEmail=fld_hotel_mail.getText();
                String hotelPhone=fld_hotel_phone.getText();
                Integer star= Integer.parseInt((String) Objects.requireNonNull(cmb_star_selection.getSelectedItem())) ;
                boolean freePark=ch_free_park.isSelected();
                boolean freeWifi=ch_free_wifi.isSelected();
                boolean swimmingPool=ch_swimming_pool.isSelected();
                boolean fitnessCenter=ch_fitness_center.isSelected();
                boolean hotelConcierge=ch_hotel_concierge.isSelected();
                boolean spa=ch_spa.isSelected();
                boolean roomService=ch_room_service.isSelected();
                String hostelType=(String) cmb_hostel_type.getSelectedItem();
                String centare=fld_centare.getText();
                Integer bedCount=Integer.parseInt((String) Objects.requireNonNull(cmb_bed_count.getSelectedItem()));
                boolean tv=ch_tv.isSelected();
                boolean miniBar=ch_minibar.isSelected();
                boolean privateCase=ch_case.isSelected();
                boolean gameConsole=ch_game_console.isSelected();
                boolean projection=ch_projection.isSelected();
                if (Hotel.add(hotelName,hotelAddress,hotelEmail,hotelPhone,star,freePark,freeWifi,swimmingPool,fitnessCenter,hotelConcierge,spa
                ,roomService,hostelType,centare,bedCount,tv,miniBar,privateCase,gameConsole,projection)){
                    Helper.showMessage("done");
                    clearAllFields();
                }

            }
        });
    }

    public static void main(String[] args) {
        AgencyManagmentGUI agencyManagmentGUI=new AgencyManagmentGUI();
        Helper.setLayout();
    }
    public void clearAllFields(){
        fld_hotel_name.setText(null);
        fld_hotel_address.setText(null);
        fld_hotel_mail.setText(null);
        fld_hotel_phone.setText(null);
        fld_centare.setText(null);
        cmb_star_selection.setSelectedIndex(0);
        ch_free_park.setSelected(false);
        ch_free_wifi.setSelected(false);
        ch_swimming_pool.setSelected(false);
        ch_fitness_center.setSelected(false);
        ch_hotel_concierge.setSelected(false);
        ch_spa.setSelected(false);
        ch_room_service.setSelected(false);
        cmb_hostel_type.setSelectedIndex(0);
        cmb_bed_count.setSelectedIndex(0);
        ch_tv.setSelected(false);
        ch_minibar.setSelected(false);
        ch_case.setSelected(false);
        ch_game_console.setSelected(false);
        ch_projection.setSelected(false);
    }


}
