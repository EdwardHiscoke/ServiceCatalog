<html>
	<head>
		<title>Träfflista tjänster</title>
		<meta name="layout" content="main"/>
	</head>

	<body>
		<h1>Träffar</h1>
		<p>
			Sökte bland ${servicecatalog.ServiceDescription.count()} tjänster med termen <em>${term}</em>
			och fick ${serviceDescriptions.size()} träff(ar)
		</p>

		<ul>
			<g:each var="service" in="${serviceDescriptions}">
					<div style="width: 20em; float: left"><g:link controller="serviceDescription" action="show" id="${service.id}"> ${service.serviceTitle}</g:link></div>
					<div style="width: 50em">${service.description}</div>
			</g:each>
		</ul>
		
		<g:link controller:'serviceDescription' action:'search'>Sök igen</g:link>
	</body>
</html>