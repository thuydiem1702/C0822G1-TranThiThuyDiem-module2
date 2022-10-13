package ss7_abstract_class_interface.exercise.interfac_colorable;

public class SquareColorable extends Square implements Colorable {
    SquareColorable(){};
    public SquareColorable(double size){
        super(size);
    }

    @Override
    public void howToColor() {
        System.out.println(" Color All Four Size");
    }
}
