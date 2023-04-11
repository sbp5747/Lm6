package edu.psu.abington.ist.ist242;

import java.awt.event.*;

public class StudentController {

    private StudentModel model;
    private StudentView view;

    StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
        // override of the Button Listener
        class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent ev) {
                if ("Get Student".equals(ev.getActionCommand())) {
                    view.setCurrentStudent(model.getStudent());
                } else {
                    view.setCurrentStudent(model.getAssignment());
                }
            }
        }

        view.addStudentButtonListener(new ButtonListener());
        view.addAssignmentButtonListener(new ButtonListener());
    }
}
