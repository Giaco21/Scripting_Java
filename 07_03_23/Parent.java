public class Parent {
    void show(){
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    @Override
    void show(){
        super.show();
        System.out.println("Child's show()");
    }
}

class MajorMain{
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
