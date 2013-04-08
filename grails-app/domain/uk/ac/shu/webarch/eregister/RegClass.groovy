package uk.ac.shu.webarch.eregister

  /* this is called regClass because java app uses class as a reserved keyword */
class RegClass {

  String name  /* name of the class in here */


  /* the ClassInstractor is the foreign key from the class Instractor , it tells us who is teaching the class */
  Instructor classInstructor 

  /* decleares about the course */
  Course course 

  /* the set of enrolled students on this class */
  Set enrolledStudents

 
  /* below we address the class enrolment to the current class with a has many student enrolling relationship that is a   hasMany relationship */
  static hasMany = [enrolledStudents:Enrollment]

  /* with mappedBy the class knows to use the student property of the Enrollment class as a forign key  */
  static mappedBy = [enrolledStudents: 'regClass']

  static constraints = {
    classInstructor(nullable:false, blank:false, maxsize:256);
    course(nullable:false, blank:false, maxsize:256);
  }


  static mapping = {

    classInstructor column:'classInstructor_fk'
    course column:'course_fk'

  }

}	



