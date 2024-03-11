package Practice_core_java.src.com.objectClass.cloning;

public class DeepCloningObject implements Cloneable {

    int a;

    public static void  cloningTheObject() throws CloneNotSupportedException {

        //creating object
        DeepCloningObject object1 = new DeepCloningObject();

        DeepCloningObject object2 = (DeepCloningObject) object1.clone();//Deep cloning

        //initializing a with help of object1
        object1.a = 10;
        System.out.println("value of a: " + object1.a); //output=10

        //initializing a with help of object2
        object2.a = 20;
        System.out.println("value of a: " + object2.a); //output=20
        //printing object1 value
        System.out.println("value of a: " + object1.a); //output=10


    }

    public static void main(String[] args) throws CloneNotSupportedException {

        cloningTheObject();

    }
}
