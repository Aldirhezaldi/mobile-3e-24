package org.aplas.basicappx;

public class Weight {

    private double gram;

    public Weight(){
        this.gram=0;
    }

    public void setGram(double g) {
        this.gram = g;
    }

    public void setOunce(double g){
        this.gram = g*28.3495231;
    }

    public void setPound(double g){
        this.gram = g*453.59237;
    }

    public double getGram() {
        return gram;
    }

    public double getOunce(){
        return gram/28.3495231;
    }

    public double getPound(){
        return gram/453.59237;
    }

    public double convert(String oriUnit, String convUnit, double value){
        // Grm to Grm
        if (oriUnit.equals("Grm") && convUnit.equals("Grm")){
            setGram(value);
            return getGram();
        }
        // Grm to Onc
        else if (oriUnit.equals("Grm") && convUnit.equals("Onc")){
            setGram(value);
            return getOunce();
        }
        // Grm to Pnd
        else if (oriUnit.equals("Grm") && convUnit.equals("Pnd")){
            setGram(value);
            return getPound();
        }
        // Onc to Grm
        else if (oriUnit.equals("Onc") && convUnit.equals("Grm")){
            setOunce(value);
            return getGram();
        }
        // Onc to Onc
        else if (oriUnit.equals("Onc") && convUnit.equals("Onc")){
            setOunce(value);
            return getOunce();
        }
        // Onc to Pnd
        else if (oriUnit.equals("Onc") && convUnit.equals("Pnd")){
            setOunce(value);
            return getPound();
        }
        // Pnd to Grm
        else if (oriUnit.equals("Pnd") && convUnit.equals("Grm")){
            setPound(value);
            return getGram();
        }
        // Pnd to Onc
        else if (oriUnit.equals("Pnd") && convUnit.equals("Onc")){
            setPound(value);
            return getOunce();
        }
        // Pnd to Pnd
        else{
            setPound(value);
            return getPound();
        }
    }
}
