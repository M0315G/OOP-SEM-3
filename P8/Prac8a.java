abstract class instrument {
    abstract void play();
}

class piano extends instrument{
    void play(){
        System.out.println("Piano is playing  tan tan tan tan");
    }
}

class flute extends instrument{
    void play(){
        System.out.println("Flute is playing  toot toot toot toot");
    }
}

class guitar extends instrument{
    void play(){
        System.out.println("Guitar is playing  tin  tin  tin");
    }
}

public class Prac8a {

    public static void main(String[] args) {
        instrument ins[] = new instrument[10];

        for (int i = 0; i < ins.length; i++) {
             
            int range = 3 ;
            int rand = (int)(Math.random() * range);
            
            if(rand == 0){
                ins[i] = new piano();
                ins[i].play();
            }else if(rand == 1){
                ins[i] = new flute();
                ins[i].play();
            }else if(rand == 2){
                ins[i] = new guitar();
                ins[i].play();
            }
        }

        for (int i = 0; i < ins.length; i++) {
            if (ins[i] instanceof piano)
                System.out.println("Element " + (i+1) + " is piano");
            else if(ins[i] instanceof guitar)
                System.out.println("Element " + (i+1) + " is guitar");
            else
                System.out.println("Element " + (i+1) + " is flute");
        }
        }
        
    }