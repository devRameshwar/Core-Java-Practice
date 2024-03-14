package Practice_core_java.src.com.objectClass.toString;
import javax.sound.midi.Soundbank;
import  java.lang.Integer;
public class ToStringInStringAndWrapperClass {

    public static void main(String[] args) throws  NumberFormatException{
        //Note: toString method is already overriding in String class and Wrapper classes

        //creating a string class object
        String string = new String("Sivi Singh");
        //printing String class object
        System.out.println(string);// output: Sivi Singh -> printing content

        StringBuffer stringBuffer = new StringBuffer("Bhole Nath");
        System.out.println(stringBuffer.toString());//output: Bhole Nath
        // already overriding in String Buffer class


        String s ="333";
        //creating an Integer object And passing the String value
        Integer integer = new Integer(s);

        System.out.println(integer);//output: 333
        // Note: no need to override toString value in Wrapper classes

    }
}
