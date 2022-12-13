import java.util.*;
class Student{}

 class Solution {

    public static void main(String[] args){
        Class o1 =Student.class;   // instance of student class
        Method [] m1 =o1.getDeclaredMethods() ;

        ArrayList<String> methodList = new ArrayList<>();
        for(Method i:m1){
            methodList.add(i.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList)
        {
            System.out.println(name);
        }
    }

}