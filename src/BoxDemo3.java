class Box {
    double width;
    double heigth;
    double depth;


    void volume() {
        System.out.print("V = ");
        System.out.println(width * heigth * depth);
    }
}

class BoxDemo3 {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.heigth = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.heigth = 6;
        mybox2.depth = 9;

        mybox1.volume();
        mybox2.volume();
    }
}