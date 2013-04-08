package uk.ac.shu.webarch.eregister

class RegistrationSheet {

  /* the course name for the sheet */
  Course course 

  /* date of the sheet */
  Date sheetDate

  /* signatories */
  Set signatories
  
  String notes

  static hasMany = [signatories: RegisterEntry]
  static mappedby = [classes : 'student']

  static constraints = {
    course(nullable:false, blank:false);
    sheetDate(nullable:false, blank:false);
    notes(nullable:false, blank:false);
  }

  static mapping = {
    notes column: 'course_desc', type:'text';

  }


}
