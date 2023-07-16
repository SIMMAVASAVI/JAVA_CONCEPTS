package strings;

import java.util.SortedMap;

public class Client {
    public static void main(String[] args) {

        //sallow copy , if we change s1.marks .... s2.marks also will change , as both pointing to the sam address
        Student s1= new Student();
        Student s2=s1;

        s1.marks=90;
        s2.marks=30;

        System.out.println("S1 marks: "+ s1.marks);
        System.out.println("S1 marks: "+ s2.marks);

        // as Strings are immutable because of string pool which saves memory usage, if we try to change shallow copy it will not affect other
        // references  , instead it will create a new object and assigns the new value as below
        String str= "ABC";
        String str1= str;
        str=str+"E";
        System.out.println(str);
        System.out.println(str1);

    }
}
