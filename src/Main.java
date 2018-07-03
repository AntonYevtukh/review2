/**
 * Created by Anastasiia Prodan on 29.06.2018.
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();

        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
