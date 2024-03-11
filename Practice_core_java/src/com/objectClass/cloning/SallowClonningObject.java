package Practice_core_java.src.com.objectClass.cloning;

public class SallowClonningObject {

    int a = 10;

    public static void main(String[] args) {

        SallowClonningObject object1 = new SallowClonningObject();

        SallowClonningObject object2 = object1; //Sallow Cloning

        //initializing a with help of object1
        object1.a = 10;
        System.out.println("value of a: " + object1.a); //output=10

        //initializing a with help of object2
        object2.a = 20;
        System.out.println("value of a: " + object2.a); //output=20
        //also change object2 value
        System.out.println("value of a: " + object1.a); //output=20

    }
}
