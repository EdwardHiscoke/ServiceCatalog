<html>
	<head>
		<title>Tr�fflista tj�nster</title>
		<meta name="layout" content="main"/>
	</head>

	<body>
		<h1>Tr�ffar</h1>
		<p>
			S�kte bland ${servicecatalog.ServiceDescription.count()} tj�nster med termen <em>${term}</em>
			och fick ${serviceDescriptions.size()} tr�ff(ar)
		</p>

		<ul>
			<g:each var="service" in="${serviceDescriptions}">
					<div style="width: 20em; float: left"><g:link controller="serviceDescription" action="show" id="${service.id}"> ${service.serviceTitle}</g:link></div>
					<div style="width: 50em">${service.description}</div>
			</g:each>
		</ul>
		
		<g:link controller:'serviceDescription' action:'search'>S�k igen</g:link>
	</body>
</html>