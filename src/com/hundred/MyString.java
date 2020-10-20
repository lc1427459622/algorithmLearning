package com.hundred;

public class MyString {

    public static void main(String[] args) {
        String str = "abcde";
        int n = 3;
        String res = reverseLeftWords(str,n);
        //System.out.println(res);
        StringBuilder strb = new StringBuilder("333");
        System.out.println(strb.length());
        strb.setLength(4);
        System.out.println(strb.length());
        //System.out.println(replaceSpace(new StringBuilder(" abcdefe  dadfdf rew pp ")));
    }
    private static String reverseLeftWords(String str, int n) {

        return str.substring(n,str.length()) + str.substring(0,n);
    }


    /**
     * 空格替换
     */
    public static String replaceSpace(StringBuilder sb){
        //先算出有个空格需要替换
        int spaceCount = 0;
        for(int i =0 ; i<sb.length();i++){
            if(sb.charAt(i) == ' '){
                spaceCount ++;
            }
        }
        int oldIndex = sb.length() - 1;//原字符串长度
        sb.setLength(sb.length() + spaceCount * 2);
        for (int i = oldIndex + spaceCount * 2; i >= oldIndex && oldIndex >=0 ; oldIndex --) {
            if(sb.charAt(oldIndex) == ' '){
                sb.setCharAt(i--,'0');
                sb.setCharAt(i--,'2');
                sb.setCharAt(i--,'%');
            }else{
                sb.setCharAt(i--,sb.charAt(oldIndex));
            }
        }
        return sb.toString();
    }

}
