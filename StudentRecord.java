public class StudentRecord
{
   //contains scores.length values and scores.length > 1
   private int [] scores;
   
   //Constructs a StudentRecord object with an array of scores.
   public StudentRecord(int[] s)
   {
      scores = s;
   }
   
   /** returns the average (arithmetic mean) of the values in scores
    *  whose subscripts are between first and last, inclusive
    *  PRECONDITION: 0 <= first <= last < scores.length
    */
   private double average(int first, int last)
   {   
    double sum = 0; 
    int divide = last-first+1;
    
     for(int i = first; i <= last; i++){
       sum += scores[i];
    }
       sum= sum/divide;
       return sum;
    }
    

    
   
    
   /** returns true if each successive value in scores is greater than
    *  or equal to the previous value; false otherwise.
    */
   private boolean hasImproved()
   {
      int last = scores[0];
      for(int i = 1; i < scores.length; i++){
        if(scores[i]>=last){
         last = scores[i];
        }
        else{
         return false;
        }
         
        }
       return true;
   }  
   
   /** if the values in scores have imrpoved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public double finalAverage()
   {
     int sum = 0; 
       if(hasImproved()){
        return average(scores.length/2,scores.length-1);
     }
     else{
     return average(0,4);
    }
     
   } 
}