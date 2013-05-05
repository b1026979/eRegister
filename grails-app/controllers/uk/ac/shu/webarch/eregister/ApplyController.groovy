package uk.ac.shu.webarch.eregister

import grails.converters.*

  class ApplyController {

    def index() {


    }

  def processAttendance() {

     println(params)
     println("Student id is ${params.StudentId}");
     println("Register entry id is ${params.RegistrationId}");

     def student_a = Student.findByStudentNumber(params.StudentId) ?:
     println("Error has accurred")

     def regSheet_a = RegistrationSheet.findByRegSheetNumber(params.RegistrationId)
     def new_reg_entry = new RegisterEntry(student:student_a,regSheetNumber:regSheet_a).save()

     println("Looked up student is ${student_a}, sheet is ${regSheet_a}");

  
     redirect(action:'index', params:params)

  }
  
  def listActiveClasses(){
    def result= [:]
    result.allClasses=[]
    RegClass.list().each{ cls ->
       println("class:${cls}")
       boolean inc_class = false
       def signedSheets = 0
       cls.regSheets.each { sheet ->
       if(sheet.signatories?.size() > 0)
          signedSheets++
       }

       if (signedSheets > 0){
       result.allClasses.add(cls)
       }
   }
 
   return result
  
  }
  def listActiveSummary(){

    
  }


}
