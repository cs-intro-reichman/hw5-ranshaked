

/**
 * A library of string functions.
 */
public class MyString {
    public static void main(String args[]) {
        String hello = "hello";
      //  System.out.println(countChar(hello, 'h'));
       // System.out.println(countChar(hello, 'l'));
      //  System.out.println(countChar(hello, 'z'));
        System.out.println(spacedString(hello));
     //   System.out.println(remove("committee", "meet"));
       // System.out.println("comit");
 


    }

    public static int countChar(String str, char ch) {
        int counter = 0;
        for(int i = 0 ; i<str.length() ; i++)
        {
            if(str.charAt(i) == ch)
            {
                counter++;
            }
        }
        return counter;
    }
    public static boolean subsetOf(String str1, String str2) {
        int counter = 0;
        for(int i = 0 ; i < str1.length(); i++)
        {
            if(countChar(str1,str1.charAt(i)) > countChar(str2, str1.charAt(i)))
            {
                return false;
            }
            if(countChar(str2, str1.charAt(i))>=1)
            {
                counter++;
            }
            
        }
        if(counter == str1.length())
        {
            return true;
        }
        return false;
    }
    public static String spacedString(String str) {
        String str1 = "";
        if(str.length() == 0)
        {
            return str1;
        }
        for(int i = 0 ; i<str.length(); i++)
        {
            char cd = str.charAt(i);
            if(i == str.length()-1)
            {
                str1 += cd;
            }else{
                str1 += cd + " ";
            }
        }
        return str1;
    }
    public static String randomStringOfLetters(int n) {
        char arr[] = new char[n];
        int min = 97;
        int max = 122;
        for(int i = 0 ; i< n ; i++)
        {
            arr[i] = (char)((int)(Math.random() * ((max - min) + 1)) + min);
        }
        return new String (arr);
    }
    public static String remove(String str1, String str2) {
        for(int j = 0 ; j < str2.length(); j++)
        {
            char arr[] = new char [str1.length()-1];
            int n = 0 ;
            int counter = 0;
            for(int i = 0 ; i < str1.length(); i++)
            {
                if(str1.charAt(i) != str2.charAt(j) || counter == 1)
                {
                    arr[n] = str1.charAt(i);
                    n++;  
                }else{
                    counter++;
                }
               
            }
            str1 = new String (arr);
        }
        return str1;
    }
    public static String insertRandomly(char ch, String str) {
         int randomIndex = (int) (Math.random() * (str.length() + 1));
         String result = str.substring(0, randomIndex) + ch + str.substring(randomIndex);
         return result;
    }    
}

