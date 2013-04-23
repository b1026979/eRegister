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
                                                                                courseDescription:'my optional choice').save();

        def monday_pm_class = RegClass.findByCourseAndName(web_arch_course, 'WebArch-Monday') ?:
                                                                      new RegClass(name: 'WebArch-Mondays',
                                                                      classInstructor:ian_instructor,
                                                                      course:web_arch_course).save();
        def tuesday_pm_class = RegClass.findByCourseAndName(web_arch_course, 'WebArch-Monday') ?:
                                                                      new RegClass(name: 'WebArch-Tuesdays',
                                                                      classInstructor:ian_instructor,
                                                                      course:web_arch_course).save();

        def student_a = Student.findByStudentNumber('A111') ?:
                      new Student(studentNumber:'A111', fullStudentName:'Student Fred', notes:'Student Fred Notes').save();
        def student_b = Student.findByStudentNumber('B111') ?:
                      new Student(studentNumber:'B111', fullStudentName:'Student James', notes:'Student James Notes').save();
        def student_c = Student.findByStudentNumber('C111') ?:
                      new Student(studentNumber:'C111', fullStudentName:'Student Gill', notes:'Student Gill Notes').save();
        def student_d = Student.findByStudentNumber('D111') ?:
                      new Student(studentNumber:'D111', fullStudentName:'Student Freda', notes:'Student Freda Notes').save();


        def student_a_web_arch = Enrollment.findOrCreateByStudentAndRegClass(student_a,monday_pm_class)

        def student_b_web_arch = Enrollment.findOrCreateByStudentAndRegClass(student_b,monday_pm_class)

        def student_c_web_arch = Enrollment.findOrCreateByStudentAndRegClass(student_c,tuesday_pm_class)

        def student_d_web_arch = Enrollment.findOrCreateByStudentAndRegClass(student_d,tuesday_pm_class)
        
        
        

    }
    def destroy = {
    }
}
