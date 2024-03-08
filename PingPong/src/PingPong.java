public class PingPong implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("Ping");
            System.out.println("Pong");

            try {
                Thread.sleep(2000);
            } catch (Exception e){
                e.getMessage();
            }
        }
    }
}
