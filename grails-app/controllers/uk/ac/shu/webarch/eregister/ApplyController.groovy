package uk.ac.shu.webarch.eregister

import grails.converters.*

  class ApplyController {

    def index() {
/*
      def result=[:]
        result.attendanceList= []
        
        Student.findAll() each { st ->
          result.attendanceList.add([Attendance:st.studentAttended,
                                     timeStamp:regentry.now])
        }

      withFormat {
         html result
         xml { render result as XML }
         json { render result as JSON }
      }
*/
  }
    def processAttendance() {

   println(params)
   println("Student id is ${params.StudentId}");
   println("Register entry id is ${params.RegistrationSheet}");

   def student_a = Student.findByStudentNumber(params.StudentId)

   def regSheet_a = RegistrationSheet.findByRegSheetNumber(params.RegistrationId)

   println("Looked up student is ${student_a}, sheet is ${regSheet_a}");



   redirect(action:'index')
   
  
     }
}
