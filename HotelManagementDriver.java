import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class HotelManagementDriver {

 void screenHeader()//To Display Welcome message 
 {
   System.out.print("\n                          :::::::::::::::::::::::::::::::::::::");
   System.out.print("\n                          ::                                 ::");
   System.out.print("\n                          ::     #######################     ::");
   System.out.print("\n                          ::     #                     #     ::");
   System.out.print("\n                          ::     #      WELCOME TO     #     ::");
   System.out.print("\n                          ::     #                     #     ::");
   System.out.print("\n                          ::     #    Hotel Paradise   #     ::");
   System.out.print("\n                          ::     #                     #     ::");
   System.out.print("\n                          ::     #######################     ::");
   System.out.print("\n                          ::                                 ::");
   System.out.print("\n                          :::::::::::::::::::::::::::::::::::::\n\n");

   
 }

    public static void main(String[] args){

        String space = "                          ";
        String delemite = "=======================================================================================";

        
        String roomInfo = "\n"+delemite+"\n"+
            space+"ROOM MENU"+"\n"+
            
            space+"1.Luxury Double Room"+ "\n"+
            space+"2.Deluxe Double Room"+ "\n"+
            space+"3.Luxury Single Room"+ "\n"+
            space+"4.Deluxe Single Room"+"\n"+
            space+"Choose room type : ";
        try
        {           
        

        HotelManagementDriver driverObject = new HotelManagementDriver();//This object is used to access the screenHeader method
        driverObject.screenHeader();


        Scanner sc = new Scanner(System.in);
        int ch,ch2;
        char wish;
        x:
        do{
        //this portion is uded to make an environment that a user can access all the  parts of the project
        System.out.print("\n"+delemite+"\n"+
        space+"MAIN MENU"+"\n"+
        space+"1.Display Room Details"+"\n"+
        space+"2.Display Room Availability"+ "\n"+
        space+"3.Book Room"+"\n"+
        space+"4.Order Food"+"\n"+
        space+"5.Checkout"+"\n"+
        space+"6.Exit"+"\n"+
        space+"Enter your choice : ");

        ch = sc.nextInt();//this 'ch' variable will take the user input 
        switch(ch){
            case 1: 
                 System.out.print(roomInfo);
                ch2 = sc.nextInt();//this 'ch2' variable will take the user input to show the room information
                Hotel.features(ch2);//this features() method will show the room information like the number of room, Food information and also the price of the room
                break;
            case 2:// Room Availability Process
                System.out.print(roomInfo);
                ch2 = sc.nextInt();
                Hotel.availability(ch2);//This method  availability() is used to show how many rooms are free at thsi current momment
                break;
            case 3://Book Room Process
                    System.out.print(roomInfo);
                     ch2 = sc.nextInt();
                     Hotel.bookroom(ch2);    //this method will book a room                  
                break;
            case 4://Order Food process
                 System.out.print(space+"Room Number :");
                     ch2 = sc.nextInt();
                     if(ch2>60)//As the totla number of room is 60. So, it is imposible with a room number greater than 60
                         System.out.println(space+"Room doesn't exist!");//If a user try to book a room which is not existed.
                     else if(ch2>40)//This condtion will occur when a user booked a Deluxe Single room
                         Hotel.order(ch2-41,4);
                     else if(ch2>30)//This condtion will occur when a user booked a Luxury Single room
                         Hotel.order(ch2-31,3);
                     else if(ch2>10)//This condtion will occur when a user booked a Deluxe Double room
                         Hotel.order(ch2-11,2);
                     else if(ch2>0)//This condtion will occur when a user booked a Luxury Double room
                         Hotel.order(ch2-1,1);
                     else
                         System.out.println(space+"Room doesn't exist");
                     break;
            case 5:    //Deallocation process             
                System.out.print(space+"Room Number : ");
                     ch2 = sc.nextInt();
                     if(ch2>60)
                         System.out.println(space+"Room doesn't exist");
                     else if(ch2>40)
                         Hotel.deallocate(ch2-41,4);
                     else if(ch2>30)
                         Hotel.deallocate(ch2-31,3);
                     else if(ch2>10)
                         Hotel.deallocate(ch2-11,2);
                     else if(ch2>0)
                         Hotel.deallocate(ch2-1,1);
                     else
                         System.out.println(space+"Room doesn't exist");
                     break;
            case 6:break x;
                
        }
           
            System.out.print(space+"Continue : (y/n): ");//A Task is completed. This process will make an environment to go to another task
            wish=sc.next().charAt(0); 
            if(!(wish=='y'||wish=='Y'||wish=='n'||wish=='N'))
            {
                System.out.print(space+"Invalid Option!");
                System.out.print(space+"Continue : (y/n):");
                wish=sc.next().charAt(0); 
            }
            
        }while(wish=='y'||wish=='Y');    
        
        
        }        
            catch(Exception e)
            {
                System.out.print(space+"Not a valid input! Exception Caught"+e);//If any exception Occurs then this line of code will handle the exception
            }
    }
}