import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Urinals {
    public static String optFile(String path) throws Exception {

//        System.out.println("File Chosen");;
        try{
            File f=new File(path);
            if(!f.exists())
                throw new Exception("File Not Found!!");
            else if(f.length()==0)
                throw new Exception("File Empty");
            else{

                BufferedReader br= new BufferedReader(new FileReader(f));
                String st;
                ArrayList<Integer> count=new ArrayList<Integer>();
                while((st=br.readLine())!=null){
                    count.add(numuri(st));
                }
                for(int i=0;i< count.size();i++){
                    System.out.println(count.get(i));
                }
                String s = "";
                for(int i=0;i<count.size();i++){
                    s+=" "+count.get(i);
                }
                br.close();
                File f2=new File("src/rule.txt");
                int counter=1;
                while(f2.exists()){
                    f2=new File("src/rule"+counter+".txt");
                    counter++;
                }
//        f2=File.createNewFile("rule"+counter+".txt");
//        System.out.println(f2.getName());
                FileWriter fw=new FileWriter(f2);
                for(int i=0;i<count.size();i++){
                    fw.write(count.get(i)+"\n");
                }
                fw.close();
                return s;
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    public static int numuri(String str){
        int count=0;
        char ch,next, prev;
        for(int i=0;i<str.length();i++){
            if(i==0){
                next=str.charAt(i+1);
                ch=str.charAt(i);
                if(ch=='0' && next=='0'){
                    ch='1';
                    str=ch+str.substring(i+1);
                    count++;
                }
                continue;
            }
            else if(i==str.length()-1){
                prev=str.charAt(i-1);
                ch=str.charAt(i);
                if(ch=='0' && prev=='0'){
                    ch='1';
                    str=str.substring(0,i)+ch;
                    count++;

                }
                break;
            }
            prev=str.charAt(i-1);
            next=str.charAt(i+1);
            ch=str.charAt(i);
            if(ch=='0' && next=='0' && prev=='0'){
                ch='1';
                str=str.substring(0,i)+ch+str.substring(i+1);
                count++;
            }
        }
        return count;
    }
    public static int goodString(String st){
//        ArrayList<String> ur=new ArrayList<>();
        char ch,nextchar;
        if(st.length()>=20)
            return -1;
        else{
            for(int i=0;i<st.length()-1;i++){
                ch=st.charAt(i);
                nextchar=st.charAt(i+1);
                if(ch=='1' && nextchar=='1')
                    return -1;
            }
        }
        return 0;
    }
    public static String optIn(){
//        System.out.println("Input chosen");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Urinal Pattern: ");
        String st=sc.next();
        int n= goodString(st);
        if(n>-1)
            n=numuri(st);
        String s= String.valueOf(n);
        return s;
    }
    public static String optStr(String s) throws Exception {
        if(s.equals("Input")){
            return optIn();
        }
        else if(s.equals("File")){
            return optFile("src/urinal.dat");
        }
        return "Wrong Option Chosen";
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Enter the input method(Input for keyboard and File for File input): ");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String str= optStr(s);
        System.out.println(str);
        System.out.println("Hello world!");
    }
}