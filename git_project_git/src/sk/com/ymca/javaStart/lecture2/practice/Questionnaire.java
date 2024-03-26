package sk.com.ymca.javaStart.lecture2.practice;

public class Questionnaire {
    public static void main(String[] args) {
        String name = "Maksim";
        String surname = "Melnychenko";
        char index = '@';
        final int DATEOFBIRTH = 24102007; // Here should be just the day and month of your birth. Think about data type.
        double yearsOld = 16.4; // In the task I didn't write about age in the questionnaire. This variable is redunded.
        boolean checkForRobot = false;

        System.out.println("Name = " + name + ", surname = " + surname + ", index = " + index + ", date of birth = "
        + DATEOFBIRTH + ", Years old = " + yearsOld + ", check for robot = " + checkForRobot);
    }
}
