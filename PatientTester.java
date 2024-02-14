public class PatientTester {
    public static void main(String[] args){
        PatientManager patMan = new PatientManager();
        System.out.println(patMan);

        for(int i = 1; i <= 4; i++){
            Patient addPat = new Patient(i, i * 200);
            patMan.AddPatient(addPat);
        }
        System.out.println(patMan);
        // Would like to find a way to cast the caffeineLvl double to an int, so that it looks more uniform on the output
        // int caffInt = (int) caffeineLvl;

        patMan.caffeineAbsorption();
        patMan.caffeineAbsorption();
        System.out.println(patMan);

        patMan.RemovePatient(3);
        System.out.println(patMan);
    }   
}
