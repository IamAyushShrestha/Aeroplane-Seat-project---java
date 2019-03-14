import java.util.Scanner;
public class Seating {
    private boolean[][] seat = new boolean[14][7];
    private int a,b,c;
    private char cc, ch;

    /*This method initializes the array*/

    public void initialize(){
        System.out.println("\t\tA\tB\tC\tD\tE\tF");
        for (int i = 1; i<seat.length;i++){
            System.out.print("Row "+i);
            for(int j = 1; j<seat[i].length;j++){
                System.out.print("\t*");
            }
            System.out.println();
        }
    }



    /* This method shows menu option to the user*/
    public void menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Seat Class you want to travel in:\n" +
                " 1 For First class\n 2 For Business class \n 3 For Economy \n 4 to exit:");
        this.a = in.nextInt();
        if(a==4){
            System.exit(0);
        }
       else if (a==1){
            System.out.println("Enter Row 1 - 2");
        }
        else if (a==2){
            System.out.println("Enter row 3-7");
        }
        else if (a==3){
            System.out.println("Enter row 8-13");
        }
            this.b = in.nextInt();
            System.out.println("Enter Seat Column (A-F)");
            this.cc = in.next().charAt(0);
            this.ch = Character.toLowerCase(cc);
            switch (ch){
                case 'a':
                    c= 1;
                    break;
                case 'b':
                    c=2;
                    break;
                case 'c':
                    c= 3;
                    break;
                case 'd':
                    c=4;
                    break;
                case 'e':
                    c= 5;
                    break;
                case 'f':
                    c=6;
                    break;
            }
        }


        /* gets the value of a*/
     public int getA(){
        return a;
     }


     /* assigns value as per user input*/
public void assign() {
    if (seat[b][c] == true)
        System.out.println("This Seat is Already taken!");
    else {
        seat[b][c] = true;

        System.out.println("\n\n\nYour Seat is Booked");

    }

    display(seat);
}


/*uses the assigned value and displays the seat */
    public static void display(boolean[][] seat)

    {
        System.out.println("\t\t\tA\tB\tC\tD\tE\tF");
        int i, j;
        for( i = 1 ; i < seat.length ; i++ )
        {
            System.out.print("Row " + i + "   ");
            for( j = 1; j < seat[i].length ; j++ )

            {
                if( seat[i][j] == true )
                    System.out.print("\tX");
                else

                    System.out.print("\t*");

            }

            System.out.println();

        }
        System.out.println();

    }

}













