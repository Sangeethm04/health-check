public class VehicleRepairs extends Illness { 
    public VehicleRepairs(String name, String description, String treatment, String[] symptoms, String[] causes) {
        super(name, description, treatment, symptoms, causes);
    }

    public String getName() {
        return super.getName();
    }

    public String getDescription() {
        return super.getDescription();
    }

    public String getTreatment() {
        return super.getTreatment();
    }

    public String[] getSymptoms() {
        return super.getSymptoms();
    }

    public String[] getCauses() {
        return super.getCauses();
    }

}
