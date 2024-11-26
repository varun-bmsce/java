package SEE;

import CIE.Student;

public class External extends Student {
    int[] externalMarks = new int[5];  
    public External(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void setExternalMarks(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            externalMarks[i] = marks[i];
        }
    }

    public int[] getExternalMarks() {
        return externalMarks;
    }
}
