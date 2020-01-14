public class Main {
    public static void main (String args[]) {
    exampleone();
    exampletwo();
    examplethree();
    examplefour();
    }

        private static void exampleone(){
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showij();
        System.out.println();
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Сумма i, j и k в объекте subOb: ");
        subOb.sum();
    }

        private static void exampletwo(){
            B2 subOb = new B2();
            subOb.setij(10, 12);
            subOb.sum();
            System.out.println("Сумма равна " + subOb.total);
        }

        private static void examplethree(){
            BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
            BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
            double vol;

            vol = mybox1.volume();
            System.out.println("Объём mybox1 равен " + vol);
            System.out.println("Вес mybox1 равен " +mybox1.weight);
            System.out.println();

            vol = mybox2.volume();
            System.out.println("Объём mybox2 равен " + vol);
            System.out.println("Вес mybox2 равен " + mybox2.weight);
        }

    private static void examplefour(){
    BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
    Box plainbox = new Box();
    double vol;

    vol = weightbox.volume();
    System.out.println("Объём weightbox равен " + vol);
    System.out.println("Все weightbox равен " + weightbox.weight);
    System.out.println();

    plainbox = weightbox;
    vol = plainbox.volume();
    System.out.println("Объём plainbox равен " + vol);
    }
}
