import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Urinals {
    public String optFile() throws IOException {

//        System.out.println("File Chosen");;
        File f=new File("urinal.dat");
        BufferedReader br= new BufferedReader(new FileReader(f));
        String st;
        ArrayList<Integer> count=new ArrayList<Integer>();
        while((st=br.readLine())!=null){
            count.add(numuri(st));
        }
        File f2=new File("rule.txt");
        BufferedWriter bw=new BufferedWriter(new FileWriter(f2));
        for(int i=0;i<count.size();i++){
            bw.write(count.get(i));
        }
        return "File";

    }
    public int numuri(String str){
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
    public int goodString(String st){
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
    public String optIn(){
////        System.out.println("Input chosen");
//        Scanner sc=new Scanner(System.in);
//        String st=sc.next();
        int n= goodString("11000");
        return "Input";
    }
    public String optStr(String s) throws IOException {
        if(s.equals("Input")){
            return optIn();
        }
        else if(s.equals("File")){
            return optFile();
        }
        return "Wrong Option Chosen";
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}