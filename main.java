public class Main {

    public static void main(String[] args){
        System.out.println(maxOfTwoNumbers(3,4));
        System.out.println(maxOfThree(1,2,3));
        System.out.println(isCharacterAVowel('b'));
        System.out.println(argLength(1,2,3));
        System.out.println(reverseString("123"));

        String[] array = {"cat","banana","grass"};
        System.out.println(findLongestWord(array));
    }
    public static int maxOfTwoNumbers(int num1, int num2){
       return (num1>num2)? num1: num2;

    }
    public static int maxOfThree( int num1, int num2, int num3){
        if (num1>num2 && num1>num3){
            return num1;
        }
        else if(num2> num1 && num2>num3){
            return num2;
        }
        else{
            return num3;
        }

    }
    public static boolean isCharacterAVowel(char c){
        switch (c){
            case 'a':return true;
            case 'o':return true;
            case 'i': return true;
            case 'u': return true;
            case 'e': return true;
            default: return false;
        }
    }

    public static int argLength(int... args){
        return args.length;
    }


    public static String reverseString(String str){
         char[] array=str.toCharArray();
         String newStr="";
        for (int i = array.length-1; i>= 0; i--) {
            newStr+=array[i];

        }
        return newStr;
    }

    public static String findLongestWord(String[] array){
        String longest = array[0];
        for (int i = 1; i <array.length; i++) {
            if(longest.length()<array[i].length()){
                longest = array[i];
            }
        }
        return longest;
    }


}