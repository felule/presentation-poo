package heritage.model;

public class FilsB extends Pere {

    private String blaze;

    public FilsB(String blaze) {
        this.blaze = blaze;
    }

    @Override
    public String paroleDeFils() {
        return "Voici mon blaze " + this.blaze + "\n"
                + "Mon " + super.getParent() + " dit : \n" + this.explication();
    }

}
