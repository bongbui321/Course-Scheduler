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

public class CourseQueries {
    private static Connection connection;
    private static PreparedStatement addCourse;
    private static PreparedStatement getCourseList;
    private static PreparedStatement getCourseCode;
    private static PreparedStatement getCourseSeats;
    private static PreparedStatement dropCourse;
    private static ResultSet resultSet;
    
    public static void addCourse(CourseEntry course)
    {
        connection = DBConnection.getConnection();
        try
        {
            addCourse = connection.prepareStatement("insert into app.course (semester, coursecode, description, seats) values (?,?,?,?)");
            addCourse.setString(1, course.getSemester());
            addCourse.setString(2, course.getCourseCode());
            addCourse.setString(3, course.getCourseDescription());
            addCourse.setString(4, String.valueOf(course.getSeats()));
            addCourse.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    public static ArrayList<CourseEntry> getCourseList(String semester)
    {
        connection = DBConnection.getConnection();
        ArrayList<CourseEntry> courses = new ArrayList<CourseEntry>();
        try
        {
            getCourseList = connection.prepareStatement("select * from app.course where semester = ? order by coursecode");
            getCourseList.setString(1,semester);
            resultSet = getCourseList.executeQuery();
            
            while(resultSet.next())
            {
                courses.add(new CourseEntry(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),resultSet.getInt(4)));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return courses;
        
    }
    
    public static ArrayList<String> getAllCourseCode(String semester)
    {
        connection = DBConnection.getConnection();
        ArrayList<String> courseCodes = new ArrayList<String>();
        try
        {
            getCourseCode = connection.prepareStatement("select coursecode from app.course where SEMESTER = ? order by coursecode");
            getCourseCode.setString(1, semester);
            resultSet = getCourseCode.executeQuery();
            
            while(resultSet.next())
            {
                courseCodes.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return courseCodes;
        
    }
    
    public static int getCourseSeats(String semester, String courseCode)
    {
        connection = DBConnection.getConnection();
        int ans = 0; 
        try
        {
            getCourseSeats = connection.prepareStatement("select seats from app.course where semester = ? and courseCode = ? order by seats");
            getCourseSeats.setString(1, semester);
            getCourseSeats.setString(2, courseCode);
            resultSet = getCourseSeats.executeQuery();
            
            while (resultSet.next()){
                ans = resultSet.getInt(1);
            }
            
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return ans;
    }
    
    public static void dropCourse(String semester, String courseCode)
    {
        connection = DBConnection.getConnection();

        try
        {
            dropCourse = connection.prepareStatement("delete from app.course where semester = ? and courseCode = ?");
            dropCourse.setString(1, semester);
            dropCourse.setString(2, courseCode);
            dropCourse.executeUpdate();
            
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
}
