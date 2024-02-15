package implementation.model;

public class Humain implements Communique, Vertebre {
    @Override
    public void moyenDeCommunication() {
        System.out.println("parle");
    }

    @Override
    public void nombreDeVertebre() {
        System.out.println("33");
    }
}
