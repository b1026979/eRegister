package uk.ac.shu.webarch.eregister

class Enrollment {

  /* decleare the variables */
  Student student
  RegClass regClass

  static constraints = {
  }


  static mapping = {
	table 'coursestudent'
	student column: 'student_fk'
	course column: 'course_fk'
  }
}
