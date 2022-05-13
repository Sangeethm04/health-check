import java.util.*;

public class Diagnose {
    public static void main(String[] args) {
        Illness covid = new Illness("COVID-19", "A virus that causes COVID-19", "Stay home except to get medical care. \n \nMonitor your symptoms carefully. If your symptoms get worse, call your healthcare provider immediately.\n\nGet rest and stay hydrated. Take over-the-counter medicines, such as acetaminophen, to help you feel better. \n\nIf you have a medical appointment, notify your healthcare provider ahead of time that you have or may have COVID-19. \n\nStay in a specific room and away from other people in your home. If possible, use a separate bathroom. If you must be around others, wear a mask.", new String[] {
            "fever",
            "cough",
            "muscle aches",
            "headache",
            "chills",
            "headache",
            "sore throat",
            "sadness"
        }, new String[] {
            "Close contact (within 6 feet, or 2 meters) with someone who has COVID-19.",
        });
        Illness flu = new Illness("FLU", "A virus that causes FLU", "Treat with antibiotics", new String[] {
            "fever",
            "chills",
            "muscle aches",
            "cough",
            "congestion",
            "headache",
            "fatigue",
        }, new String[] {
            "sick",
            "cold",
            "flu"
        });
        Illness cold = new Illness("COLD", "A virus that causes COLD", "Treat with antibiotics", new String[] {
            "fever",
            "cough",
            "shortness of breath"
        }, new String[] {
            "sick",
            "cold",
            "flu"
        });
        Illness headache = new Illness("HEADACHE", "A virus that causes HEADACHE", "Treat with antibiotics", new String[] {
            "fever",
            "cough",
            "shortness of breath"
        }, new String[] {
            "sick",
            "cold",
            "flu"
        });
        Illness soreThroat = new Illness("SORE THROAT", "A virus that causes SORE THROAT", "Treat with antibiotics", new String[] {
            "fever",
            "cough",
            "shortness of breath"
        }, new String[] {
            "sick",
            "cold",
            "flu"
        });
        Illness fever = new Illness("FEVER", "A virus that causes FEVER", "Treat with antibiotics", new String[] {
            "fever",
            "sad",
            "shortness of breath"
        }, new String[] {
            "sick",
            "cold",
            "flu"
        });

        ArrayList < Illness > illnesses = new ArrayList < Illness > ();
        illnesses.add(covid);
        illnesses.add(flu);
        illnesses.add(cold);
        illnesses.add(headache);
        illnesses.add(soreThroat);
        illnesses.add(fever);

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter your symptoms: ");
            String symptoms = scan.nextLine();
            String[] symptomsArray = symptoms.split(",");
            // search through symptoms in illnesses and print out the illnesses that match
            for (String symptom: symptomsArray) {
                for (Illness illness: illnesses) {
                    for (String illnessSymptom: illness.getSymptoms()) {
                        if (illnessSymptom.equals(symptom)) {
                            System.out.println("You May Have " + illness.getName());
                            System.out.println(illness.getDescription());
                            System.out.println();
                            System.out.println();
                            System.out.println(illness.getTreatment());
                            System.out.println();
                            System.out.println("Symptoms of " + illness.getName() + ": ");
                            for(String symptomName: illness.getSymptoms()) {
                                System.out.println(symptomName);
                            }
                        }
                    }
                }

            }
        }
    }
}