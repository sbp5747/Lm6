package edu.psu.abington.ist.ist242;

import java.awt.event.*;
import javax.swing.*;

public class StudentView extends JFrame{

        final private JTextField currentStudentField;
        final private JButton getStudentButton;
        final private JButton getAssignmentButton;
        final private StudentModel model;

        // constructor for the GUI
        StudentView(StudentModel model){
            this.model = model;
            this.currentStudentField = new JTextField(20);
            this.getStudentButton = new JButton("Get Student");
            this.getAssignmentButton = new JButton("Get Assignment");

            JPanel content = new JPanel();
            content.add(currentStudentField);
            content.add(getStudentButton);
            content.add(getAssignmentButton);

            this.setContentPane(content);
            this.pack();
            this.setTitle("Student MVC Example");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public void addStudentButtonListener (ActionListener al){

            getStudentButton.addActionListener(al);
        }

        public void addAssignmentButtonListener (ActionListener al){
            getAssignmentButton.addActionListener(al);
        }
        /**
         * displays results of getStudentButton on the monitor
         * @param newStudent
         */
        public void setCurrentStudent(String newStudent){

            currentStudentField.setText(newStudent);
        }
}
