class Shop{
    private static int materials;
    private boolean available=false;
    
    public synchronized void put(int value){
        while(available==true){
            try{
                wait();
            } 
            catch(InterruptedException ie){
            }
        }
    
        materials=value;
        available=true;
        notifyAll();
        System.out.println("Produced val " +materials);
    }
    
    public synchronized void get(){
        while(available==false){
            try{
                wait();
            }
            catch(InterruptedException ie){}
        }
        available=false;
        notifyAll();
        System.out.println("Consumed val " +materials);
    }   
}


class Producer extends Thread{
    private final Shop s;
    public Producer(Shop c){
        s=c;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            s.put(i);
        }
    }
}

class Consumer extends Thread{
    private final Shop s;
    public Consumer(Shop c){
        s=c;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            s.get();
        }
    }
}

class Ind{
    public static void main(String args[]){
        Shop c=new Shop();
        Producer p1=new Producer(c);
        Consumer c1=new Consumer(c);
        p1.start();
        c1.start();
    }
}