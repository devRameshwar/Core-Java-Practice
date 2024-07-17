package com.objectClass.cloning;

public class DeepCloningObject implements Cloneable{
    public  String studentName;
    public Integer studentScore;

    public DeepCloningObject(String studentName, Integer studentScore) {
        this.studentName = studentName;
        this.studentScore = studentScore;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentName='" + studentName + '\'' +
                ", studentScore=" + studentScore +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        //creating Students object
        DeepCloningObject student1 = new DeepCloningObject("Mahadev", 78);
        System.out.println(student1);//Students{studentName='Mahadev', studentScore=78}

        //Deep cloning of current class object student1
        DeepCloningObject student2 = (DeepCloningObject)student1.clone();
        System.out.println(student2);//Students{studentName='Mahadev', studentScore=78}

        //changing value of Instance
        student2.studentName="Rameshwar singh";
        student2.studentScore=51;
        //printing student1
        System.out.println(student1);//Students{studentName='Mahadev', studentScore=78}
        //printing student2
        System.out.println(student2);//Students{studentName='Rameshwar singh', studentScore=51}

        //instance student1 can not be effected with student2
    }
}
