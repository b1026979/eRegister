import uk.ac.shu.webarch.eregister.*;
class BootStrap {

    def init = { servletContext ->
	println("BootStrap::init");

	def ian_instructor = Instructor.findByStaffid('646345d') ?: new Instructor(staffid:'646345d', name:'Ian Ibbotson').save()
	def mathew_instructor = Instructor.findByStaffid('253425') ?: new Instructor(staffid:'253425', name:'Mathew Love').save()

	def web_arch_course = Course.findByCourseCode('443343dd') ?: new Course(courseCode:'443343dd',
                                                                                courseName:'Web Archs',
                                                                                courseDescription:'my optional choise').save()

    }
    def destroy = {
    }
}
