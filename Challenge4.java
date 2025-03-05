import javax.swing.JOptionPane;
/**
 * This project will ask for 3 different scores, will average them out, and output a grade.
 * @author Alan Doughman
 * @version v1.0
 * @since 3/3/25
 */
public class Challenge4 {
    public static void main (String[] args) {
        String grade1, grade2, grade3;
        char fingrade='A';
        double cgrade1=0, cgrade2=0, cgrade3=0, average;
        //"c" in cgrade refrences "converted grade"
        boolean validity = true;

        grade1 = JOptionPane.showInputDialog("What is your first score?");
        while (validity) {
            try {
                cgrade1 = Double.parseDouble(grade1);
                validity = false;
                if (cgrade1<0.0){
                    grade1 = JOptionPane.showInputDialog("Invalid input, please input a number larger than 0");
                    validity = true;
                }
            } catch (NumberFormatException e) {
                grade1 = JOptionPane.showInputDialog("Invalid input, please input a number");
                validity = true;
            }
        }
        validity = true;
        
        grade2 = JOptionPane.showInputDialog("What is your second score?");
        while (validity) {
            try {
                cgrade2 = Double.parseDouble(grade2);
                validity = false;
                if (cgrade2<0.0){
                    grade1 = JOptionPane.showInputDialog("Invalid input, please input a number larger than 0");
                    validity = true;
                }
            } catch (NumberFormatException e) {
                grade2 = JOptionPane.showInputDialog("Invalid input, please input a number");
                validity = true;
            }
        }
        validity = true;
        
        grade3 = JOptionPane.showInputDialog("What is your third score?");
        while (validity) {
            try {
                cgrade3 = Double.parseDouble(grade3);
                validity = false;
                if (cgrade3<0.0){
                    grade3 = JOptionPane.showInputDialog("Invalid input, please input a number larger than 0");
                    validity = true;
                }
            } catch (NumberFormatException e) {
                grade3 = JOptionPane.showInputDialog("Invalid input, please input a number");
                validity = true;
            }
        }
        
        average = (cgrade1 + cgrade2 + cgrade3)/3.0;
        
        if (average < 60.0) {
            fingrade = 'F';
        } else if ((average < 70.0)&&(average >= 60.0)) {
            fingrade = 'D';
        } else if ((average < 80.0)&&(average >= 70.0)) {
            fingrade = 'C';
        } else if ((average < 90.0)&&(average >= 80.0)) {
            fingrade = 'B';
        } else {
            fingrade = 'A';
        }
        
        JOptionPane.showMessageDialog(null, String.format("Your average score is: %,.1f\nYour grade is a: %c", average, fingrade));
        System.exit(0);
    }
}