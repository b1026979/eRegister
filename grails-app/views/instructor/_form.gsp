<%@ page import="uk.ac.shu.webarch.eregister.Instructor" %>



<div class="fieldcontain ${hasErrors(bean: instructorInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="instructor.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${instructorInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: instructorInstance, field: 'staffid', 'error')} required">
	<label for="staffid">
		<g:message code="instructor.staffid.label" default="Staffid" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="staffid" required="" value="${instructorInstance?.staffid}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: instructorInstance, field: 'classes', 'error')} ">
	<label for="classes">
		<g:message code="instructor.classes.label" default="Classes" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${instructorInstance?.classes?}" var="c">
    <li><g:link controller="regClass" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="regClass" action="create" params="['instructor.id': instructorInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'regClass.label', default: 'RegClass')])}</g:link>
</li>
</ul>

</div>

