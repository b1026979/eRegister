<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to Grails</title>

	</head>
	<body>
		<p><strong> This is eRegister</strong></p>
		<p>
		<g:link controller="Instructor">Manage Instructors</g: link>
		</p>
		<p>
		<g:link controller="Course">Manage Courses</g: link>
		</p>
		<p>
		<g:link controller="Student">Manage Students</g: link>
		</p>
		<p>
		<g:link controller="RegClass">Manage RegClass</g: link>
		</p>
		<p>
		<g:link controller="RegisterEntry">Manage RegisterEntry</g: link>
		</p>
		<p>
		<g:link controller="RegistrationSheet">Manage RegistrationSheet</g: link>
		</p>
		<p>
		<g:link controller="Enrollment">Manage Enrollment</g: link>
		</p>
		<p><lo>
		<g:link controller="Apply"><strong>Apply</strong></g: link>
			<li><g:link controller="apply" action="listActiveClasses">List of active attendance</g: link>
			<li><g:link controller="apply" action="index">Proccess attendance</g: link>
                        <li><g:link controller="apply" action="listAttendeesSummary">Percentage attendance</g: link>
		</p>		
		<p><lo>
		<g:link controller="Classes"><strong>Manage Classes</strong></g: link>
			<li><g:link controller="Classes.json">json format</g: link>
			<li><g:link controller="Classes.xml">xml format</g: link>
		</p></lo>

	</body>
</html>


