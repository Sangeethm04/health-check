
public class Illness {
    private String name;
    private String description;
    private String treatment;
    private String[] symptoms;
    private String[] causes;

    public Illness(String name, String description, String treatment, String[] symptoms, String[] causes) {
        this.name = name;
        this.description = description;
        this.treatment = treatment;
        this.symptoms = symptoms;
        this.causes = causes;
    }

    /**
     * Illness.java
     * This method returns the name of the illness
     * @return name
     */
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTreatment() {
        return treatment;
    }

    public String[] getSymptoms() {
        return symptoms;
    }

    public String[] getCauses() {
        return causes;
    }
}