/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package covoiturage.entities;

/**
 *
 * @author USER
 */
public class Trajet {
    private float logitudeDepart;
    private float latitudeDepart;
    private float logitudeArrive;
    private float latitudeArrive;

    public float getLogitudeDepart() {
        return logitudeDepart;
    }

    public float getLatitudeDepart() {
        return latitudeDepart;
    }

    public float getLogitudeArrive() {
        return logitudeArrive;
    }

    public float getLatitudeArrive() {
        return latitudeArrive;
    }

    public void setLogitudeDepart(float logitudeDepart) {
        this.logitudeDepart = logitudeDepart;
    }

    public void setLatitudeDepart(float latitudeDepart) {
        this.latitudeDepart = latitudeDepart;
    }

    public void setLogitudeArrive(float logitudeArrive) {
        this.logitudeArrive = logitudeArrive;
    }

    public void setLatitudeArrive(float latitudeArrive) {
        this.latitudeArrive = latitudeArrive;
    }
    
}
