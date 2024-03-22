package Practice_core_java.src.com.java8.functionalInterface;

@FunctionalInterface
interface Papa {
    void papa();
}

@FunctionalInterface
interface Putra extends Papa {
    void papa();
    /*Note:
     1.if we can extend the one interface to other interface the all property can extend by child interface
     2.if we same name as parant abstract method then code run happily
     3.if we can define another abstract method in child interface then we got compile time error
     4.if removed @FunctionalInterface Annotation then third point error gone because child method can not behave a FunctionalInterface
     more points are there, but we discuss the latter..............*/

}

public class InheritenceRelationship {
    public static void main(String[] args) {

        System.out.println("code run Happily...");
    }
}
