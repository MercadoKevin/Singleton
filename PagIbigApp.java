public class PagIbigApp {
   
    private static QueueManager instance;
  
    private int currentNumber;
   
  private QueueManager() {
        this.currentNumber = 1;  
    }

    public static QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    public int getNextNumber() {
        return currentNumber++;
    }

    public void resetQueue(int number) {
        if (number > 0) { 
            this.currentNumber = number;
        } else {
            System.out.println("Invalid queue number. Reset number must be positive.");
        }
    }

    public int getCurrentNumber() {
        return currentNumber;
    }
}
