public class TestDuck {
    public static void main(String[] args) {
        int weight = 8;
        float density = 2.3F;
        String name = "Donald";
        long[] feathers = {1,2,3,4,5,6};
        boolean canFly = true;
        int airspeed = 22;

        Duck[] d = new Duck[7];

        d[0] = new Duck(); //Duck()
        d[1] = new Duck(density, weight); //Duck(int w, float f)
        d[2] = new Duck(name, feathers); //Duck(String n, long[] f)
        d[3] = new Duck(canFly); //Duck(boolean fly)
        d[4] = new Duck(3.3F, airspeed); //Duck(float density, int max)
        d[5] = new Duck(false); //Duck(boolean fly)
        d[6] = new Duck(airspeed, density); //No one matches
    }
}
