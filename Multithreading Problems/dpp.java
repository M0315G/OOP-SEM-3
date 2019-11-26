class fork{
    int id;
    boolean available=true;
    fork(int id){
        this.id=id;
    }
    synchronized public void take(String name){
        if(!this.available){
            try{
                wait();
            }catch(InterruptedException e){

            }
        }
        this.available=false;
        System.out.println(name+" picked up fork:- "+id);
        
        
    }

    synchronized public void drop(String name){
        
        this.available=true;
        notifyAll();
        System.out.println(name+" dropped frok:- "+id);
    }
}

class Sphageti{
    fork left,right;
    Sphageti(fork left,fork right){
        this.left=left;
        this.right=right;
    }

    public void eat(String name){
        this.left.take(name);
        if(!(right.available)){
            this.left.drop(name);
            return;
        }
        this.right.take(name);

        System.out.println("\n"+name+" is eating!\n");
        try{
            Thread.sleep(1000*(1+(int)(Math.random()*2)));
        }catch(Exception e){}
        

        System.out.println("\n"+name+" stops eating!\n");
        this.left.drop(name);
        this.right.drop(name);
    }
}

class Philosopher implements Runnable{
    String name;
    Sphageti plate;
    Philosopher(fork left,fork right,String name){
        this.name=name;
        this.plate= new Sphageti(left, right);
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(1000*(1+(int)Math.random()*2));
            }catch(Exception e){

            }
            this.plate.eat(this.name);
        }
        
    }
}


class Dinner{
    //int number;
    Philosopher p[];
    fork f[];
    Dinner(){
        
        this.f= new fork[5];
        for(int i=0;i<5;i++) {
            f[i]= new fork(i+1);
        }

        this.p= new Philosopher[5];
        for(int i=0;i<5;i++) {
            p[i]= new Philosopher(this.f[i], this.f[(i+1)%5], "Philosopher "+(i+1));
            new Thread(this.p[i]).start();
        }
    }

}

class dpp{
    public static void main(String[] args) {
        new Dinner();
    }
}