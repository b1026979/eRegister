package uk.ac.shu.webarch.eregister

class Enrollment {

  /* decleare the variables */
  Student student
  RegClass regClass

  static constraints = {
  }


  static mapping = {
	table 'course-student'
	student column: 'student_fk'
	course column: 'course_fk'
  }
}
