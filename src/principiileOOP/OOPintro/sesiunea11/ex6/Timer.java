package sesiunea11.ex6;

public class Timer {
    long startTime;
    long endTime;
    boolean isRunning;

    public Timer() {
//        this.startTime = 0;
//        this.endTime = 0;
//        this.isRunning = false;
    }

        public void start () {
            //setam isRunning pe true;
            //dam la start time valoare timpului curent in milisecunde
            if (isRunning) {
                System.out.println("Timer already running");
                return;
            }
            this.isRunning = true;
            startTime = System.currentTimeMillis();
        }


        public void stop () {
            if (!isRunning) {
                System.out.println("timer is not running");
                return;
            }
            this.isRunning = false;
            endTime = System.currentTimeMillis();
        }

        public void reset () {
            isRunning = false;
            startTime = 0;
            endTime = 0;
        }

        public long getElapsedTime() {

            //daca merge cronometru
                 //facem diferenta dintrre curentTime si startTim
            // altfel
              //facem diferenta dintre endtime si  startTime
            if (isRunning) {
                System.out.println("timer still running");
                return System.currentTimeMillis() - startTime;
            } else {
                System.out.println("timer stopped");
            }
                return endTime - startTime;
            }
        }
