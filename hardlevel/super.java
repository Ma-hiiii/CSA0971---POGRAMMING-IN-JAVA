class SuperClass {
    int number;
    SuperClass(int number) {
        this.number = number;
    }
    void display() {
        System.out.println("Number from SuperClass: " + number);
    }
}
class SubClass extends SuperClass {
    int number;
    SubClass(int superNumber, int subNumber) {
        super(superNumber); 
        this.number = subNumber;
    }
    void display() {
        System.out.println("Number from SuperClass: " + super.number);
        System.out.println("Number from SubClass: " + number);
    }
}
class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass(100, 200);
        obj.display();
    }
}
