public class CalcularArea {
    
    static int calcArea(int height, int width){
        return height * width;
    }

    public static void main(String[] args) {
        
        //O VSCode não apontou erro nesses 2.
        int a = calcArea(7, 12);
        short c = 7;
        calcArea(c, 15);

        calcArea(2, 3);
        
    }
}
