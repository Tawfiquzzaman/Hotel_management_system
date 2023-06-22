import java.io.Serializable;
import java.util.ArrayList;

class Singleroom implements Serializable
{
    //Those informations are customer 1 information
    String name;
    String contact;
    String gender; 
    int passport;
    int nid;
    int driving_number;  
    ArrayList<Food> food =new ArrayList<>();//This Arraylist will track food list ordered by the customer

   
    Singleroom()
    {
        this.name="";
    }
    //This constructor is used to store the information of customer 1.
    Singleroom(String name,String contact,String gender,int nid,int passport,int driving_number)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
        this.nid = nid;
        this.passport = passport;
        this.driving_number = driving_number;
    }
}
