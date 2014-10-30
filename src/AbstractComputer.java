/**
 * AbstractComputer.java
 *
 * Calvin Wong
 *
 * Class that represents a computer.
 */
public abstract class AbstractComputer {

    private String manufacturer;
    private String processor;
    private double ramSize;
    private int diskSize;
    private double processorSpeed;

    public AbstractComputer(String man, String processor, double ram, int disk, double procSpeed) {

        manufacturer = man;
        this.processor = processor;
        ramSize = ram;
        diskSize = disk;
        processorSpeed = procSpeed;
    }

    public double computePower() {
        return ramSize * processorSpeed;
    }

    public double getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public void setManufacurer(String man) {
        manufacturer = man;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamSize(int ram) {
        ramSize = ram;
    }

    public void setDiskSize(int disk) {
        diskSize = disk;
    }

    public void setProcessorSpeed(double procSpeed) {
        processorSpeed = procSpeed;
    }

    public String getRamSize(String s) {
        return Double.toString(ramSize);
    }

    @Override
    public String toString() {
        String result = "Manufacturer: " + manufacturer + "\nCPU: "
                + processor + "\nRAM: " + ramSize + " gigabytes"
                + "\nDisk: " + diskSize + " gigabytes"
                + "\nProcessor speed: " + processorSpeed + " gigahertz";

        return result;
    }

    //public abstract double costBenefit();
} // end of class

