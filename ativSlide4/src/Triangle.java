public class Triangle {
    double area;
    int height;
    int lenght;

    public static void main(String[] args) {
        int x = 1;
        Triangle[] ta = new Triangle[4];
        while(x < 5){
            ta[x].setArea();
            ta[x].height = (x + 1) * 2;
            ta[x].lenght = x + 4;
            ta[x] = new Triangle();
            System.out.print("triangle" + x + ",area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    void setArea(){
        area = (height * lenght) / 2;
    }
}
 //Não consegui resolver