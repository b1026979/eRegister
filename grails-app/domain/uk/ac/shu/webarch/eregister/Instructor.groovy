package uk.ac.shu.webarch.eregister

/* This  is class called insructor.
the Instractor class has a name and ID attitude */
class Instructor {

String name
String staffid

/*there is a set of classes for one instractor so the association is one instructor to many classes */ 

Set classes

/* in here we declear the other side of the joint which is many classes and is called the RegClass */
static hasMany = [classes : RegClass]

/* in the other side of the class which is decleared as RegClass
we have the instractur name which comes back to Instroctur */
static mappedby = [ classes : 'classInstractor']

static constraints = {	
name(nullable:false, blank:false, maxsize:256) ;
staffid(nullable:false, blank:false, maxsize:20);	
}
}

