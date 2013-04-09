package uk.ac.shu.webarch.eregister

class RegisterEntry {
  /* this class has a 1:m relationship, one student signs in many RegisterEntry sheets and one RegisterEntry sheet is  signed by many students  */

  /* name of the student signing the registery sheet */
  Student student 

  RegistrationSheet regSheet

  /* adding a date and time for the student signing the reg sheet */
  Long timestamp = System.currentTimeMillis();

  /* there is no constrains for this sample class we declear here */
  static constraints = {
    timestamp(nullable:false , blank:false)
  }

  /* declearing a more clear and treditional mapping */
  static mapping = {
    table  'student_register_entry'
    student column :'student_fk'
    regSheet column : 'reg_sheet_fk'

  }
}
