public class Mix4 {
    int counter = 0;

    public int getCounter() {
        return counter;
    }


    public static void main(String[] args) {
        int count = 0;
        Mix4[] mixes = new Mix4[20];
        int i = 0;
        while(i < 9){
            mixes[i] = new Mix4();
            mixes[i].counter = mixes[i].counter + 1;
            count = count + 1;
            count = count + mixes[i].maybeNew(i);
            i = i + 1; 
        }
        int resp = mixes[count].getCounter();
        System.out.println(resp);
    }


    public int maybeNew(int index) {
        if(index < 5){
            Mix4 mix = new Mix4();
            mix.counter = mix.counter + 1;
            return 1;
        }
        //System.out.println(mix.counter);
        return 0;
    }
}

/*
 * CONDIÇÃO:               SAÍDA:
 * i < 9
 * index < 5
 * 
 * i < 20
 * index < 5
 * 
 * i < 7
 * index < 7
 * 
 * i < 19
 * index < 1
 */