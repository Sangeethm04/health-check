import java.util.*;

public class Diagnose {
    public static void main(String[] args) {
        Illness covid = new Illness("COVID-19", "A virus that causes COVID-19", "Stay home except to get medical care. \nMonitor your symptoms carefully. If your symptoms get worse, call your healthcare provider immediately.\nGet rest and stay hydrated. Take over-the-counter medicines, such as acetaminophen, to help you feel better. \nIf you have a medical appointment, notify your healthcare provider ahead of time that you have or may have COVID-19. \nStay in a specific room and away from other people in your home. If possible, use a separate bathroom. If you must be around others, wear a mask.", new String[] {
            "fever",
            "cough",
            "muscle aches",
            "headache",
            "chills",
            "sore throat",
        }, new String[] {
            "Close contact (within 6 feet, or 2 meters) with someone who has COVID-19.",
        });
        Illness lungCancer = new Illness("Lung Cancer", "Two major types of lung cancer are non-small cell lung cancer and small cell lung cancer. Causes of lung cancer include smoking, secondhand smoke, exposure to certain toxins, and family history. Symptoms include cough (often with blood), chest pain, wheezing, and weight loss. These symptoms often don't appear until the cancer is advanced.Treatments vary but may include surgery, chemotherapy, radiation therapy, targeted drug therapy, and immunotherapy.", "Surgery\nchemotherapy\nradiation therapy\ntargeted drug therapy\nimmunotherapy", new String[] {
            "cough (with blood)",
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
        Illness diabetes = new Illness("Diabetes", "Diabetes is a condition in which the body's sugar levels are too high. Symptoms include high blood sugar, thirst, and fatigue. Treatment includes medication to control blood sugar levels and insulin. The treatment is often done with insulin, but it can also be done with medication called insulin-dependent diabetes mellitus (IDDM).", "Beta-blockers are one of the most widely prescribed class of drugs to treat hypertension (high blood pressure). They are a mainstay treatment for congestive heart failure. These relax blood vessels and increase the supply of blood and oxygen to the heart. They also reduce the heart's workload.", new String[] {
            "high blood sugar",
            "thirst",
            "fatigue",
        }, new String[] {
            "Weight. The more fatty tissue you have, the more resistant your cells become to insulin. \nInactivity. The less active you are, the greater your risk. \nFamily history",
        });
        Illness heartDisease = new Illness("Heart Disease", "Heart disease is a condition in which the heart muscle is damaged. Symptoms include chest pain, shortness of breath, dizziness, and fatigue.", "low-fat and low-sodium diet, getting at least 30 minutes of moderate exercise on most days of the week, quitting smoking, and limiting alcohol intake", new String[] {
            "chest pain",
            "shortness of breath",
            "dizziness",
            "fatigue",
        }, new String[] {
            "Weight. The more fatty tissue you have, the more resistant your cells become to insulin. \nInactivity. The less active you are, the greater your risk. \nFamily history",
        });
        // Alzheimer
        Illness Alzheimer = new Illness("Alzheimer", "Alzheimer's disease is a long-term condition in which the brain's neurons are damaged. Symptoms include memory loss, confusion, and trouble concentrating.", "Treatment consists of cognition enhancing medications\nNo cure exists, but medications and management strategies may temporarily improve symptoms.", new String[] {
            "memory loss",
            "confusion",
            "trouble concentrating",
        }, new String[] {
            "Combination of age-related changes in the brain, along with genetic, environmental, and lifestyle factors",
        });
        Illness KidneyDisease = new Illness("Kidney Disease", "KKidney disease means your kidneys are damaged and can't filter blood the way they should", "kidney transplant or dialysis", new String[] {
            "nausea",
            "vomiting",
            "muscle cramps",
            "loss of appetite",
            "swelling",
            "itchy skin",
            "trouble sleeping",
        }, new String[] {
            "Diabetes and high blood pressure are the most common causes of chronic kidney disease",
        });
        Illness HIV_AIDS = new Illness("HIV/AIDS", "HIV (human immunodeficiency virus) is a virus that attacks the body's immune system. If HIV is not treated, it can lead to AIDS (acquired immunodeficiency syndrome).", "HIV/AIDS is a viral infection that causes AIDS. Symptoms include fever, fatigue, and dry cough. Treatment includes medication to prevent HIV/AIDS and to treat symptoms.", new String[] {
            "fever",
            "fatigue",
            "dry cough",
        }, new String[] {
            "HIV/AIDS is a viral infection that causes AIDS. Symptoms include fever, fatigue, and dry cough. Treatment includes medication to prevent HIV/AIDS and to treat symptoms.",
        });
        Illness death = new Illness("Death", "A person dies", "Sorry", new String[] {
            "no pulse",
            "no brain activity",
            "not breathing",
        }, new String[] {
            "death",
        });

        ArrayList < Illness > illnesses = new ArrayList < Illness > ();
        illnesses.add(covid);
        illnesses.add(lungCancer);
        illnesses.add(stroke);
        illnesses.add(diabetes);
        illnesses.add(heartDisease);
        illnesses.add(Alzheimer);
        illnesses.add(KidneyDisease);
        illnesses.add(HIV_AIDS);
        illnesses.add(death);



        for (int i = 0; i < illnesses.size(); i++) {
            if (i == 0) {
                System.out.print("We diagnose: ");
            }
            System.out.print(illnesses.get(i).getName() + ", ");
        }
        System.out.println();
        System.out.print("Available Symptoms: ");
        String[][] symtopms = {
            {
                "fever",
                "cough",
                "muscle aches",
                "headache",
                "chills",
                "sore throat",
                "cough (with blood)",
                "chest pain",
                "wheezing",
                "weight loss",
                "Sudden confusion",
                "trouble speaking",
                "difficulty understanding speech",
                "dizziness",
                "loss of balance",
                "lack of coordination",
                "high blood sugar",
                "thirst",
                "fatigue",
                "shortness of breath",
                "memory loss",
                "confusion",
                "trouble concentrating",
                "nausea",
                "vomiting",
                "muscle cramps",
                "loss of appetite",
                "swelling",
                "itchy skin",
                "trouble sleeping",
                "dry cough"
            },
            {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "11",
                "12",
                "13",
                "14",
                "15",
                "16",
                "17",
                "18",
                "19",
                "20",
                "21",
                "22",
                "23",
                "24",
                "25",
                "26",
                "27",
                "28",
                "29",
                "30",
                "31",
            }
        };

        //print each symptom then the corresponding number 
        for (int i = 0; i < symtopms[0].length; i++) {
            System.out.print(symtopms[0][i] + ": " + symtopms[1][i] + ", ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Please type each symptom with a comma and a space.\n");
        //ask user for input
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your symptoms: ");
            String symptoms = scan.nextLine();
            String[] symptomArray = symptoms.split(", ");
            for (Illness illness: illnesses) {
                boolean match = true;
                //check if user symptoms match any illness symptoms
                for (int j = 0; j < symptomArray.length; j++) {
                    if (!Arrays.asList((illness).getSymptoms()).contains(symptomArray[j])) {
                        match = false;
                        break;
                    }

                }
                if (match) {
                    System.out.println("You May Have " + illness.getName());
                    System.out.println(illness.getDescription());
                    System.out.println();
                    System.out.print("Symptoms: ");
                    for (String symptom: illness.getSymptoms()) {
                        System.out.print(symptom + ", ");
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println("Treatments: " + illness.getTreatment());
                    System.out.println();
                    System.out.print("Causes: ");
                    for (String cause: illness.getCauses()) {
                        System.out.print(cause);
                    } 
                }
            }
        }
    }
}