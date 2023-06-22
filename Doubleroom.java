/*
This Class is used to store the informtion of Customer. It has inheritance feature. It inherites the class Singleroom and
take the property of this class.  
*/

import java.io.Serializable;
class Doubleroom extends Singleroom implements Serializable
{ 
    /*Thos information are used to track a customer of a hotel*/
    String name2;
    String contact2;
    String gender2; 
    int nid2;
    int passport2;
    int driving_number2; 
    
    Doubleroom()//Constructor without parameter
    {
        this.name="";
        this.name2="";
    }
    /*Constructor with parameter. This is an examplee of compile time polymorphism.*/ 
    Doubleroom(String name,String contact,String gender,int nid,int passport,int driving_number,String name2,String contact2,String gender2,int nid2,int passport2,int driving_number2)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
        this.nid = nid;
        this.passport = passport;
        this.driving_number = driving_number;
        this.name2=name2;
        this.contact2=contact2;
        this.gender2=gender2;
        this.nid2 = nid2;
        this.passport2 = passport2;
        this.driving_number2 = driving_number2;
    }
}