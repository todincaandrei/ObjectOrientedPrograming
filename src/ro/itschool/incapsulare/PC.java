package ro.itschool.incapsulare;

public class PC {

    private int numarProcesoare;
    private int memorieRam;
    private int capacitateHDD;


    public void setNumarProcesoare(int nrProcesoare) {
        if (nrProcesoare > 0) {
            numarProcesoare = nrProcesoare;
        }
    }


    public void setMemorieRam(int memorieRam) {
        if (memorieRam > 0) {
            this.memorieRam = memorieRam;
        }
    }


    public void setCapacitateHDD(int capacitateHDD) {
        if (capacitateHDD > 0) {
            this.capacitateHDD = capacitateHDD;
        }
    }

    public int getMemorieRam(){
        return this.memorieRam;
    }
    public int getNumarProcesoare(){
        return this.numarProcesoare;
    }
    public int getCapacitateHDD(){
        return this.capacitateHDD;
    }
}
