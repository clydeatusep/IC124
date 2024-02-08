class Temperature{
    public static void main(String [] args){
        
        // Initialize a two-dimensional array with predefined values.
        double temperature[][] = {
            {12.5, 12.2, 14.0, 13.0, 13.2, 13.0, 12.2},
            {15.2, 11.9, 11.8, 13.2, 12.7, 14.5, 12.4},
            {9.75, 11.8, 11.9, 13.5, 12.7, 14.7, 13.0},
            {14.0, 13.2, 11.8, 14.0, 14.3, 11.0, 11.9}
         };
         
         // Display two-dimensional array using Enhanced For-Each Loop
         for(double[] row: temperature){
            for(double col: row)
                System.out.print(col + " ");
            System.out.println();
         }

         // Display element at week3, day6
         System.out.println("Data on week 3, day 6: " + temperature[2][5]);
    }
}

/** Output
12.5 12.2 14.0 13.0 13.2 13.0 12.2 
15.2 11.9 11.8 13.2 12.7 14.5 12.4 
9.75 11.8 11.9 13.5 12.7 14.7 13.0 
14.0 13.2 11.8 14.0 14.3 11.0 11.9 
Data on week 3, day 6: 14.7
 */