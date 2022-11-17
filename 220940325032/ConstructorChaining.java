class GrandParent{
    String grandFatherName;
    String grandMotherName;

    GrandParent(String grandFatherName,String grandMotherName){
        this.grandFatherName=grandFatherName;
        this.grandMotherName=grandMotherName;
        System.out.println("Grandfather name: "+this.grandFatherName);
        System.out.println("Grandmother name: "+this.grandMotherName);
    }
}

class Parent extends GrandParent{
    String fatherName;
    String motherName;

    Parent(String fatherName,String motherName,String grandFatherName,String grandMotherName){
        this(grandFatherName,grandMotherName);
        this.fatherName=fatherName;
        this.motherName=motherName;
        System.out.println("Father name: "+this.fatherName);
        System.out.println("Mother name: "+this.motherName);
    }

    Parent(String grandFatherName,String grandMotherName){
        super(grandFatherName, grandMotherName);
    }
}

class Child extends Parent{
    Child(String fatherName,String motherName,String grandFatherName,String grandMotherName){
        super(fatherName, motherName, grandFatherName, grandMotherName);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Child c=new Child("Rahul","Prajakta","Amar","Rupa");
    }
}
