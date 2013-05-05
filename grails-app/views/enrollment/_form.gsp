<%@ page import="uk.ac.shu.webarch.eregister.Enrollment" %>



<div class="fieldcontain ${hasErrors(bean: enrollmentInstance, field: 'regClass', 'error')} required">
	<label for="regClass">
		<g:message code="enrollment.regClass.label" default="Reg Class" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="regClass" name="regClass.id" from="${uk.ac.shu.webarch.eregister.RegClass.list()}" optionKey="id" required="" value="${enrollmentInstance?.regClass?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: enrollmentInstance, field: 'student', 'error')} required">
	<label for="student">
		<g:message code="enrollment.student.label" default="Student" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="student" name="student.id" from="${uk.ac.shu.webarch.eregister.Student.list()}" optionKey="id" required="" value="${enrollmentInstance?.student?.id}" class="many-to-one"/>
</div>

