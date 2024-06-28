package sesiunea11.ex6live;

public class Timer {

     long startTime;
     long endTime;
     boolean isRunning;


     public Timer() {}

     public void start(){
          //setam isRunning pe true
          //dam la startTime valoarea timpului curent in milisecund
          if (isRunning){
               System.out.println("timer already running");
               return;
          }
          this.isRunning = true;
          startTime = System.currentTimeMillis();
     }

     public void stop(){
          if (!isRunning){
               System.out.println("timer is not running");
               return;
          }
          this.isRunning = false;
          endTime = System.currentTimeMillis();
     }

     public void reset(){
          isRunning = false;
          startTime = 0;
          endTime = 0;
     }

     public long getElapsedTime (){
          //daca merge cornometrul
               //facem diferenta dintre currentTime si startTime
          //altfel
               //facem diferenta dintre endTime si startTime
          if (isRunning){
               System.out.println("timer still running");
               return System.currentTimeMillis() - startTime;
          }
          else{
               System.out.println("timer stopped");
               return endTime - startTime;
          }
     }
}
