public class PagIbigQue {
    public static void main(String[] args) {
        QueueManager queueManager = QueueManager.getInstance();

      
        System.out.println("Visitor 1 Queue Number: " + queueManager.getNextNumber());
        System.out.println("Visitor 2 Queue Number: " + queueManager.getNextNumber());

        
        queueManager.resetQueue(5);
        

        System.out.println("Visitor 3 Queue Number: " + queueManager.getNextNumber());
        System.out.println("Visitor 4 Queue Number: " + queueManager.getNextNumber());

        System.out.println("Current Queue Number: " + queueManager.getCurrentNumber());
    }
}
