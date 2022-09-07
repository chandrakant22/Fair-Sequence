package tcs;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer2 {
	static int maxAlternateSum(int arr[], int n)
    {
        // return maximum sum alternate sub-sequence
        ArrayList<Integer> fairSequence = new ArrayList<>();

        if(arr[0] < 0){
            fairSequence.add(arr[0]);
            int i=0;
            while(i != arr.length-1){
                int j=i+1;
                int nextMaxPositive = Integer.MIN_VALUE;
                for(j=i+1;j<n;j++){
                    if(arr[j] < 0){
                        break;
                    }
                    nextMaxPositive = Math.max(nextMaxPositive,arr[j]);
                }
                fairSequence.add(nextMaxPositive);
                int k = j;
                int nextMaxNegative = Integer.MIN_VALUE;
                for( k= j;k<n;k++){
                    if(arr[k] > 0){
                        break;
                    }
                    nextMaxNegative = Math.max(nextMaxNegative,arr[k]);
                }
                fairSequence.add(nextMaxNegative);
                i = k-1;
            }
            fairSequence.remove(fairSequence.size()-1);

        }
        if(arr[0] > 0){
            int i=0;
            while(i != arr.length-1){
                int j=i+1;
                int nextMaxNegative = Integer.MIN_VALUE;
                for( j= i;j<n;j++) {
                    if (arr[j] < 0) {
                        break;
                    }
                    nextMaxNegative = Math.max(nextMaxNegative, arr[j]);
                }
                fairSequence.add(nextMaxNegative);
                int k = j;
                int nextMaxPositive = Integer.MIN_VALUE;
                for(k=j;k<n;k++){


                    if(arr[k] > 0 && k < n-1){
                        break;
                    }
                    nextMaxPositive = Math.max(nextMaxPositive,arr[k]);
                }

                fairSequence.add(nextMaxPositive);
                i = k-1;
            }

        }

        int sum =0;
        for (int e:fairSequence) {
            sum+=e;
        }
       return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxAlternateSum(arr,n));
    }
}