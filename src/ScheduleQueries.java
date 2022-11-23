/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ScheduleQueries {
    private static Connection connection;
    private static PreparedStatement addScheduleEntry;
    private static PreparedStatement getScheduleByStudent; 
    private static PreparedStatement getScheduledStudentCount;
    private static PreparedStatement getScheduledStudentsByCourse;
    private static PreparedStatement getWaitlistedStudentsByCourse;
    private static PreparedStatement dropStudentScheduleByCourse;
    private static PreparedStatement dropScheduleByCourse;
    private static PreparedStatement updateScheduleEntry;
    private static ResultSet resultSet;
    
    public static void addScheduleEntry(ScheduleEntry schedule)
    {
        connection = DBConnection.getConnection();
        try
        {
            addScheduleEntry = connection.prepareStatement("insert into app.schedule (semester, coursecode, studentid, status,timestamp) values (?,?,?,?,?)");
            addScheduleEntry.setString(1, schedule.getSemester());
            addScheduleEntry.setString(2, schedule.getCourseCode());
            addScheduleEntry.setString(3, schedule.getStudentId());
            addScheduleEntry.setString(4, String.valueOf(schedule.getStatus()));
            addScheduleEntry.setString(5, String.valueOf(schedule.getTimeStamp()));
            addScheduleEntry.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    public static ArrayList<ScheduleEntry> getScheduleByStudent(String semester, String studentId)
    {
        connection = DBConnection.getConnection();
        ArrayList<ScheduleEntry> schedule = new ArrayList<ScheduleEntry>();
        try
        {
            getScheduleByStudent = connection.prepareStatement("select * from app.schedule where semester = ? and studentid = ? order by status");
            getScheduleByStudent.setString(1,semester);
            getScheduleByStudent.setString(2,studentId);
            resultSet = getScheduleByStudent.executeQuery();
            
            while(resultSet.next())
            {
                schedule.add(new ScheduleEntry(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),resultSet.getString(4),resultSet.getTimestamp(5)));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return schedule;
    }
    
    public static int getScheduledStudentCount(String semester, String courseCode){
        connection = DBConnection.getConnection();
        int count = 0;
        try
        {
            getScheduledStudentCount = connection.prepareStatement("select count(studentID) from app.schedule where semester = ? and courseCode = ?");
            getScheduledStudentCount.setString(1,semester);
            getScheduledStudentCount.setString(2,courseCode);
            resultSet = getScheduledStudentCount.executeQuery();
            
            while(resultSet.next())
            {
                count = resultSet.getInt(1);
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return count;
    }
    
    public static ArrayList<ScheduleEntry> getScheduledStudentsByCourse(String semester, String courseCode)
    {
        connection = DBConnection.getConnection();
        ArrayList<ScheduleEntry> scheduledStudents = new ArrayList<ScheduleEntry>();
        try
        {
            getScheduledStudentsByCourse = connection.prepareStatement("select * from app.schedule where semester = ? and coursecode = ? and status = 'S' order by timestamp");
            getScheduledStudentsByCourse.setString(1,semester);
            getScheduledStudentsByCourse.setString(2,courseCode);
            resultSet = getScheduledStudentsByCourse.executeQuery();
            
            while(resultSet.next())
            {
                scheduledStudents.add(new ScheduleEntry(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),resultSet.getString(4),resultSet.getTimestamp(5)));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return scheduledStudents;
    }
    
     public static ArrayList<ScheduleEntry> getWaitlistedStudentsByCourse(String semester, String courseCode)
    {
        connection = DBConnection.getConnection();
        ArrayList<ScheduleEntry> waitlistedStudents = new ArrayList<ScheduleEntry>();
        try
        {
            getWaitlistedStudentsByCourse = connection.prepareStatement("select * from app.schedule where semester = ? and coursecode = ? and status = 'W' order by timestamp");
            getWaitlistedStudentsByCourse.setString(1,semester);
            getWaitlistedStudentsByCourse.setString(2,courseCode);
            resultSet = getWaitlistedStudentsByCourse.executeQuery();
            
            while(resultSet.next())
            {
                waitlistedStudents.add(new ScheduleEntry(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),resultSet.getString(4),resultSet.getTimestamp(5)));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return waitlistedStudents;
    }
     
    public static void dropStudentScheduleByCourse(String semester, String studentID, String courseCode){
        connection = DBConnection.getConnection();
        try
        {
            dropStudentScheduleByCourse = connection.prepareStatement("delete from app.schedule where semester = ? and coursecode = ? and studentid = ?");
            dropStudentScheduleByCourse.setString(1,semester);
            dropStudentScheduleByCourse.setString(2,courseCode);
            dropStudentScheduleByCourse.setString(3,studentID);
            dropStudentScheduleByCourse.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    public static void dropScheduleByCourse(String semester, String courseCode){
        connection = DBConnection.getConnection();
        try
        {
            dropScheduleByCourse = connection.prepareStatement("delete from app.schedule where semester = ? and coursecode = ?");
            dropScheduleByCourse.setString(1,semester);
            dropScheduleByCourse.setString(2,courseCode);
            dropScheduleByCourse.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
     
    public static void updateScheduleEntry(String semester, ScheduleEntry entry)
    {
        connection = DBConnection.getConnection();
        try
        {
            updateScheduleEntry = connection.prepareStatement("update app.schedule set status = ? where semester = ? and coursecode = ? and studentid = ?");
            updateScheduleEntry.setString(1,"S");
            updateScheduleEntry.setString(2,semester);
            updateScheduleEntry.setString(3,entry.getCourseCode());
            updateScheduleEntry.setString(4,entry.getStudentId());
            updateScheduleEntry.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
}
