package org.codingPractice;

    class RunnableTest implements Runnable {
        private Thread t;
        private String threadName;

        RunnableTest( String name) {
            threadName = name;
            System.out.println("Created " +  threadName );
        }

        public void run() {
            System.out.println("Currently Running " +  threadName );
            try {
                for(int i = 4; i > 0; i--) {
                    System.out.println("Thread is: " + threadName + ", " + i);
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread is " +  threadName + " interrupted.");
            }
            System.out.println("Thread is " +  threadName + " exiting!!!");
        }


        public void start () {
            System.out.println("Starting now " +  threadName );
            if (t == null) {
                t = new Thread (this, threadName);
                t.start ();
            }
        }
    }

    class TestThread {

        public static void main(String args[]) {
            RunnableTest obj1 = new RunnableTest( "Thread1");
            obj1.start();

            RunnableTest obj2 = new RunnableTest( "Thread2");
            obj2.start();
        }
    }


