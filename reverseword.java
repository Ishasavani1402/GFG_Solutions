// Reverse Words
// Difficulty: Easy
// Accuracy: 56.08%
// Submissions: 332K+
// Points: 2

// question
// -----------------
// Given a String str, reverse the string without reversing its individual words. Words are separated by dots.

// Note: The last character has not been '.'. 

// Examples :

// Input: str = i.like.this.program.very.much
// Output: much.very.program.this.like.i
// Explanation: After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i
// Input: str = pqr.mno
// Output: mno.pqr
// Explanation: After reversing the whole string , the input string becomes mno.pqr
// Expected Time Complexity: O(|str|)
// Expected Auxiliary Space: O(|str|)

// Constraints:
// 1 <= |str| <= 105

public class reverseword {
    
    static String reverse(String str){
        String rev[] = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i=rev.length-1;i>=0;i--){
            sb.append(rev[i]);
            if(i!=0){
                sb.append(".");
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hello.world.how.are.you";
        System.out.println(reverse(str));
    }
}
