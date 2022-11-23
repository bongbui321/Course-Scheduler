/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.sql.Timestamp;

public class ScheduleEntry {
    private String semester; 
    private String courseCode; 
    private String studentId; 
    private String Status; 
    private Timestamp timeStamp;

    public ScheduleEntry(String semester, String courseCode, String studentId, String Status, Timestamp timeStamp) {
        this.semester = semester;
        this.courseCode = courseCode;
        this.studentId = studentId;
        this.Status = Status;
        this.timeStamp = timeStamp;
    }

    public String getSemester() {
        return semester;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStatus() {
        return Status;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    
}
