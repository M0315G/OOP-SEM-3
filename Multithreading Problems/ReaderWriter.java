class Database{
    int readers;
    int data=-1;
    int i=0;
    Database(){
        this.readers=0;
    }

    public void read(String name){

        synchronized(this){
            if(data==-1){
                try{
                    wait();
                }catch(Exception e){}
            }
            this.readers++;
            System.out.println("\n"+name+" read "+data+" from Database!");
        }

        try{
            Thread.sleep(1000*((int)(Math.random()*3)+1));
        }catch(InterruptedException e){

        }

        synchronized(this){
            this.readers--;
            System.out.println("\n"+name+" has stopped reading from Database.");
            if(this.readers==0){
                notifyAll();
            }
        }

    }

    synchronized public void write(String name){
        if(readers!=0){
            try{
                this.wait();
            }catch(Exception e){

            }
        }
        i++;
        this.data=i;
        System.out.println("\n"+name+" wrote "+data+" to Database!");
        
        try{
            Thread.sleep(1000*((int)(Math.random()*3)+1));
        }catch(InterruptedException e){

        }

        System.out.println("\n"+name+" has stopped writing to Database!");
        this.notifyAll();
    }

}

class Reader extends Thread{

    Database d;
    String name;
    Reader(Database d,String name){
        this.d=d;
        this.name=name;
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(1000*((int)(Math.random())+1));
            }catch(InterruptedException e){
    
            }
            this.d.read(name);
        }
    }
}

class Writer extends Thread{
    private final Database d;
    String name;
    Writer(Database d,String name){
        this.d=d;
        this.name=name;
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(1000*((int)(Math.random())+1));
            }catch(InterruptedException e){
    
            }
            this.d.write(this.name);
        }
    }
}

class ReaderWriter{
    public static void main(String[] args) {
        Database d = new Database();
        Reader r[]= new Reader[5];
        for(int i=0;i<5;i++){
            r[i]= new Reader(d, "Reader"+(i+1));
            r[i].start();
        }
        // Writer w= new Writer(d,"Writer1");
        // w.start();
        Writer w[]= new Writer[2];
        for(int i=0;i<2;i++){
            w[i]= new Writer(d, "Writer"+(i+1));
             w[i].start();
        }


    }
}