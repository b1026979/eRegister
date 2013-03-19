package uk.ac.shu.webarch.eregister

class Course 
{

/* course properties */
String courseName
String corseCode
String courseDescription
int myIntProp = 1

/* in here we set the classes for this course */
set classes

    static constraints = {

 courseCode maxSize : 20
    }
static hasMany = [classes: regClass]
static mappedby = [classes : 'course']

/* changing the database column names from courseName, courseCode and description
to course_Name, apped_course_code and course_desc respectly also changing the 
type of description from varchart to text format */
static mapping = {
table 'course'
courseName  column = 'course_Name'
courseCode  column = 'mapped_course_code'
description column = 'course_desc' type :'text'

}
}
