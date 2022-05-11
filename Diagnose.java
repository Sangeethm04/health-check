import java.util.*;

public class Diagnose {
    public static void main(String[] args) {
        Illness covid = new Illness("COVID-19", "A virus that causes COVID-19", "Treat with antibiotics", new String[] {"fever", "cough", "shortness of breath"}, new String[] {"sick", "cold", "flu"});
        Illness flu = new Illness("FLU", "A virus that causes FLU", "Treat with antibiotics", new String[] {"fever", "cough", "shortness of breath"}, new String[] {"sick", "cold", "flu"});
        Illness cold = new Illness("COLD", "A virus that causes COLD", "Treat with antibiotics", new String[] {"fever", "cough", "shortness of breath"}, new String[] {"sick", "cold", "flu"});
        Illness headache = new Illness("HEADACHE", "A virus that causes HEADACHE", "Treat with antibiotics", new String[] {"fever", "cough", "shortness of breath"}, new String[] {"sick", "cold", "flu"});
        Illness soreThroat = new Illness("SORE THROAT", "A virus that causes SORE THROAT", "Treat with antibiotics", new String[] {"fever", "cough", "shortness of breath"}, new String[] {"sick", "cold", "flu"});
        Illness diarrhea = new Illness("DIARRHEA", "A virus that causes DIARRHEA", "Treat with antibiotics", new String[] {"fever", "cough", "shortness of breath"}, new String[] {"sick", "cold", "flu"});
        Illness fever = new Illness("FEVER", "A virus that causes FEVER", "Treat with antibiotics", new String[] {"fever", "cough", "shortness of breath"}, new String[] {"sick", "cold", "flu"});    

        ArrayList<Illness> illnesses = new ArrayList<Illness>();
        illnesses.add(covid);
        illnesses.add(flu);
        illnesses.add(cold);
        illnesses.add(headache);
        illnesses.add(soreThroat);
        illnesses.add(diarrhea);
        illnesses.add(fever);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your symptoms: ");
        String symptoms = scan.nextLine();
        String[] symptomsArray = symptoms.split(",");
        for(String symptom : symptomsArray) {
            if(illnesses.getSymptoms.equals(symptom)) {
                System.out.println(illnesses.getSymptoms.getName());
            }
        
    }
}
