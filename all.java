import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	        int arr[] ={2,3,5,2,8};
	        int result=0;
	        int[] left = new int[arr.length];
	        int[] right = new int[arr.length];
	        int maxLeft=0;
	        maxLeft =arr[0];
	        left[0]= maxLeft;
	        for(int i=1; i<arr.length; i++){
	           if(arr[i]>maxLeft){
	               maxLeft = arr[i];
	           }
	           left[i]=maxLeft;
	        }
	        
	        int rightMax=arr[right.length-1];
	        right[arr.length-1]=rightMax;
	        for(int i=arr.length-2; i>=0; i--){
	           if(arr[i]>rightMax){
	               rightMax = arr[i];
	           }
	           right[i]=rightMax;
	        }
	        
	          for(int i=0; i<arr.length; i++){
	              System.out.println(left[i]+", "+ right[i] +" , "+ arr[i]);
	           int min = Math.min(left[i],right[i]);
	           result += min-arr[i];
	        }

	        System.out.println(result);

	}
}
