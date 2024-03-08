public class Main {
    public static void main(String[] args) {
         Thread pingPong = new Thread(new PingPong());

         pingPong.start();
    }
}