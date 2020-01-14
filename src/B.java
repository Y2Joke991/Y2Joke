public class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + this.k);
    }

    void sum () {
        System.out.println("i + j + k: " + (i + j + this.k));
    }
}

