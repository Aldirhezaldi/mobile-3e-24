package org.aplas.basicappx;

public class Distance {

    private double meter;

    public Distance(){
        this.meter=0;
    }

    public void setMeter(double m) {
        this.meter = m;
    }

    public void setInch(double m){
        this.meter = m/39.3701;
    }

    public void setMile(double m){
        this.meter = m/0.000621371;
    }

    public void setFoot(double m){
        this.meter = m/3.28084;
    }

    public double getMeter(){
        return meter;
    }

    public double getInch(){
        return meter*39.3701;
    }

    public double getMile(){
        return meter*0.000621371;
    }

    public double getFoot(){
        return meter*3.28084;
    }

    public double convert(String oriUnit, String convUnit, double value){
        // Mtr to Mtr
        if (oriUnit.equals("Mtr") && convUnit.equals("Mtr")){
            setMeter(value);
            return getMeter();
        }
        // Mtr to Inc
        else if (oriUnit.equals("Mtr") && convUnit.equals("Inc")){
            setMeter(value);
            return getInch();
        }
        // Mtr to Mil
        else if (oriUnit.equals("Mtr") && convUnit.equals("Mil")){
            setMeter(value);
            return getMile();
        }
        // Mtr to Ft
        else if (oriUnit.equals("Mtr") && convUnit.equals("Ft")){
            setMeter(value);
            return getFoot();
        }
        // Inc to Mtr
        else if (oriUnit.equals("Inc") && convUnit.equals("Mtr")){
            setInch(value);
            return getMeter();
        }
        // Inc to Inch
        else if (oriUnit.equals("Inc") && convUnit.equals("Inc")){
            setInch(value);
            return getInch();
        }
        // Inc to Mil
        else if (oriUnit.equals("Inc") && convUnit.equals("Mil")){
            setInch(value);
            return getMile();
        }
        // Inc to Ft
        else if (oriUnit.equals("Inc") && convUnit.equals("Ft")){
            setInch(value);
            return getFoot();
        }
        // Mil to Mtr
        else if (oriUnit.equals("Mil") && convUnit.equals("Mtr")){
            setMile(value);
            return getMeter();
        }
        // Mil to Inc
        else if (oriUnit.equals("Mil") && convUnit.equals("Inc")){
            setMile(value);
            return getInch();
        }
        // Mil to Mil
        else if (oriUnit.equals("Mil") && convUnit.equals("Mil")){
            setMile(value);
            return getMile();
        }
        // Mil to Ft
        else if (oriUnit.equals("Mil") && convUnit.equals("Ft")){
            setMile(value);
            return getFoot();
        }
        // Ft to Mtr
        else if (oriUnit.equals("Ft") && convUnit.equals("Mtr")){
            setFoot(value);
            return getMeter();
        }
        // Ft to Inc
        else if (oriUnit.equals("Ft") && convUnit.equals("Inc")){
            setFoot(value);
            return getInch();
        }
        // Ft to Mil
        else if (oriUnit.equals("Ft") && convUnit.equals("Mil")){
            setFoot(value);
            return  getMile();
        }
        // Ft to Ft
        else{
            setFoot(value);
            return getFoot();
        }
    }
}
