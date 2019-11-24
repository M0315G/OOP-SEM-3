class prac10b{
    public static void main(String[] args) throws InterruptedException {
        Storage x = new Storage();
        
        
        Thread t1 = new Thread(new counter(x));
        Thread t2 =  new Thread(new printer(x));

        t1.start();
        t2.start();
    }
}

class Storage{
    int a;

    int getVal(){
        return a;
    }

    void setVal(int a){
        this.a = a;
    }
}

class counter implements Runnable{
    Storage a;

    counter(Storage k){
        a = k;
    }


    public void run(){
        for (int i = 0; i < 50; i++) {
            try {
                synchronized(a){
                    a.setVal(i);
                    System.out.println("Counter Thread: "+a.getVal());
                    a.notify();
                    a.wait();
                    
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
    }
}

class printer implements Runnable{
    Storage a;

    printer(Storage k){
        a = k;
    }

    public void run(){
        while (a.getVal() < 50) {
        try {
            synchronized(a){
                    System.out.println("Printer: "+a.getVal());
                    
                    a.notify();
                    a.wait();
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
    }
}