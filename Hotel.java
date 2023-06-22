import java.util.Scanner;
class Hotel
{
    static holder hotel_ob=new holder();
    static Scanner sc = new Scanner(System.in);
    static void CustDetails(int i,int rn)
    {

        String space = "                          ";
        String delemite = "=======================================================================================\n";
        String name, contact, gender;//information of customer 1
        int nid,passport,driving_number;
        String name2 = null, contact2 = null; 
        String gender2="";
        int nid2=0,passport2=0,driving_number2=0;//information of customer 2
        System.out.println("\n"+delemite);
        System.out.println(space+"Customer 1 Information");
        System.out.print(space+"Enter customer name: ");
        name = sc.next();
        System.out.print(space+"Enter contact number: ");
        contact=sc.next();
        System.out.print(space+"Enter gender: ");
        gender = sc.next();
        System.out.println(space+"Pleae insert at least one of them, 0 otherwise:");//At least one information of National Id, Driving Licence Number and Passport number of an user is important. 
                                                                                    //So He/She need to share this information. If any of the information is not present to the customer then he give just 0 
        System.out.print("\t"+space+"Enter National ID    Number : ");
        nid=sc.nextInt();
        System.out.print("\t"+space+"Enter    Passport     Number: ");
        passport = sc.nextInt();
        System.out.print("\t"+space+"Enter Driving Licence Number: ");
        driving_number = sc.nextInt();
        

        

        if(i<3)//If the customer booked a double rroom then this portion will execute
        {

        System.out.println("\n"+delemite);
        System.out.println(space+"Customer 2 Information");   
        
        System.out.print(space+"Enter customer name: ");
        name2 = sc.next();
        System.out.print(space+"Enter contact number: ");
        contact2=sc.next();
        System.out.print(space+"Enter gender: ");
        gender2 = sc.next();
        System.out.println(space+"Pleae insert at leaset one of them, 0 otherwise:");
        System.out.print("\t"+space+"Enter National ID    Number : ");
        nid2=sc.nextInt();
        System.out.print("\t"+space+"Enter    Passport     Number: ");
        passport2 = sc.nextInt();
        System.out.print("\t"+space+"Enter Driving Licence Number: ");
        driving_number2 = sc.nextInt();
        System.out.print(delemite);
        }      
        
          switch (i) {
              //Now we the system is booking the room
            case 1:hotel_ob.luxury_doublerrom[rn]=new Doubleroom(name,contact,gender,nid,passport,driving_number,name2,contact2,gender2,nid2,passport2,driving_number2);
                break;
            case 2:hotel_ob.deluxe_doublerrom[rn]=new Doubleroom(name,contact,gender,nid,passport,driving_number,name2,contact2,gender2,nid2,passport2,driving_number2);
                break;
            case 3:hotel_ob.luxury_singleerrom[rn]=new Singleroom(name,contact,gender,nid,passport,driving_number);
                break;
            case 4:hotel_ob.deluxe_singleerrom[rn]=new Singleroom(name,contact,gender,nid,passport,driving_number);
                break;
            default:System.out.println(space+"Wrong option");
                break;
        }
    }
    
