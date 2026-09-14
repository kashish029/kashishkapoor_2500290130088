public class usecase5{
    
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();
 
        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);
        t1.setName(name: "Counter1");
        t2.setName(name: "Counter2");
        t1.start();
        t2.start();
        // TODO: set t1 priority to Thread.MAX_PRIORITY
        // TODO: start both threads
    }
}

}
class TicketCounter implements Runnable{
    int avaialabletickets=3;
    @override
    public void run(){
        while(avaialabletickets>0)
            bookTickets();
    }
    synchronised void bookTickets(){
        if(avaialabletickets>0){
            avaialabletickets=ava-1;
            System.out.println("Ticket booked by " + Thread.currentThread().getName());
            System.out.println("left tickets are " + avaialabletickets);
        }
        else{
            System.out.println(x: "Tickets are sold out");
        }
    }
}