package AgencyManagment.View;

import AgencyManagment.Helper.Helper;

import javax.swing.*;

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
    private JComboBox comboBox1;
    private JCheckBox ch_tv;
    private JCheckBox ch_minibar;
    private JCheckBox ch_game_console;
    private JCheckBox ch_case;
    private JCheckBox ch_projection;
    private JTextField fld_centare;

    public AgencyManagmentGUI(){
        add(wrapper);
        setSize(800,100);
//        setLocation(Helper.screenCenterPoint());
    }
}
