import java.util.Scanner;

public class Cinema {
  public static void main(String[] args) {


         int[][] movie = {
           {0,0,1,1},
           {1,1,0,0}
         };

           Scanner sc = new Scanner(System.in);

           System.out.println("Choose Row 0 or 1");
           int row = sc.nextInt();
           System.out.println("Choose seat 0,1,2,3");
           int colum = sc.nextInt();

    
          if(movie[row][colum] == 0) { 
            System.out.println("Free"); 
            System.out.println("18$");
           } else {
            System.out.println("Occupied");
            }
          
            
     
    

        
  }
}

//My Project
