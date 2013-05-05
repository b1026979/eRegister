
<%@ page import="uk.ac.shu.webarch.eregister.Instructor" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'instructor.label', default: 'Instructor')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-instructor" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-instructor" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list instructor">
			
				<g:if test="${instructorInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="instructor.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${instructorInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${instructorInstance?.staffid}">
				<li class="fieldcontain">
					<span id="staffid-label" class="property-label"><g:message code="instructor.staffid.label" default="Staffid" /></span>
					
						<span class="property-value" aria-labelledby="staffid-label"><g:fieldValue bean="${instructorInstance}" field="staffid"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${instructorInstance?.classes}">
				<li class="fieldcontain">
					<span id="classes-label" class="property-label"><g:message code="instructor.classes.label" default="Classes and IDs" /></span>
					
						<g:each in="${instructorInstance.classes}" var="c">
						<span class="property-value" aria-labelledby="classes-label"><g:link controller="regClass" action="show" id="${c.id}">${c?.course.courseName.encodeAsHTML()}, ${c?.id.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${instructorInstance?.id}" />
					<g:link class="edit" action="edit" id="${instructorInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
