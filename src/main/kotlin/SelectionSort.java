import java.util.Scanner;

public class SelectionSort {
    public static int[] TakeInput(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Arr[]=new int[n];
        for(int i=0;i<n;i++){
            Arr[i]=sc.nextInt();
        }
        return Arr;

    }
    public static void Sort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int minIdx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIdx=j;
                }
            }
            if(minIdx!=i){
                arr[minIdx]=arr[i];
                arr[i]=min;
            }
        }
    }
    public static void main(String args[]){
        int arr[]=TakeInput();
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+",");
        }
    }
}
