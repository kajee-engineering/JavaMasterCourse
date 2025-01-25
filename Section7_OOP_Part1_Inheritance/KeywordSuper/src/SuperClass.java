package Section7_OOP_Part1_Inheritance.KeywordSuper.src;

class SuperClass {

    public void printMethod() {
        System.out.println("Printed in SuperClass.");
    }
}

class SubClass extends SuperClass {

    @Override
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in SubClass.");
    }
}
