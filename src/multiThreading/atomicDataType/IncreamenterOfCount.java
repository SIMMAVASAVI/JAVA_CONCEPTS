package multiThreading.atomicDataType;

public class IncreamenterOfCount implements Runnable{

        private Count count;

        public IncreamenterOfCount(Count count) {
            this.count = count;
        }


        @Override
        public void run() {
            for(int i=0;i<1000;i++){
                System.out.println("AtomicCount: " + count.increamentAndGet());
            }
        }
    }
