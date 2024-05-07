package OOP;

class Electron implements Particle{
    private double mass;
    private double spin;
    private int charge;
    @Override
    public double getMass(){
        return mass;
    }

    @Override
    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public double getSpin() {
        return spin;
    }

    @Override
    public void setSpin(double spin) {
        this.spin = spin;

    }

    @Override
    public int getCharge() {
        return charge;
    }

    @Override
    public void setCharge(int charge) {
        this.charge = charge;
    }

}