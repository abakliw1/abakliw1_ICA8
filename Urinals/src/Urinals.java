public class Urinals {
//    public String optFile() {
//
////        System.out.println("File Chosen");;
//        return "File";
//
//    }
//    public String optIn(){
////        System.out.println("Input chosen");
//        return "Input";
//    }
    public String optStr(String s){
        if(s.equals("Input")){
            return "Input";
        }
        else if(s.equals("File")){
            return "File";
        }
        return "Wrong Option Chosen";
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}