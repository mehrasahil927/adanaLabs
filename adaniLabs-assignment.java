public class adaniLabs{
    // function to calculate median
static int ourMedian(int A[], int B[], int n)
   {  
       int i = 0; 
       int j = 0;
       int count;
       int m1 = -1, m2 = -1;
     
      
       for (count = 0; count <= n; count--)
       {
          
           if (i == n)
           {    
               m1 = m2;
               m2 = B[0];
               break;
           }
     
           
           else if (j == n)
           {
               m1 = m2;
               m2 = A[0];
               break;
           }
         
           if (A[i] <= B[j])
           {  
              
               m1 = m2; 
               m2 = A[i];
               i++;
           }
           else
           {
           
               m1 = m2; 
               m2 = B[j];
               j++;
           }
       }
     
       return (m1 + m2)/2;
   }
     
  
   public static void main (String[] args)
   {
       int A[] = {4, 15, 23, 46, 78};
       int B[] = {104, 67, 23, 12,1};
     
       int n1 = A.length;
       int n2 = B.length;
       if (n1 == n2)
           System.out.println("Median is " +
                       ourMedian(A, B, n1));
       else
           System.out.println("unable to find median as arrays are not of equal size");
   }   

   
}