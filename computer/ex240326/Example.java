package kr.ac.ync.computer.ex240326;

class Circle{
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }
}

public class Example {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        init(circles);
        increase(circles);
        System.out.println(circles[1].radius);
    }

    private  static  void increase(Circle[] circles){
        for(int i =0; i<circles.length; i++){
            circles[i].radius++;
        }
    }
    public static void init(Circle[] circles){
        for(int i =0; i<circles.length; i++){
            circles[i] = new Circle(10+i);
        }
    }
}
