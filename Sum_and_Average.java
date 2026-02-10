public class Sum_and_Average{
  public static void main(String args[]){
  int arr[] = {2,2,2,2,2,2};
  int sum =0;
  
  for(int i=0;i<=arr.length-1;i++){
  // sum= sum+arr[i];
  }

int i =0;
while(i<=arr.length-1){
  sum = sum+arr[i];
  i++;
}
int average  = sum/arr.length;
  System.out.println(sum);
  System.out.println("Average : "+average);
  }
}