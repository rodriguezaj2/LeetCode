package SelfCode;

public  class Palindrome {

    public static boolean isPalindrome(int x){
        String s = String.valueOf(x);
        String reverse="";
        for (int i = s.length()-1; i >= 0 ; i--) {
            reverse=reverse+s.charAt(i);
        }
        if (reverse.equalsIgnoreCase(s)){
          //  System.out.println("Is Palindrome");
            return true;
        }else {
          //  System.out.println("NOT Palindrome");
            return false;
        }
        }

    public static void main(String[] args) {
        int num=121;
        System.out.println(isPalindrome(num));
        boolean word=isPalindrome(num);
        if (word){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("Is NOT Palindrome");
        }
    }
    }

