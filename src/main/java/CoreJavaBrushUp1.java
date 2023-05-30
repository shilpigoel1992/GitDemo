import java.util.ArrayList;

public class CoreJavaBrushUp1 {

    public static void main(String args[]){

        int myNum =5;
        String website = "Welcome to world";
        char letter ='r';
        double dec =5.99;
        boolean mycard = true;

        System.out.println(myNum);
        System.out.println(website);
        System.out.println(letter);
        System.out.println(dec);
        System.out.println(mycard);
        //Arrays ----------
        int[] arr =new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
     int[] arr2 ={1,23,4,5,6};
     System.out.println( arr2[2] );

     for(int i=0 ; i<arr.length;i++){
         System.out.println(arr[i]);
     }

     String[] str ={"Shilpi","Selenium","autmation"};
     for(String s: str){
         System.out.println(s);
     }

        ArrayList<String> ar =  new ArrayList<String>();
        ar.add("selenium");
        ar.add("automation");
        ar.add("extract");
        System.out.println(ar);
        System.out.println(ar.get(2));



    }
}
