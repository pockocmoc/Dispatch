//Динамическая диспетчеризация методов
public class A {
    void callme() {
        System.out.println("В методе callme() из класса A");
    }
}
class B extends A {
    // переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса B");
    }
}

class C extends A {
    // переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса C");
    }
}
class Dispatch {
    public static void main(String[] args) {
        A a = new A(); // Объект класса A
        B b = new B(); // Объект класса B
        C c = new C(); // Объект класса C

        A r; // получить ссылку на объект типа A

        r = a;  // переменная r ссылается на объект типа A
        r.callme(); // вызвать вариант метода callme(), определенный в классе A

        r = b;  // переменная r ссылается на объект типа B
        r.callme(); // вызвать вариант метода callme(), определенный в классе B

        r = c;  // переменная r ссылается на объект типа C
        r.callme();  // вызвать вариант метода callme(), определенный в классе C
    }
}
