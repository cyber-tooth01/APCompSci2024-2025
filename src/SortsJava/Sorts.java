package SortsJava;

public class Sorts
{
   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using the selection
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static double[] selectionSort (int[] numbers)
   {
      int min=0;
      int temp=0;

      double swaps = 0.0;
      double comps = 0.0;

      double[] result = new double[2];

      for (int index = 0; index < numbers.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < numbers.length; scan++) {
            comps++;
            if (numbers[scan] < numbers[min]) {
               min = scan;
            }
         }
         if(min!=index){
         // Swap the values
         temp = numbers[min];
         numbers[min] = numbers[index];
         numbers[index] = temp;
         swaps++;
         }
      }

      result[0] = swaps;
      result[1] = comps;

   return result;
 }
   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static double[] insertionSort (int[] numbers)
   {

      double swaps = 0.0;
      double comps = 0.0;

      double[] result = new double[2];


      for (int index = 1; index < numbers.length; index++)
      {
         int key = numbers[index];
         int position = index;
         comps++;

         // shift larger values to the right
         while (position > 0 && numbers[position-1] > key)
         {
            comps++;

            numbers[position] = numbers[position-1];
            position--;
            swaps++;
         }
            
         numbers[position] = key;
      }

      result[0] = swaps;
      result[1] = comps;

      return result;
   }
}
