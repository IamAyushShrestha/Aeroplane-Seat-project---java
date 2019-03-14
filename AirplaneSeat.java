/**
 * @author Ayush Shrestha
 */
public class AirplaneSeat {
    public static void main (String[] args){
Seating sa= new Seating();
sa.initialize();

/* runs until user chooses to exit entering 4*/
while(sa.getA()!=4){
sa.menu();
sa.assign();
    }

}}