    static void bookroom(int i)
    {
        String space = "                          ";
        
        int j;
        int rn;
        System.out.print(space+"Choose room number from : ");
        switch (i) {
            case 1:
                for(j=0;j<hotel_ob.luxury_doublerrom.length;j++)
                {
                    if(hotel_ob.luxury_doublerrom[j]==null)//Checking whether the room is allocated or not.
                    {
                        System.out.print(j+1+",");//Showing free rooms
                    }
                }
                System.out.println("\n");
                System.out.print(space+"Enter room number: ");
                try{
                rn=sc.nextInt();//asking room number which is to be booked
                rn--;
                if(hotel_ob.luxury_doublerrom[rn]!=null)
                    throw new NotAvailable();//If the room is not available then it will call NotAvailable() Constructor and give the message that the room is allocated to others
                CustDetails(i,rn);//Otherwise the system will collect the information of the customers
                }
                catch(Exception e)//Bad input
                {
                    System.out.println(space+"Invalid Option");
                    return;
                }
                break;
            case 2:
                 for(j=0;j<hotel_ob.deluxe_doublerrom.length;j++)
                {
                    if(hotel_ob.deluxe_doublerrom[j]==null)//Checking whether the room is allocated or not.
                    {
                        System.out.print(j+11+",");//Showing free rooms
                    }
                }
                System.out.print("\n"+space+"Enter room number: ");
                try{
                rn=sc.nextInt();//asking room number which is to be booked
                rn=rn-11;
                if(hotel_ob.deluxe_doublerrom[rn]!=null)
                    throw new NotAvailable();//If the room is not available then it will call NotAvailable() Constructor and give the message that the room is allocated to others
                CustDetails(i,rn);//Otherwise the system will collect the information of the customers
                }
                catch(Exception e)//bad input
                {
                    System.out.println(space+"Invalid Option");
                    return;
                }
                break;
            case 3:
                  for(j=0;j<hotel_ob.luxury_singleerrom.length;j++)
                {
                    if(hotel_ob.luxury_singleerrom[j]==null)//Checking whether the room is allocated or not.
                    {
                        System.out.print(j+31+",");//Showing free rooms
                    }
                }
                System.out.print("\n"+space+"Enter room number: ");
                try{
                rn=sc.nextInt();//asking room number which is to be booked
                rn=rn-31;
                if(hotel_ob.luxury_singleerrom[rn]!=null)
                    throw new NotAvailable();//If the room is not available then it will call NotAvailable() Constructor and give the message that the room is allocated to others
                CustDetails(i,rn);//Otherwise the system will collect the information of the customer
                }
                catch(Exception e)//bad input
                {
                    System.out.println(space+"Invalid Option");
                    return;
                }
                break;
            case 4:
                  for(j=0;j<hotel_ob.deluxe_singleerrom.length;j++)
                {
                    if(hotel_ob.deluxe_singleerrom[j]==null)//Checking whether the room is allocated or not.
                    {
                        System.out.print(j+41+",");//Showing free rooms
                    }
                }
                System.out.print("\n"+space+"Enter room number: ");
                try{
                rn=sc.nextInt();//asking room number which is to be booked
                rn=rn-41;
                if(hotel_ob.deluxe_singleerrom[rn]!=null)
                    throw new NotAvailable();//If the room is not available then it will call NotAvailable() Constructor and give the message that the room is allocated to others
                CustDetails(i,rn);//Otherwise the system will collect the information of the customer
                }
                catch(Exception e)
                {
                   System.out.println(space+"Invalid Option");
                    return;
                }
                break;
            default:
                System.out.println(space+"Enter valid option");
                break;
        }
        System.out.println(space+"Room Booked");//Confirming that the room is booked
    }
    
    static void features(int i)//This method inform the user about the room
    {
        String space = "                          ";
        String delemite = "=======================================================================================\n";
        System.out.println(delemite);
        switch (i) {
            case 1:System.out.println(space+"Room Type : Luxury Double Room\n"+space+"Number of double beds : 1\n"+space+"AC : Yes\n"+space+"Free breakfast : Yes\n"+space+"Charge per day RM:1000"+"\n"+delemite);
                break;
            case 2:System.out.println(space+"Room Type : Deluxe Double Room\n"+space+"Number of double beds : 1\n"+space+"AC : No\n"+space+"Free breakfast : Yes\n"+space+"Charge per day RM:800"+"\n"+delemite);
                break;
            case 3:System.out.println(space+"Room Type : Luxury Single Room\n"+space+"Number of single beds : 1\n"+space+"AC : Yes\n"+space+"Free breakfast : Yes\n"+space+"Charge per day RM:500"+"\n"+delemite);
                break;
            case 4:System.out.println(space+"Room Type : Deluxe Single Room\n"+space+"Number of single beds : 1\n"+space+"AC : No\n"+space+"Free breakfast : Yes\n"+space+"Charge per day RM:300 "+"\n"+delemite);
                break;
            default:
                System.out.println(space+"Enter valid option"+delemite);
                break;
        }
    }
    
    static void availability(int i)//This method return the total number of free romm
    {
    
        String space = "                          ";
        String delemite = "=======================================================================================\n";
        System.out.println(delemite);
      int j,count=0;
        switch (i) {
            case 1:
                for(j=0;j<10;j++)
                {
                    if(hotel_ob.luxury_doublerrom[j]==null)//If the room is free now
                        count++;
                }
                break;
            case 2:
                for(j=0;j<hotel_ob.deluxe_doublerrom.length;j++)
                {
                    if(hotel_ob.deluxe_doublerrom[j]==null)//If the room is free now
                        count++;
                }
                break;
            case 3:
                for(j=0;j<hotel_ob.luxury_singleerrom.length;j++)
                {
                    if(hotel_ob.luxury_singleerrom[j]==null)//If the room is free now
                        count++;
                }
                break;
            case 4:
                for(j=0;j<hotel_ob.deluxe_singleerrom.length;j++)
                {
                    if(hotel_ob.deluxe_singleerrom[j]==null)//If the room is free now
                        count++;
                }
                break;
            default:
                System.out.println(space+"Enter valid option");
                break;
        }
        System.out.println(space+"Number of rooms available : "+count+"\n"+delemite);
    }
    
