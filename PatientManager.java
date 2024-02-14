public class PatientManager {
    public Patient[] spots;

    public PatientManager(){
        this.spots = new Patient[10];
    }
    
    public int AddPatient(Patient x){
        for(int i = 0; i < 10; i++){
            if(spots[i] == null){
                spots[i] = x;
                return i;
            }
        }
        return -1;
    }

    public Patient RemovePatient(int y){
        if(spots[y] != null){
            Patient removedPatient = spots[y];
            spots[y] = null;
            return removedPatient;
        }
        else{
            return spots[y];
        }
    }

    public void caffeineAbsorption(){
        for(int i = 0; i < 10; i++){
            if(spots[i] != null){
                spots[i].caffeineLvl = spots[i].caffeineLvl - 130;
                if(spots[i].caffeineLvl <= 0){
                    spots[i] = null;
                }
            }
            else{
                spots[i] = spots[i];
            }
        }
    }

    public String toString(){
        int emptyPatients = 0;
        String patientData = "";
        for(int i = 0; i < 10; i++){
            if(spots[i] != null){
                patientData += spots[i].idNumber + " " + spots[i].caffeineLvl + "\n";
            }
            else{
                emptyPatients = emptyPatients + 1;
            }
        }

        if(emptyPatients == 10){
            return "Empty";
        }
        else{
            return patientData;
        }
    }
}
