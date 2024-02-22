public class Temperature{

   // attributes
   public double [][]data = {
                        {18.5,19.2,17.5,18.2,20,23,25}
                     };
   
   // methods
   public void displayTemp(int week, int day){
      System.out.println("Temperature on Week "+week+" Day "+day+": " + this.data[(week-1)][(day-1)]);
   }
   
   public void displayAveTemp(int week){
      System.out.println("executing display Ave Temp");
   }
   
}