    static void bill(int rn,int rtype)//THis method calcualte the total bill of the customer
    {
        String space = "                          ";
        String delemite = "=======================================================================================\n";
        double amount=0;
        String list[]={"Nasi Lemak","Roti Canai","Kaya Toast","Ayam Percik"};//Different recipe
        System.out.println("\n"+delemite);
        System.out.println(space+"--Bill--");
        System.out.println(delemite);
               
        switch(rtype)
        {
            case 1:
                amount+=1000;//Room charge of Luxury Double Romm
                    System.out.println(space+"Room Charge RM:"+1000.0);
                    System.out.println(space+"-------------------------------------");
                    System.out.println(space+"Food Charges");
                    System.out.println(space+"-------------------------------------");
                     System.out.println(space+"Item       Quantity    Price");
                    System.out.println(space+"-------------------------");
                    
                    for(Food obb:hotel_ob.luxury_doublerrom[rn].food)//This code will iterate all the food menu and add the price of each food
                    {
                        amount+=obb.price;
                        
                        System.out.println(space+list[obb.itemno-1]+"\t"+obb.quantity+"\t"+obb.price );
                    }
                    
                break;
            case 2:amount+=800;//Room charge of Deluxe Double Romm
                    System.out.println(space+"Room Charge RM:"+800.0);
                    System.out.println(space+"-------------------------------------");
                    System.out.println(space+"Food Charges");
                    System.out.println(space+"-------------------------------------");
                    System.out.println(space+"Item       Quantity    Price");
                    System.out.println(space+"-------------------------");
                    for(Food obb:hotel_ob.deluxe_doublerrom[rn].food)//This code will iterate all the food menu and add the price of each food
                    {
                        amount+=obb.price;
                        System.out.println(space+list[obb.itemno-1]+"\t"+obb.quantity+"\t"+obb.price );
                    }
                break;
            case 3:amount+=500;//Room charge of Luxury Single Romm
                    System.out.println(space+"Room Charge RM:"+500.0);
                    System.out.println(space+"-------------------------------------");
                    System.out.println(space+"Food Charges");
                    System.out.println(space+"-------------------------------------");
                    System.out.println(space+"Item       Quantity    Price");
                    System.out.println(space+"-------------------------");
                    for(Food obb:hotel_ob.luxury_singleerrom[rn].food)//This code will iterate all the food menu and add the price of each food
                    {
                        amount+=obb.price;
                        System.out.println(space+list[obb.itemno-1]+"\t"+obb.quantity+"\t"+obb.price );
                    }
                break;
            case 4:amount+=300;//Room charge of Deluxe Single Romm
                    System.out.println(space+"Room Charge RM:"+300.0);
                    System.out.println(space+"-------------------------------------");
                    System.out.println(space+"Food Charges");
                    System.out.println(space+"-------------------------------------");
                    System.out.println(space+"Item       Quantity    Price");
                    System.out.println(space+"-------------------------");
                    for(Food obb: hotel_ob.deluxe_singleerrom[rn].food)//This code will iterate all the food menu and add the price of each food
                    {
                        amount+=obb.price;
                        System.out.println(space+list[obb.itemno-1]+"\t"+obb.quantity+"\t"+obb.price );
                    }
                break;
            default:
                System.out.println(space+"Not valid!!!");
        }
        System.out.println(space+"-------------------------");
        System.out.println(space+"Total Amount : "+amount);//This will Show total amount (Food Charges+ Room Charges)
    }
    
