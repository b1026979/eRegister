package uk.ac.shu.webarch.eregister

class Instructor {

	static mappedBy = [classes'instractor']
	static hasMany =[ classes: RegClass]
  
}
