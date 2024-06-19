//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Internet internet = new ProxyInternet();

        internet.connect("Site1.com");
        internet.connect("site2.com");
        internet.connect("Google.com");
    }
}