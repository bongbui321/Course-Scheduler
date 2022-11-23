
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author acv
 */

import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private String currentSemester; 
    private String currentStudentId;
    
    public MainFrame() {
        initComponents();
        rebuildSemesterComboBoxes();
        rebuildSelectedCourseJComboBox();
        rebuildSelectedStudentJComboBox();
        rebuildSelectedStudentJComboBox2();
        rebuildSelectStudentToDropCourseJComboBox();
        rebuildSelectCourseToDropJComboBox2();
        rebuildSelectCourseJComboBox();
        rebuildSelectStudentJComboBox();
        rebuildSelectCourseToDropJComboBox();
    }
    
    public void rebuildSemesterComboBoxes()
    {
        ArrayList<String> semesters = SemesterQueries.getSemesterList();
        currentSemesterComboBox.setModel(new javax.swing.DefaultComboBoxModel(semesters.toArray()));
        if (semesters.size() > 0)
        {
            currentSemesterLabel.setText(semesters.get(0));
            currentSemester = currentSemesterLabel.getText();
        }
        else
        {
            currentSemesterLabel.setText("None, add a semester.");
            currentSemester = "None";
        }
    }
    
    public void rebuildSelectedCourseJComboBox()
    {
        ArrayList<String> courses = CourseQueries.getAllCourseCode(currentSemester);
        selectedCourseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(courses.toArray()));
    }
    
    public void rebuildSelectedStudentJComboBox()
    {
        ArrayList<StudentEntry> students = StudentQueries.getAllStudents();
        ArrayList<String> studentNames = new ArrayList<>();
        for (StudentEntry student:students){
            studentNames.add(String.format("%s, %s", student.getLastName(), student.getFirstName()));
        }
        selectedStudentJComboBox.setModel(new javax.swing.DefaultComboBoxModel(studentNames.toArray())); 
    }
    
    public void rebuildSelectedStudentJComboBox2()
    {
        ArrayList<StudentEntry> students = StudentQueries.getAllStudents();
        ArrayList<String> studentNames = new ArrayList<>();
        for (StudentEntry student:students){
            studentNames.add(String.format("%s, %s", student.getLastName(), student.getFirstName()));
        }
        selectedStudentJComboBox2.setModel(new javax.swing.DefaultComboBoxModel(studentNames.toArray())); 
    }
    
    public void rebuildSelectStudentToDropCourseJComboBox()
    {
        
        ArrayList<StudentEntry> students = StudentQueries.getAllStudents();
        ArrayList<String> studentNames = new ArrayList<>();
        for (StudentEntry student:students){
            studentNames.add(String.format("%s, %s", student.getLastName(), student.getFirstName()));
        }
        selectStudentToDropCourseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(studentNames.toArray())); 
        if (studentNames.size() > 0)
        {
            currentStudentLabel.setText(studentNames.get(0));
            currentStudentId = students.get(0).getStudentId();
        }
        else
        {
            currentStudentLabel.setText("None, add a student.");
        }
    }
    
    public void rebuildSelectCourseToDropJComboBox2()
    {
        ArrayList<ScheduleEntry> coursesByStudent = ScheduleQueries.getScheduleByStudent(currentSemester, currentStudentId);
        ArrayList<String> coursesCodeByStudent = new ArrayList<>();
        for (ScheduleEntry schedule: coursesByStudent){
            coursesCodeByStudent.add(schedule.getCourseCode());
        }
        selectCourseToDropJComboBox2.setModel(new javax.swing.DefaultComboBoxModel(coursesCodeByStudent.toArray())); 
    }
    
    public void rebuildSelectCourseJComboBox()
    {
        ArrayList<String> courses = CourseQueries.getAllCourseCode(currentSemester);
        selectCourseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(courses.toArray()));
    }
    
    public void rebuildSelectStudentJComboBox()
    {
        ArrayList<StudentEntry> students = StudentQueries.getAllStudents();
        ArrayList<String> studentNames = new ArrayList<>();
        for (StudentEntry student:students){
            studentNames.add(String.format("%s, %s", student.getLastName(), student.getFirstName()));
        }
        selectStudentJComboBox.setModel(new javax.swing.DefaultComboBoxModel(studentNames.toArray())); 
    }
    
    public void rebuildSelectCourseToDropJComboBox(){
        ArrayList<String> courses = CourseQueries.getAllCourseCode(currentSemester);
        selectCourseToDropJComboBox.setModel(new javax.swing.DefaultComboBoxModel(courses.toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        addSemesterTextfield = new javax.swing.JTextField();
        addSemesterSubmitButton = new javax.swing.JButton();
        addSemesterStatusLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        seatsSpinner = new javax.swing.JSpinner();
        addCourseSubmitButton = new javax.swing.JButton();
        addCourseStatusLabel = new javax.swing.JLabel();
        courseCodeJTextField = new javax.swing.JTextField();
        courseDescriptionJTextField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        studentIDTextField = new javax.swing.JTextField();
        addStudentSubmitButton = new javax.swing.JButton();
        lastNameJTextField = new javax.swing.JTextField();
        addStudentStatusLabel = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        selectCourseJComboBox = new javax.swing.JComboBox<>();
        displayCourseListButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        displayScheduledStudentsTable = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        displayWaitlistedStudentsTable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        selectStudentJComboBox = new javax.swing.JComboBox<>();
        dropStudentSubmitButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        displayUpdateOfDropStudentTextArea = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        selectCourseToDropJComboBox = new javax.swing.JComboBox<>();
        dropCourseSubmitButton = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        displayDropCourseUpdateTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayCourseJTable = new javax.swing.JTable();
        coursesDisplayButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        scheduleCourseSubmitButton = new javax.swing.JButton();
        selectedCourseJComboBox = new javax.swing.JComboBox<>();
        scheduleCourseStatusLabel = new javax.swing.JLabel();
        addScheduleEntryStatusLabel = new javax.swing.JLabel();
        selectedStudentJComboBox = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayScheduleTable = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        selectedStudentJComboBox2 = new javax.swing.JComboBox<>();
        displayScheduleDisplayButton = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        selectStudentToDropCourseJComboBox = new javax.swing.JComboBox<>();
        dropCourseSubmitButton2 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        dropCourseByStudentTextArea = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        selectCourseToDropJComboBox2 = new javax.swing.JComboBox<>();
        changeStudentSubmitButton = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        currentStudentLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        currentSemesterLabel = new javax.swing.JLabel();
        currentSemesterComboBox = new javax.swing.JComboBox<>();
        changeSemesterButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Course Scheduler");

        jLabel3.setText("Semester Name:");

        addSemesterTextfield.setColumns(20);

        addSemesterSubmitButton.setText("Submit");
        addSemesterSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSemesterSubmitButtonActionPerformed(evt);
            }
        });

        addSemesterStatusLabel.setText("                                                   ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addSemesterTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(addSemesterSubmitButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addSemesterStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addSemesterTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addSemesterSubmitButton)
                .addGap(18, 18, 18)
                .addComponent(addSemesterStatusLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add Semester", jPanel3);

        jLabel4.setText("Course Code:");

        jLabel5.setText("Course Description:");

        jLabel6.setText("Seats:");

        seatsSpinner.setPreferredSize(new java.awt.Dimension(50, 20));

        addCourseSubmitButton.setText("Submit");
        addCourseSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseSubmitButtonActionPerformed(evt);
            }
        });

        addCourseStatusLabel.setPreferredSize(new java.awt.Dimension(200, 14));

        courseCodeJTextField.setColumns(20);

        courseDescriptionJTextField.setColumns(50);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addCourseStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addCourseSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseCodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseDescriptionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(courseCodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseDescriptionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(seatsSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addCourseSubmitButton)
                .addGap(18, 18, 18)
                .addComponent(addCourseStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        jTabbedPane2.addTab("Add Course", jPanel4);

        jLabel7.setText("Student ID:");

        jLabel8.setText("First Name:");

        jLabel9.setText("Last Name:");

        firstNameTextField.setColumns(20);

        studentIDTextField.setColumns(20);

        addStudentSubmitButton.setText("Submit");
        addStudentSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentSubmitButtonActionPerformed(evt);
            }
        });

        lastNameJTextField.setColumns(20);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addStudentStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addStudentSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(studentIDTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(studentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addStudentSubmitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addStudentStatusLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Add Student", jPanel5);

        jLabel15.setText("Select course:");

        selectCourseJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        displayCourseListButton.setText("Display");
        displayCourseListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCourseListButtonActionPerformed(evt);
            }
        });

        jLabel17.setText("Scheduled Students:");

        displayScheduledStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Student ID"
            }
        ));
        jScrollPane3.setViewportView(displayScheduledStudentsTable);

        jLabel18.setText("Waitlisted Students:");

        displayWaitlistedStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Student ID"
            }
        ));
        jScrollPane5.setViewportView(displayWaitlistedStudentsTable);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectCourseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(displayCourseListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(selectCourseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayCourseListButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Display Course List of Students", jPanel10);

        jLabel19.setText("Select Student:");

        selectStudentJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dropStudentSubmitButton.setText("Drop Student");
        dropStudentSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropStudentSubmitButtonActionPerformed(evt);
            }
        });

        displayUpdateOfDropStudentTextArea.setColumns(20);
        displayUpdateOfDropStudentTextArea.setRows(5);
        jScrollPane6.setViewportView(displayUpdateOfDropStudentTextArea);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(selectStudentJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(dropStudentSubmitButton)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(selectStudentJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropStudentSubmitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Drop Student", jPanel11);

        jLabel20.setText("Select course to be dropped:");

        selectCourseToDropJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dropCourseSubmitButton.setText("Drop Course");
        dropCourseSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropCourseSubmitButtonActionPerformed(evt);
            }
        });

        displayDropCourseUpdateTextArea.setColumns(20);
        displayDropCourseUpdateTextArea.setRows(5);
        jScrollPane7.setViewportView(displayDropCourseUpdateTextArea);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectCourseToDropJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(dropCourseSubmitButton)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(selectCourseToDropJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropCourseSubmitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Drop Course", jPanel12);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Admin", jPanel1);

        displayCourseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Courses Code", "Description", "Seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(displayCourseJTable);

        coursesDisplayButton.setText("Display");
        coursesDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesDisplayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(coursesDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(coursesDisplayButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Display Courses", jPanel7);

        jLabel13.setText("Selected Course:");

        jLabel14.setText("Selected Student:");

        scheduleCourseSubmitButton.setText("Submit");
        scheduleCourseSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleCourseSubmitButtonActionPerformed(evt);
            }
        });

        selectedCourseJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        selectedStudentJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scheduleCourseSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectedCourseJComboBox, 0, 129, Short.MAX_VALUE)
                            .addComponent(selectedStudentJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(scheduleCourseStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addScheduleEntryStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(selectedCourseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(selectedStudentJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scheduleCourseSubmitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addScheduleEntryStatusLabel)
                .addGap(18, 18, 18)
                .addComponent(scheduleCourseStatusLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Scheduel Course", jPanel8);

        displayScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Course Code", "Status"
            }
        ));
        jScrollPane2.setViewportView(displayScheduleTable);

        jLabel16.setText("Selected Student:");

        selectedStudentJComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        displayScheduleDisplayButton.setText("Display");
        displayScheduleDisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayScheduleDisplayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(displayScheduleDisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(selectedStudentJComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(selectedStudentJComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(displayScheduleDisplayButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Display Schedule", jPanel9);

        jLabel21.setText("Select Student:");

        selectStudentToDropCourseJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dropCourseSubmitButton2.setText("Drop Course");
        dropCourseSubmitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropCourseSubmitButton2ActionPerformed(evt);
            }
        });

        dropCourseByStudentTextArea.setColumns(20);
        dropCourseByStudentTextArea.setRows(5);
        jScrollPane8.setViewportView(dropCourseByStudentTextArea);

        jLabel22.setText("Select course:");

        selectCourseToDropJComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        changeStudentSubmitButton.setText("Change student");
        changeStudentSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeStudentSubmitButtonActionPerformed(evt);
            }
        });

        jLabel23.setText("Current Student:");

        currentStudentLabel.setText("                                          ");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropCourseSubmitButton2)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectStudentToDropCourseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeStudentSubmitButton)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectCourseToDropJComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(10, 10, 10)
                        .addComponent(currentStudentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(jLabel24))
                    .addComponent(currentStudentLabel))
                .addGap(10, 10, 10)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(selectStudentToDropCourseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeStudentSubmitButton)
                    .addComponent(jLabel22)
                    .addComponent(selectCourseToDropJComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dropCourseSubmitButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Drop Course", jPanel13);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.addTab("Student", jPanel2);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel2.setText("Current Semester: ");

        currentSemesterLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        currentSemesterLabel.setText("           ");

        currentSemesterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        changeSemesterButton.setText("Change Semester");
        changeSemesterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSemesterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentSemesterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(currentSemesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(changeSemesterButton)
                        .addGap(80, 80, 80))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(currentSemesterLabel)
                    .addComponent(currentSemesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeSemesterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSemesterSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSemesterSubmitButtonActionPerformed
        String semester = addSemesterTextfield.getText();
        SemesterQueries.addSemester(semester);
        addSemesterStatusLabel.setText("Semester " + semester + " has been added.");
        rebuildSemesterComboBoxes();
        rebuildSelectedCourseJComboBox();
        rebuildSelectedStudentJComboBox();
        rebuildSelectedStudentJComboBox2();
        rebuildSelectStudentToDropCourseJComboBox();
        rebuildSelectCourseToDropJComboBox2();
        rebuildSelectCourseJComboBox();
        rebuildSelectStudentJComboBox();
        rebuildSelectCourseToDropJComboBox();
    }//GEN-LAST:event_addSemesterSubmitButtonActionPerformed

    private void addCourseSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseSubmitButtonActionPerformed
        CourseEntry course = new CourseEntry(currentSemesterLabel.getText(), courseCodeJTextField.getText(), courseDescriptionJTextField.getText(),(int)seatsSpinner.getValue());
        CourseQueries.addCourse(course);
        rebuildSelectedCourseJComboBox();
        rebuildSelectCourseJComboBox();
        rebuildSelectCourseToDropJComboBox();
        addCourseStatusLabel.setText("Course "+ course.getCourseCode() + " of semester "+ course.getSemester()+" has been added.");
    }//GEN-LAST:event_addCourseSubmitButtonActionPerformed

    private void changeSemesterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeSemesterButtonActionPerformed
        // TODO add your handling code here:
        currentSemesterLabel.setText(currentSemesterComboBox.getSelectedItem().toString());
        currentSemester = currentSemesterLabel.getText();
        rebuildSelectedCourseJComboBox();
        rebuildSelectedStudentJComboBox();
        rebuildSelectedStudentJComboBox2();
        rebuildSelectStudentToDropCourseJComboBox();
        rebuildSelectCourseToDropJComboBox2();
        rebuildSelectCourseJComboBox();
        rebuildSelectStudentJComboBox();
        rebuildSelectCourseToDropJComboBox();
    }//GEN-LAST:event_changeSemesterButtonActionPerformed

    private void addStudentSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentSubmitButtonActionPerformed
        // TODO add your handling code here:
        StudentEntry student = new StudentEntry(studentIDTextField.getText(), firstNameTextField.getText(), lastNameJTextField.getText());
        StudentQueries.addStudent(student);
        rebuildSelectedStudentJComboBox();
        rebuildSelectedStudentJComboBox2();
        rebuildSelectStudentToDropCourseJComboBox();
        rebuildSelectStudentJComboBox();
        addStudentStatusLabel.setText("Student " + lastNameJTextField.getText()+", " + firstNameTextField.getText()+ " with ID: "+ studentIDTextField.getText()+" has been added.");
    }//GEN-LAST:event_addStudentSubmitButtonActionPerformed

    private void scheduleCourseSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleCourseSubmitButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<StudentEntry> students = StudentQueries.getAllStudents();
        String courseCode = selectedCourseJComboBox.getSelectedItem().toString();
        String studentId = students.get(selectedStudentJComboBox.getSelectedIndex()).getStudentId();
        int scheduledStudentCount = ScheduleQueries.getScheduledStudentCount(currentSemester, courseCode);
        int seatsOfCourse = CourseQueries.getCourseSeats(currentSemester, courseCode);
        String status = "";
        if (scheduledStudentCount >= seatsOfCourse){
            status = "W";
        }else{
            status = "S";
        }
        java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
        ScheduleEntry schedule = new ScheduleEntry(currentSemester, courseCode , studentId , status, currentTimestamp);
        ScheduleQueries.addScheduleEntry(schedule);
        rebuildSelectCourseToDropJComboBox2();
        if (status.equals("W")){
            addScheduleEntryStatusLabel.setText(String.format("%s has been waitlisted for the class", selectedStudentJComboBox.getSelectedItem().toString()));
        }else{
            addScheduleEntryStatusLabel.setText(String.format("%s has been scheduled for the class", selectedStudentJComboBox.getSelectedItem().toString()));
        }
    }//GEN-LAST:event_scheduleCourseSubmitButtonActionPerformed

    private void coursesDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesDisplayButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<CourseEntry> courses = CourseQueries.getCourseList(currentSemester);
        DefaultTableModel displayCoursesTableModel = (DefaultTableModel) displayCourseJTable.getModel();
        
        displayCoursesTableModel.setNumRows(0);
        Object[] rowData = new Object[3];
        
        for (CourseEntry course:courses){
            rowData[0] = course.getCourseCode();
            rowData[1] = course.getCourseDescription();
            rowData[2] = course.getSeats();
            displayCoursesTableModel.addRow(rowData);
        }
        
        
    }//GEN-LAST:event_coursesDisplayButtonActionPerformed

    private void displayScheduleDisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayScheduleDisplayButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<StudentEntry> students = StudentQueries.getAllStudents();
        String studentId = students.get(selectedStudentJComboBox2.getSelectedIndex()).getStudentId();
        
        ArrayList<ScheduleEntry> schedules = ScheduleQueries.getScheduleByStudent(currentSemester, studentId);
        DefaultTableModel displayScheduleTableModel = (DefaultTableModel) displayScheduleTable.getModel();
        
        displayScheduleTableModel.setNumRows(0);
        Object[] rowData = new Object[2];
        
        for (ScheduleEntry schedule:schedules){
            rowData[0] = schedule.getCourseCode();
            if (schedule.getStatus().equals("W")){
                rowData[1] = "waitlisted";
            }else{
                rowData[1] = "Scheduled";
            }
            displayScheduleTableModel.addRow(rowData);
        }
    }//GEN-LAST:event_displayScheduleDisplayButtonActionPerformed

    private void changeStudentSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeStudentSubmitButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<StudentEntry> students = StudentQueries.getAllStudents();
        currentStudentId = students.get(selectStudentToDropCourseJComboBox.getSelectedIndex()).getStudentId();
        currentStudentLabel.setText(selectStudentToDropCourseJComboBox.getSelectedItem().toString());
        rebuildSelectCourseToDropJComboBox2();
    }//GEN-LAST:event_changeStudentSubmitButtonActionPerformed
    
   
    private void dropCourseSubmitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropCourseSubmitButton2ActionPerformed
        // TODO add your handling code here:  
        String courseCode = selectCourseToDropJComboBox2.getSelectedItem().toString();
        int scheduledStudentCount = ScheduleQueries.getScheduledStudentCount(currentSemester, courseCode);
        int seatsOfCourse = CourseQueries.getCourseSeats(currentSemester, courseCode);
        ArrayList<ScheduleEntry> waitlistedStudentsByCourse = ScheduleQueries.getWaitlistedStudentsByCourse(currentSemester, courseCode);
        ScheduleQueries.dropStudentScheduleByCourse(currentSemester, currentStudentId, courseCode);
        rebuildSelectCourseToDropJComboBox2();
        String studentName = selectStudentToDropCourseJComboBox.getSelectedItem().toString();
        dropCourseByStudentTextArea.setText(String.format("%s %s has been dropped from course %s\n", studentName, currentStudentId, courseCode));
        if (scheduledStudentCount >= seatsOfCourse){
            ScheduleEntry firstWailistedStudent = waitlistedStudentsByCourse.get(0);
            ScheduleQueries.updateScheduleEntry(currentSemester, firstWailistedStudent);
            ArrayList<StudentEntry> students = StudentQueries.getAllStudents();
            String firstWailistedStudentName = "";
            for(StudentEntry student:students){
                if(student.getStudentId().equals(firstWailistedStudent.getStudentId())){
                    firstWailistedStudentName = String.format("%s, %s", student.getLastName(), student.getFirstName());
                }
            }
            
            dropCourseByStudentTextArea.append(String.format("%s %s has been scheduled for the course %s\n", firstWailistedStudentName,firstWailistedStudent.getStudentId(), courseCode));
        }
        
    }//GEN-LAST:event_dropCourseSubmitButton2ActionPerformed

    private void displayCourseListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCourseListButtonActionPerformed
        // TODO add your handling code here:
        String courseCode = selectCourseJComboBox.getSelectedItem().toString();
        ArrayList<ScheduleEntry> scheduledStudentByCourse = ScheduleQueries.getScheduledStudentsByCourse(currentSemester, courseCode);
        ArrayList<ScheduleEntry> waitlistedStudentByCourse = ScheduleQueries.getWaitlistedStudentsByCourse(currentSemester, courseCode);
        ArrayList<StudentEntry> students = StudentQueries.getAllStudents();
        
        DefaultTableModel displayScheduledStudentByCourse = (DefaultTableModel) displayScheduledStudentsTable.getModel();
        
        displayScheduledStudentByCourse.setNumRows(0);
        Object[] rowData = new Object[3];
        
        for (ScheduleEntry schedule:scheduledStudentByCourse){
            StudentEntry currentStudent = new StudentEntry("","","");
            for (StudentEntry student:students){
                if(student.getStudentId().equals(schedule.getStudentId())){
                    currentStudent = student;
                }
            }
            rowData[0] = currentStudent.getFirstName();
            rowData[1] = currentStudent.getLastName(); 
            rowData[2] = currentStudent.getStudentId(); 
            displayScheduledStudentByCourse.addRow(rowData);
        }
        
        DefaultTableModel displayWaitlistedStudentByCourse = (DefaultTableModel) displayWaitlistedStudentsTable.getModel();
        
        displayWaitlistedStudentByCourse.setNumRows(0);
        
        for (ScheduleEntry schedule:waitlistedStudentByCourse){
            StudentEntry currentStudent = new StudentEntry("","","");
            for (StudentEntry student:students){
                if(student.getStudentId().equals(schedule.getStudentId())){
                    currentStudent = student;
                }
            }
            rowData[0] = currentStudent.getFirstName();
            rowData[1] = currentStudent.getLastName(); 
            rowData[2] = currentStudent.getStudentId(); 
            displayWaitlistedStudentByCourse.addRow(rowData);
        }
    }//GEN-LAST:event_displayCourseListButtonActionPerformed

    private void dropStudentSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropStudentSubmitButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<StudentEntry> students = StudentQueries.getAllStudents();
        String studentId = students.get(selectStudentJComboBox.getSelectedIndex()).getStudentId();
        ArrayList<String> listOfSemesters = new ArrayList<>();
        for (int i = 0; i < currentSemesterComboBox.getItemCount(); i ++){
            listOfSemesters.add(currentSemesterComboBox.getItemAt(i));
        }
        displayUpdateOfDropStudentTextArea.setText(String.format("%s %s has been dropped from the list of students.\n",
                                                   selectStudentJComboBox.getSelectedItem().toString(), studentId));
        for(String semester:listOfSemesters){
            displayUpdateOfDropStudentTextArea.append(String.format("\nFor semester: %s\n", semester));
            ArrayList<ScheduleEntry> schedulesByStudent = ScheduleQueries.getScheduleByStudent(semester, studentId);
            for (ScheduleEntry schedule:schedulesByStudent){
                String courseCode = schedule.getCourseCode();
                int scheduledStudentCount = ScheduleQueries.getScheduledStudentCount(semester, courseCode);
                int seatsOfCourse = CourseQueries.getCourseSeats(semester, courseCode);
                ScheduleQueries.dropStudentScheduleByCourse(semester, studentId, courseCode);
                ArrayList<ScheduleEntry> waitlistedStudentsByCourse = ScheduleQueries.getWaitlistedStudentsByCourse(semester, courseCode);
                rebuildSelectCourseToDropJComboBox2();
                String studentName = selectStudentJComboBox.getSelectedItem().toString();
                displayUpdateOfDropStudentTextArea.append(String.format("%s %s has been dropped from course %s\n", studentName, studentId, courseCode));
                if (scheduledStudentCount >= seatsOfCourse && waitlistedStudentsByCourse.size() > 0){
                    ScheduleEntry firstWailistedStudent = waitlistedStudentsByCourse.get(0);
                    ScheduleQueries.updateScheduleEntry(semester, firstWailistedStudent);
                    String firstWailistedStudentName = "";
                    for(StudentEntry student:students){
                        if(student.getStudentId().equals(firstWailistedStudent.getStudentId())){
                            firstWailistedStudentName = String.format("%s, %s",  student.getLastName(),student.getFirstName());
                        }
                }

                displayUpdateOfDropStudentTextArea.append(String.format("%s %s has been scheduled for the course %s\n", firstWailistedStudentName,firstWailistedStudent.getStudentId(), courseCode));

                }
            }
        }
        StudentQueries.dropStudent(studentId);
        rebuildSelectedStudentJComboBox();
        rebuildSelectedStudentJComboBox2();
        rebuildSelectStudentToDropCourseJComboBox();
        rebuildSelectStudentJComboBox();
    }//GEN-LAST:event_dropStudentSubmitButtonActionPerformed

    private void dropCourseSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropCourseSubmitButtonActionPerformed
        // TODO add your handling code here:
        String courseCode = selectCourseToDropJComboBox.getSelectedItem().toString();
        ArrayList<ScheduleEntry> scheduledStudentByCourse = ScheduleQueries.getScheduledStudentsByCourse(currentSemester, courseCode);
        ArrayList<ScheduleEntry> waitlistedStudentByCourse = ScheduleQueries.getWaitlistedStudentsByCourse(currentSemester, courseCode);
        ArrayList<StudentEntry> students = StudentQueries.getAllStudents();
        displayDropCourseUpdateTextArea.setText("Scheduled students dropped from the course:\n");
        for(ScheduleEntry schedule:scheduledStudentByCourse){
            for(StudentEntry student:students){
                if(schedule.getStudentId().equals(student.getStudentId())){
                    displayDropCourseUpdateTextArea.append(String.format("%s, %s %s has been dropped from course %s\n", student.getFirstName(), student.getLastName(), student.getStudentId(), courseCode));
                }
            }
        }
        displayDropCourseUpdateTextArea.append("\nWaitlisted students dropped from the course:");
        for(ScheduleEntry schedule:waitlistedStudentByCourse){
            for(StudentEntry student:students){
                if(schedule.getStudentId().equals(student.getStudentId())){
                    displayDropCourseUpdateTextArea.append(String.format("%s, %s %s has been dropped from course %s\n", student.getFirstName(), student.getLastName(), student.getStudentId(), courseCode));
                }
            }
        }
        ScheduleQueries.dropScheduleByCourse(currentSemester, courseCode);
        CourseQueries.dropCourse(currentSemester, courseCode);
        rebuildSelectedCourseJComboBox();
        rebuildSelectCourseJComboBox();
        rebuildSelectCourseToDropJComboBox();
    }//GEN-LAST:event_dropCourseSubmitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCourseStatusLabel;
    private javax.swing.JButton addCourseSubmitButton;
    private javax.swing.JLabel addScheduleEntryStatusLabel;
    private javax.swing.JLabel addSemesterStatusLabel;
    private javax.swing.JButton addSemesterSubmitButton;
    private javax.swing.JTextField addSemesterTextfield;
    private javax.swing.JLabel addStudentStatusLabel;
    private javax.swing.JButton addStudentSubmitButton;
    private javax.swing.JButton changeSemesterButton;
    private javax.swing.JButton changeStudentSubmitButton;
    private javax.swing.JTextField courseCodeJTextField;
    private javax.swing.JTextField courseDescriptionJTextField;
    private javax.swing.JButton coursesDisplayButton;
    private javax.swing.JComboBox<String> currentSemesterComboBox;
    private javax.swing.JLabel currentSemesterLabel;
    private javax.swing.JLabel currentStudentLabel;
    private javax.swing.JTable displayCourseJTable;
    private javax.swing.JButton displayCourseListButton;
    private javax.swing.JTextArea displayDropCourseUpdateTextArea;
    private javax.swing.JButton displayScheduleDisplayButton;
    private javax.swing.JTable displayScheduleTable;
    private javax.swing.JTable displayScheduledStudentsTable;
    private javax.swing.JTextArea displayUpdateOfDropStudentTextArea;
    private javax.swing.JTable displayWaitlistedStudentsTable;
    private javax.swing.JTextArea dropCourseByStudentTextArea;
    private javax.swing.JButton dropCourseSubmitButton;
    private javax.swing.JButton dropCourseSubmitButton2;
    private javax.swing.JButton dropStudentSubmitButton;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JLabel scheduleCourseStatusLabel;
    private javax.swing.JButton scheduleCourseSubmitButton;
    private javax.swing.JSpinner seatsSpinner;
    private javax.swing.JComboBox<String> selectCourseJComboBox;
    private javax.swing.JComboBox<String> selectCourseToDropJComboBox;
    private javax.swing.JComboBox<String> selectCourseToDropJComboBox2;
    private javax.swing.JComboBox<String> selectStudentJComboBox;
    private javax.swing.JComboBox<String> selectStudentToDropCourseJComboBox;
    private javax.swing.JComboBox<String> selectedCourseJComboBox;
    private javax.swing.JComboBox<String> selectedStudentJComboBox;
    private javax.swing.JComboBox<String> selectedStudentJComboBox2;
    private javax.swing.JTextField studentIDTextField;
    // End of variables declaration//GEN-END:variables
}
