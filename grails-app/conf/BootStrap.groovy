import uk.ac.shu.webarch.eregister.*;
class BootStrap {

    def init = { servletContext ->
	println("BootStrap::init");

	def ian_instructor = Instructor.findByStaffid('646345d') ?: new Instructor(staffid:'646345d', name:'Ian Ibbotson').save()
	def mathew_instructor = Instructor.findByStaffid('253425') ?: new Instructor(staffid:'253425', name:'Mathew Love').save()

    }
    def destroy = {
    }
}
