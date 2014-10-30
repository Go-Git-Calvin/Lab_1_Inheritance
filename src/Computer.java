/**
 * Created by Calvin Wong on 10/30/14.
 */
public class Computer extends AbstractComputer {

    private double screenSize;
    private double weight;

    public Computer(String man, String proc, double ram, int disk,
                    double procSpeed, double screen, double wei) {

        super(man, proc, ram, disk, procSpeed);
        screenSize = screen;
        weight = wei;
    }

    public Computer(String processor, double ram, int disk) {
        this("Default", processor, ram, disk, 2.5, 17, 5.5);
    }

    public double getScreenSize() {
        return screenSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setScreenSize(double screen) {
        screenSize = screen;
    }

    public void setWeight(double wei) {
        weight = wei;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass() == this.getClass()) {
            Computer other = (Computer) obj;

            return getManufacturer().equals(other.getManufacturer())
                    && getProcessor().equals(other.getProcessor())
                    && (getRamSize() == other.getRamSize())
                    && (getDiskSize() == other.getDiskSize())
                    && (getProcessorSpeed() == other.getProcessorSpeed())
                    && (getScreenSize() == other.getScreenSize())
                    && (getWeight() == other.getWeight());
        } else {
            return false;
        }
    }
} // end of class

