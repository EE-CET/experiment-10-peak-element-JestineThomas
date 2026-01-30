import java.util.Scanner;
public class PeakElement {
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                if(n==1){
                        System.out.println(0);
                        return;
                }
                if(arr[0]>arr[1]){
                        System.out.println(0);
                        return;
                }
                for(int i=1;i<n-1;i++){
                        if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1]){
                                System.out.println(i);
                                return;
                        }
                }
                if(arr[n-1]>arr[n-2]){
                        System.out.println(n-1);
                        return;
                }
        }
}
