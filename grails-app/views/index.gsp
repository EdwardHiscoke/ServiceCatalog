<html>
<head>
<title>Sök tjänster</title>
<meta name="layout" content="main" />
</head>
<body>
<formset>
<legend> Sök tjänster</legend>
<g:form controller="serviceDescription" action="results">
	<label for="serviceName">Tjänst</label>
	<g:textField name="serviceName" />
	<g:submitButton name="search" value="Sök" />
</g:form>
</formset>
		
		<p/>
		Senaste tjänsterna
			<g:each var="service" in="${servicecatalog.ServiceDescription.list([sort:'dateCreated', order:'desc', max: 3])}">
					<div style="width: 20em; float: left"><g:link controller="serviceDescription" action="show" id="${service.id}"> ${service.serviceTitle}</g:link></div>
					<div style="width: 50em">${service.description}</div>
			</g:each>
		
		<p/>
		Senast uppdaterade tjänster
			<g:each var="service" in="${servicecatalog.ServiceDescription.list([sort:'lastUpdated', order:'desc', max: 3])}">
					<div style="width: 20em; float: left"><g:link controller="serviceDescription" action="show" id="${service.id}"> ${service.serviceTitle}</g:link></div>
					<div style="width: 50em">${service.description}</div>
			</g:each>

</body>
</html>