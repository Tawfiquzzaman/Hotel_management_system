/*This class is used to order food and calculate the price of food.*/
import java.io.Serializable;
class Food implements Serializable
{
    int itemno;//This variable track the food. 
    int quantity;   
    float price;
    
    Food(int itemno,int quantity)//Food constructor calculate the price of food according to the itemnumber and its price.
    {
        this.itemno=itemno;
        this.quantity=quantity;
        switch(itemno)
        {
            case 1:price=quantity*10;//This line of code calculate the price if the user order Nasi Lemak
                break;
            case 2:price=quantity*15;//This line of code calculate the price if the user order Roti Canai
                break;
            case 3:price=quantity*16;//This line of code calculate the price if the user order Kaya Toast
                break;
            case 4:price=quantity*8;//This line of code calculate the price if the user order Ayam Percik
                break;
        }
    }
}