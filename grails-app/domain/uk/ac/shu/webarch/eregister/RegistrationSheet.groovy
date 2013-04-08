package uk.ac.shu.webarch.eregister

class RegistrationSheet {

/* the course name for the sheet */
Course course 

/* date of the sheet */
 Date sheetDate

/* signatories */
Set signatories

String notes

static constraints = {

Course(nullable:false, blank:false);
sheetDate(nullable:false, blank:false);
note(nullable:false, blank:false);

}

static mapping = {
notes culomn: 'course_desc', type:text;

}

static hasMany = [classes: RegisterEntry]
static mappedby = [classes : 'student']

}
