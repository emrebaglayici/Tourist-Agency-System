package AgencyManagment.Models;

import AgencyManagment.Helper.DbConnector;
import AgencyManagment.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Hotel {
    private int id;
    private String hotelName;
    private String hotelAddress;
    private String hotelEmail;
    private String hotelPhone;
    private Integer star;
    private boolean freePark;
    private boolean freeWifi;
    private boolean swimmingPool;
    private boolean fitnessCenter;
    private boolean hotelConcierge;
    private boolean spa;
    private boolean roomService;
    private String hostelType;
    private String centare;
    private Integer bedCount;

    private boolean tv;
    private boolean miniBar;
    private boolean privateCase;
    private boolean gameConsole;
    private boolean projection;

    public Hotel(int id,String hotelName, String hotelAddress, String hotelEmail, String hotelPhone,
                 Integer star, boolean freePark,
                 boolean freeWifi, boolean swimmingPool, boolean fitnessCenter,
                 boolean hotelConcierge, boolean spa,
                 boolean roomService, String hostelType, String centare,
                 Integer bedCount, boolean tv, boolean miniBar, boolean privateCase,
                 boolean gameConsole, boolean projection) {
        this.id=id;
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.hotelEmail = hotelEmail;
        this.hotelPhone = hotelPhone;
        this.star = star;
        this.freePark = freePark;
        this.freeWifi = freeWifi;
        this.swimmingPool = swimmingPool;
        this.fitnessCenter = fitnessCenter;
        this.hotelConcierge = hotelConcierge;
        this.spa = spa;
        this.roomService = roomService;
        this.hostelType = hostelType;
        this.centare = centare;
        this.bedCount = bedCount;
        this.tv = tv;
        this.miniBar = miniBar;
        this.privateCase = privateCase;
        this.gameConsole = gameConsole;
        this.projection = projection;
    }

    public static boolean add(String hotelName, String hotelAddress, String hotelEmail,
                              String hotelPhone, Integer star, boolean freePark, boolean freeWifi, boolean swimmingPool,
                              boolean fitnessCenter, boolean hotelConcierge, boolean spa,
                              boolean roomService, String hostelType, String centare, Integer bedCount, boolean tv,
                              boolean miniBar, boolean privateCase, boolean gameConsole, boolean projection) {

        String query="INSERT INTO hotel(name,address,email,phone,star,free_park,free_wifi,swimming_pool,fitness_center,concierge,spa,room_service,hostel_type,centare,bed_count,tv,mini_bar,private_case,game_console,projection) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement pr= DbConnector.getInstance().prepareStatement(query);
            pr.setString(1,hotelName);
            pr.setString(2,hotelAddress);
            pr.setString(3,hotelEmail);
            pr.setString(4,hotelPhone);
            pr.setInt(5,star);
            pr.setBoolean(6,freePark);
            pr.setBoolean(7,freeWifi);
            pr.setBoolean(8,swimmingPool);
            pr.setBoolean(9,fitnessCenter);
            pr.setBoolean(10,hotelConcierge);
            pr.setBoolean(11,spa);
            pr.setBoolean(12,roomService);
            pr.setString(13,hostelType);
            pr.setString(14,centare);
            pr.setInt(15,bedCount);
            pr.setBoolean(16,tv);
            pr.setBoolean(17,miniBar);
            pr.setBoolean(18,privateCase);
            pr.setBoolean(19,gameConsole);
            pr.setBoolean(20,projection);
            int reponse=pr.executeUpdate();
            if (reponse==1){
                Helper.showMessage("error");
            }
            return reponse!=-1;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return true;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelEmail() {
        return hotelEmail;
    }

    public void setHotelEmail(String hotelEmail) {
        this.hotelEmail = hotelEmail;
    }

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public boolean isFreePark() {
        return freePark;
    }

    public void setFreePark(boolean freePark) {
        this.freePark = freePark;
    }

    public boolean isFreeWifi() {
        return freeWifi;
    }

    public void setFreeWifi(boolean freeWifi) {
        this.freeWifi = freeWifi;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public boolean isFitnessCenter() {
        return fitnessCenter;
    }

    public void setFitnessCenter(boolean fitnessCenter) {
        this.fitnessCenter = fitnessCenter;
    }

    public boolean isHotelConcierge() {
        return hotelConcierge;
    }

    public void setHotelConcierge(boolean hotelConcierge) {
        this.hotelConcierge = hotelConcierge;
    }

    public boolean isSpa() {
        return spa;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public boolean isRoomService() {
        return roomService;
    }

    public void setRoomService(boolean roomService) {
        this.roomService = roomService;
    }

    public String getHostelType() {
        return hostelType;
    }

    public void setHostelType(String hostelType) {
        this.hostelType = hostelType;
    }

    public String getCentare() {
        return centare;
    }

    public void setCentare(String centare) {
        this.centare = centare;
    }

    public Integer getBedCount() {
        return bedCount;
    }

    public void setBedCount(Integer bedCount) {
        this.bedCount = bedCount;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isMiniBar() {
        return miniBar;
    }

    public void setMiniBar(boolean miniBar) {
        this.miniBar = miniBar;
    }

    public boolean isPrivateCase() {
        return privateCase;
    }

    public void setPrivateCase(boolean privateCase) {
        this.privateCase = privateCase;
    }

    public boolean isGameConsole() {
        return gameConsole;
    }

    public void setGameConsole(boolean gameConsole) {
        this.gameConsole = gameConsole;
    }

    public boolean isProjection() {
        return projection;
    }

    public void setProjection(boolean projection) {
        this.projection = projection;
    }
}
