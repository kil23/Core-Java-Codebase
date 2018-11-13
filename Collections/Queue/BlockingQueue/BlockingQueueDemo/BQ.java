/*
- Useful in implementing Producer-Consumer Problem where one thread is producing and other thread is consuming.
- It has multiple types of methods that can be useful.
- Method that throws Exception: add(o), remove(o), element() which returns true or throws Exception.
- Method with special value: offer(o), poll(), peek() which returns null or true.
- Method that blocks: put(o), take() which waits until operation is completed.
- Method with Timeouts: offer(o, timeout, timeunit), poll(timeout, timeunit) which waits for specified time.
*/

import java.util.concurrent.*;

class BQ{
  public static void main(String[] args) {
    BlockingQueue queue = new ArrayBlockingQueue(1024);

    Producer p = new Producer(queue);
    Consumer c = new Consumer(queue);

    new Thread(p).start();
    new Thread(c).start();

    try{
      Thread.sleep(4000);
    }catch(InterruptedException e){
      System.out.println(e);
    }
  }
}

class Producer implements Runnable{
    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue){
      this.queue = queue;
    }

    public void run(){
      try{
          for(int i=1;i<100;i++){
            System.out.println("producing "+i);
            queue.put(i); // put() will go into block state until producing operation is completed.
                          // you can also use offer(i, timeout, timeunit) which blocks for a given time.Returns true if sucessful.
            Thread.sleep(100);
          }
      }catch(InterruptedException e){
        System.out.println(e);
      }
    }
}

class Consumer implements Runnable{
  protected BlockingQueue queue = null;

  public Consumer(BlockingQueue queue){
    this.queue = queue;
  }

  public void run(){
    try{
        for(int i=1;i<=100;i++){
          Thread.sleep(100);
          System.out.println(queue.take()+ " consuming"); // take() will go into block state until the operation is completed of consuming.
                                        // you can also use poll(timeout, timeunit) which blocks for a given time.Returns true if sucessful.
        }
    }catch(InterruptedException e){
      System.out.println(e);
    }
  }
}
