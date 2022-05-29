package Encapsulation;

public class EncapsulationTrue {

    private int attribut_read_only;
    private int attribut2_write_only;

    public EncapsulationTrue() {
        this.attribut_read_only = 2022;
        this.attribut2_write_only = 42;
    }

    public int getAttribut_read_only() {
        return attribut_read_only;
    }

    public void setAttribut2_write_only(int attribut2_write_only) {
        this.attribut2_write_only = attribut2_write_only;
    }
}
