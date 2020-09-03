/*
import java.util.LinkedList;

class Solution {
    int index=0;
    public String decodeString(String s) {
        LinkedList<String> stack=new LinkedList<>();
        while (index<s.length()){
            char c = s.charAt(index);
            if (Character.isDigit(c)){
                //获取一个数字并进栈
                String digits = getDigits(s);
                stack.addLast(digits);
            }else if (Character.isLetter(c)||c=='['){
                //获取一个字母并进栈
                stack.addLast(String.valueOf(s.charAt(index++)));
            }else {
                //是]
                index++;
                LinkedList<String> sub=new LinkedList<>();
                while (!"[".equals(stack.peekLast())){
                    sub.addFirst(stack.pollLast());
                }
                //左括号出站
                stack.pollLast();
                //次数
                int time = Integer.parseInt(stack.removeLast());
                StringBuilder t=new StringBuilder();
                String o = getString(sub);
                while (time-->0){
                   t.append(o);
                }
                stack.addLast(t.toString());
            }
        }
        return getString(stack);
    }
    private String getDigits(String s){
        StringBuilder sb=new StringBuilder();
        while (Character.isDigit(s.charAt(index))){
            sb.append(s.charAt(index++));
        }
        return sb.toString();
    }

    private String getString(LinkedList<String> list){
        StringBuilder sb=new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        return sb.toString();
    }

}*/


import java.util.LinkedList;

public class Solution394 {
    String str;
    int index;
    public String decodeString(String s) {
        str=s;
        index=0;
        return getString();
    }
    public String getString(){
        if (index==str.length()||str.charAt(index)==']'){
            return "";
        }
        String res="";
        if (Character.isDigit(str.charAt(index))){
            int digits = getDigits();
            //跳过[
            index++;
            String string = getString();
            //过滤右括号
            index++;
            StringBuilder sb=new StringBuilder();
            while (digits-->0){
                sb.append(string);
            }
            res+=sb.toString();
        }else if (Character.isLetter(str.charAt(index))){
            res=String.valueOf(str.charAt(index++));
        }
        return res+getString();
    }

    private int getDigits(){
        int res=0;
        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            res=res*10+str.charAt(index++)-'0';
        }
        return res;
    }
}
