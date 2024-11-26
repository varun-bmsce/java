package CIE;

public class Internals {
    int[] internalMarks = new int[5];  

    public void setInternalMarks(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            internalMarks[i] = marks[i];
        }
    }

    public int[] getInternalMarks() {
        return internalMarks;
    }
}
