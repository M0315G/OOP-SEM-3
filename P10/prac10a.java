class prac10a{
    public static void main(String[] args) throws InterruptedException {
        Storage1 x = new Storage1();
        
        
        Thread t1 = new Thread(new counter1(x));
        Thread t2 =  new Thread(new printer1(x));

        t1.start();
        t2.start();
    }
}

class Storage1{
    int a;

    int getVal(){
        return a;
    }

    void setVal(int a){
        this.a = a;
    }
}

class counter1 implements Runnable{
    Storage1 a;

    counter1(Storage1 k){
        a = k;
    }


    public void run(){
        for (int i = 0; i < 50; i++) {
            a.setVal(i);
           System.out.println("Counter Thread: "+a.getVal());
        }
    }
}

class printer1 implements Runnable{
    Storage1 a;

    printer1(Storage1 k){
        a = k;
    }

    public void run(){
        while (a.getVal() < 50) {
            System.out.println("Printer: "+a.getVal());
        }    
    }
}