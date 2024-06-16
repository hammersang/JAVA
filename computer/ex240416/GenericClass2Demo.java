package kr.ac.ync.computer.ex240416;

public class GenericClass2Demo {
    public static void main(String[] args) {
        Cup<Beer> c =new Cup< >();
        c.setBeverage(new Beer());
        Beer b1 = c.getBeverage();


    }
}
