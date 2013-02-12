package uk.ac.shu.webarch.eregister

class Student {
	String name
	String studentNumber
	
	static maapedBy = [ classes:'student']
  	static hasMany-registerEntry = [ class:RegisterEntry]
}
