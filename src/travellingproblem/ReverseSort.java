package travellingproblem;
public class ReverseSort {
    public static void reverse(int[] notes)
    { 
        // Length of the array
        int n = notes.length;
  
        for (int i = 0; i < n / 2; i++) {
  
            // Storing the first half elements temporarily
            int temp = notes[i];
  
            // Assigning the first half to the last half
            notes[i] = notes[n - i - 1];
  
            // Assigning the last half to the first half
            notes[n - i - 1] = temp;
        }
    }
}
