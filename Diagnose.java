import java.util.*;

public class Diagnose {
    public static void main(String[] args) {
        Illness covid = new Illness("COVID-19", "A virus that causes COVID-19", "Stay home except to get medical care. \nMonitor your symptoms carefully. If your symptoms get worse, call your healthcare provider immediately.\nGet rest and stay hydrated. Take over-the-counter medicines, such as acetaminophen, to help you feel better. \nIf you have a medical appointment, notify your healthcare provider ahead of time that you have or may have COVID-19. \nStay in a specific room and away from other people in your home. If possible, use a separate bathroom. If you must be around others, wear a mask.", new String[] {
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
        Illness lungCancer = new Illness("Lung Cancer", "Two major types of lung cancer are non-small cell lung cancer and small cell lung cancer. Causes of lung cancer include smoking, secondhand smoke, exposure to certain toxins, and family history. Symptoms include cough (often with blood), chest pain, wheezing, and weight loss. These symptoms often don't appear until the cancer is advanced.Treatments vary but may include surgery, chemotherapy, radiation therapy, targeted drug therapy, and immunotherapy.", "Surgery\nchemotherapy\n radiation therapy\ntargeted drug therapy\nimmunotherapy", new String[] {
            "cough (often with blood)",
            "chest pain",
            "wheezing",
            "weight loss",
        }, new String[] {
            "Causes of lung cancer include smoking, secondhand smoke, exposure to certain toxins, and family history.",
        });
        Illness stroke = new Illness("Stroke", "A stroke is a medical emergency. Symptoms of stroke include trouble walking, speaking, and understanding, as well as paralysis or numbness of the face, arm, or leg.Early treatment with medications like tPA (clot buster) can minimize brain damage. Other treatments focus on limiting complications and preventing additional strokes.", "Early treatment with medications like tPA (clot buster) can minimize brain damage. Other treatments focus on limiting complications and preventing additional strokes.", new String[] {
            "Sudden confusion",
            "trouble speaking",
            "difficulty understanding speech",
            "dizziness",
            "loss of balance",
            "lack of coordination",

        }, new String[] {
            "Causes of Stoke include a blocked artery (ischemic stroke) or leaking or bursting of a blood vessel (hemorrhagic stroke)",
        });
        Illness diabetes = new Illness("Diabetes", "Diabetes is a condition in which the body's sugar levels are too high. Symptoms include high blood sugar, thirst, and fatigue. Treatment includes medication to control blood sugar levels and insulin. The treatment is often done with insulin, but it can also be done with medication called insulin-dependent diabetes mellitus (IDDM).", "Insulin\nInsulin-dependent diabetes mellitus (IDDM)", new String[] {
            "high blood sugar",
            "thirst",
            "fatigue",
        }, new String[] {
            "Weight. The more fatty tissue you have, the more resistant your cells become to insulin. \nInactivity. The less active you are, the greater your risk. \nFamily history",
        });
        Illness heartDisease = new Illness("Heart Disease", "Heart disease is a condition in which the heart muscle is damaged. Symptoms include chest pain, shortness of breath, dizziness, and fatigue. Treatment includes medication to control blood pressure and blood sugar levels. The treatment is often done with insulin, but it can also be done with medication called insulin-dependent diabetes mellitus (IDDM).", "Insulin\nInsulin-dependent diabetes mellitus (IDDM)", new String[] {
            "chest pain",
            "shortness of breath",
            "dizziness",
            "fatigue",
        }, new String[] {
            "Weight. The more fatty tissue you have, the more resistant your cells become to insulin. \nInactivity. The less active you are, the greater your risk. \nFamily history",
        });





        ArrayList < Illness > illnesses = new ArrayList < Illness > ();
        illnesses.add(covid);
        illnesses.add(lungCancer);
        illnesses.add(stroke);
        illnesses.add(diabetes);
        illnesses.add(heartDisease);

        for (int i = 0; i < illnesses.size(); i++) {
            if (i == 0) {
                System.out.print("We diagnose: ");
            }
            System.out.print(illnesses.get(i).getName() + ", ");
        }
        System.out.println();
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your symptoms: ");
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
                            System.out.println("Treatments: ");
                            System.out.println(illness.getTreatment());
                            System.out.println();
                            System.out.println("Symptoms of " + illness.getName() + ": ");
                            for (String symptomName: illness.getSymptoms()) {
                                System.out.println(symptomName);
                            }
                            System.out.println();
                        }
                    }
                }

            }
        }
    }
}