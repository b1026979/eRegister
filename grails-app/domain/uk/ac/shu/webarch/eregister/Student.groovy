package uk.ac.shu.webarch.eregister

class Student {
	String fullStudentName
	String studentNumber
	String studentNotes

  /* Name of the courses that student enrolled on */
  Set courses

  /* decleares the set of the classes that student attended on */
  Set classesAtts

  /* this is the form of doing the hasMany structure as a list */
  static hasMany = [
	courses:Enrollment,
	classAtts:RegisterEntry
  ]

  static mappedBy = [
	courses :'student',
	classAtt:'student'
  ]

  static mapping = {
  notes column: 'student_notes', type:'text';

  }

  static constraints = {
  fullStudentName(nullable:false, blank:false, maxsize:256) ;
  studentNumber(nullable:false, blank:false, maxsize:256);	
  }

}
