/*
Sample Input:
4 7
18.5 19.2 17.5 18.2 20 23 25
16.5 17.2 18.5 19.2 22 22 24
17.5 16.2 18.5 18.4 21 22 23
18.5 19.1 17.3 18.4 20 22 22

Sample Output:
Temperature on Week 1 Day 4:
Temparature on Week 4 Day 2:
Week 1 Average Temperature:
Count of Temperatures less than 20:
Highest Temperature:
Lowest Temperature:

Contributors: 
20-Feb, 2024 [Pino, Fernandez, Gatmin, Buena, Gumata, Castaneda, Gelvero, Tapales, Compasion, Icban, Maniscan, Labisores]
*/
import java.util.Scanner;
public class Temperature {

   public static void main (String [] args){
     
      Scanner key = new Scanner (System.in); 
      
      int r = key.nextInt();
      int c = key.nextInt();
      double week1Sum = 0;
      int count = 0;
      double[][] arrayHiSir = new double [r][c];
      
         for (int i = 0; i < r; i++ ) {
            for(int j = 0; j< c; j++ ) {
               arrayHiSir [i][j] = key.nextDouble(); 
            }
         }
         System.out.print("Temperature on Week 1 Day 4: " + arrayHiSir[0][3]);
         System.out.print("\nTemperature on Week 4 Day 2: " + arrayHiSir[3][1]);
         //System.out.print("\nWeek 1 Average Temperature: " + (arrayHiSir[0][0] + arrayHiSir[0][1] + arrayHiSir[0][2] + arrayHiSir[0][3] + arrayHiSir[0][4] + arrayHiSir[0][5]+ arrayHiSir[0][6])/7);
 
         // loop
         for (int i = 0 ; i < 1; i++){
            for(int j = 0; j< c; j++){
               week1Sum = week1Sum + arrayHiSir[i][j];     
            }          
         }
         
         double avg = week1Sum / c;
         System.out.print("\nWeek 1 Average Temperature: " + avg);
         
         for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
               if(arrayHiSir[i][j] < 20) {
                  count++;
               }
            }
         }
         System.out.print("\nCount of Temperatures less than 20: " + count);
  }
}
