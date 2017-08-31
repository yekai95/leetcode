package first;
import java.util.Arrays;
import java.util.Scanner;
public class p556 {
	public int nextGreaterElement(int n) {  
        String num = n + "";  
        char[] charArray = num.toCharArray();  
        if(num.length() < 2) return -1;  
        int index = num.length() - 2;  
        for(; index >= 0; index --){  
            if(num.charAt(index) < num.charAt(index + 1)) break;  
        }  
        if(index == -1) return -1;  
        int swapIndex = index + 1;  
        for(;swapIndex < num.length();swapIndex ++){  
            if(num.charAt(swapIndex) <= num.charAt(index)) break;  
        }  
        swapIndex --;  
        char temp = charArray[index];  
        charArray[index] = charArray[swapIndex];  
        charArray[swapIndex] = temp;  
        Arrays.sort(charArray,index + 1, charArray.length);  
        int result = 0;  
        for(char ch : charArray) {result = result * 10 + (ch - '0');if(result > Integer.MAX_VALUE / 10) return -1;}  
          
        return result;  
    }  
}
