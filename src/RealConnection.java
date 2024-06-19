public class RealConnection implements Internet{

    @Override
    public void connect(String server){
        System.out.println("Connecting with... " + server);
    }
}
