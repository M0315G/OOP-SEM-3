/* This program for implementing the understanding the multithreading approach
    Here we try to print a specific sequence of characters using multiple threads and achieving synchronization between them.
    The sequence is to be printed is B-A-C usinf three different threads*/ 


class sequence{
    int counter;
    
    synchronized void printA(){
        while(counter!=1){
            if(counter!=1){
                try{
                    wait();
                }catch(Exception e){}
            }
        }

        counter=2;
        System.out.println(Thread.currentThread().getName()+" printing A");
        notifyAll();

    }
    synchronized void printB(){
        while(counter!=0){
            if(counter!=0){
                try{
                    wait();
                }catch(Exception e){}
            }
        }
        

        counter=1;
        System.out.println(Thread.currentThread().getName()+" printing B");
        notifyAll();

    }
    synchronized void printC(){
        while(counter!=2){
            if(counter!=2){
                try{
                    wait();
                }catch(Exception e){}
            }
        }

        counter=0;
        System.out.println(Thread.currentThread().getName()+" printing C");
        notifyAll();

    }
}

class writerThreads extends Thread{
    sequence s;
    writerThreads(sequence s){
        this.s=s;
    }

    public void run(){
        int i=0;
        while(i<10){
            if(Thread.currentThread().getName().equals("ThreadA"))
                s.printA();
            else if(Thread.currentThread().getName().equals("ThreadB"))
                s.printB();
            else
                s.printC();
            
            i++;
        }
    }
}



class trial{

    public static void main(String[] args) {
        sequence s= new sequence();
        writerThreads w1= new writerThreads(s);
        w1.setName("ThreadA");
        writerThreads w2= new writerThreads(s);
        w2.setName("ThreadB");
        writerThreads w3= new writerThreads(s);
        w3.setName("ThreadC");
        w1.start();
        w2.start();
        w3.start();

        
    }
}