    static void deallocate(int rn,int rtype)//This method will free a room 
    {
        String space = "                          ";
        
        char w;
        switch (rtype) {
            case 1:               
                if(hotel_ob.luxury_doublerrom[rn]!=null)
                    System.out.println(space+"Room is allocated to : "+hotel_ob.luxury_doublerrom[rn].name);                
                else 
                {    
                    System.out.println(space+"The Room Is empty");
                        return;
                }
                System.out.print(space+"Do you want to checkout ?(y/n) : ");
                
                 w=sc.next().charAt(0);
                if(w=='y'||w=='Y')
                {
                    bill(rn,rtype);//It will show the bill before de allocation
                    hotel_ob.luxury_doublerrom[rn]=null;//Deallocating the room 
                    System.out.println(space+"Room is now free");
                }
                
                break;
            case 2:
                if(hotel_ob.deluxe_doublerrom[rn]!=null)//it is checking whether the room is accocated or not
                    System.out.println(space+"Room is allocated to : "+hotel_ob.deluxe_doublerrom[rn].name);                
                else 
                {    
                    System.out.println(space+"The Room Is empty");
                        return;
                }
                System.out.print(space+"Do you want to checkout ?(y/n) : ");
                 w=sc.next().charAt(0);
                if(w=='y'||w=='Y')
                {
                    bill(rn,rtype);
                    hotel_ob.deluxe_doublerrom[rn]=null;//deallocating the room 
                    System.out.println(space+"Room is now free");
                }
                 
                break;
            case 3:
                if(hotel_ob.luxury_singleerrom[rn]!=null)//Checking whether the room is allocated or not
                    System.out.println(space+"Room is allocated to : "+hotel_ob.luxury_singleerrom[rn].name);                
                else 
                 {    
                    System.out.println(space+"The Room Is empty");
                        return;
                }
                System.out.print(space+"Do you want to checkout ?(y/n) : ");
                w=sc.next().charAt(0);
                if(w=='y'||w=='Y')
                {
                    bill(rn,rtype);
                    hotel_ob.luxury_singleerrom[rn]=null;//deallocating
                    System.out.println(space+"Room is now free");
                }
                
                break;
            case 4:
                if(hotel_ob.deluxe_singleerrom[rn]!=null)
                    System.out.println(space+"Room is allocated to : "+hotel_ob.deluxe_singleerrom[rn].name);                
                else 
                 {    
                    System.out.println(space+"The Room Is empty");
                        return;
                }
                System.out.print(space+"Do you want to checkout ?(y/n) : ");
                 w=sc.next().charAt(0);
                if(w=='y'||w=='Y')
                {
                    bill(rn,rtype);
                    hotel_ob.deluxe_singleerrom[rn]=null;//deallocating
                    System.out.println(space+"Room is now free");
                }
                break;
            default:
                System.out.println(space+"Enter valid Input !!! ");
                break;
        }
    }
    
    static void order(int rn,int rtype)//This method is used to order foods
    {

        String space = "                          ";
        String delemite = "=======================================================================================\n";
        
        
        int i,q;
        char wish;
         try{//Showing Food items and there price
             System.out.println(delemite+ space+"Food Menu\n"+delemite+space+"1.Nasi Lemak\tRM:10.00\n"+space+"2.Roti Canai\tRM:15.00\n"+space+"3.Kaya Toast\tRM:16.00\n"+space+"4.Ayam Percik\tRM:8.00\n");
        do
        {
            System.out.print(space);
            System.out.print("Enter Your Choice : ");
            i = sc.nextInt();
            System.out.print(space+"Enter Quantity : ");
            q=sc.nextInt();
           
              switch(rtype){
            case 1: hotel_ob.luxury_doublerrom[rn].food.add(new Food(i,q));//adding food to a specific room number. Here we are tracking the food with the room number not customer number.
                break;
            case 2: hotel_ob.deluxe_doublerrom[rn].food.add(new Food(i,q));//adding food to a specific room number. Here we are tracking the food with the room number not customer number.
                break;
            case 3: hotel_ob.luxury_singleerrom[rn].food.add(new Food(i,q));//adding food to a specific room number. Here we are tracking the food with the room number not customer number.
                break;
            case 4: hotel_ob.deluxe_singleerrom[rn].food.add(new Food(i,q));//adding food to a specific room number. Here we are tracking the food with the room number not customer number.
                break;                                                 
        }
              System.out.print(space+"Do you want to order anything else ? (y/n) : ");
              wish=sc.next().charAt(0); 
        }while(wish=='y'||wish=='Y');  
        }
         catch(NullPointerException e)
            {
                System.out.println("\n"+space+"Room not booked yet!");//Nullpointer exception. When the room is not booked yet
            }
         catch(Exception e)
         {
             System.out.println(space+"Invalid Operation");//Any Excption Occured
         }
    }
}