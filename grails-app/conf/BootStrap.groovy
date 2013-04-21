import uk.ac.shu.webarch.eregister.*;
/* This is an unusuall BootStrap because I used the code to authomatically fill the nulls and give us the result
in real project we need to input all the necessary data into our list in order to get a working app 
in this case because I wanted to demonstrate the working app I used the BootStrap to fill the necessary forms */

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
