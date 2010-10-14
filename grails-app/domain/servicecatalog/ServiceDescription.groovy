package servicecatalog

class ServiceDescription {
	String serviceTitle
	String UUID
	String description
	
//	String serviceOwner
//	String ownerRole
//	String ownerName
//	String ownerEMail
//	String ownerTelephone
//	
//	String agreementURI
//	
	String type
	String lifecycleState
	String classification
	
	String homepage
	Date dateCreated
	Date lastUpdated
	
	String level1SupportOpeningHours
	String level1SupportTelephone
	String level1SupportEMail
	String level1SupportAddress
	
	String serviceOpeningHours
	
	String serviceVersion
	Date serviceVersionDate
	String protocol
	String authenticationRequirements

	String liveURI
	String testURI
	String samplecodeURI
	String schemaURI
	String errorCodes
	String dataDescription
	String developerDocuments
	String testData
	
	
    static constraints = {
		serviceTitle( maxSize:100, nullable:false)
		UUID(maxSize:100, nullable:false)
		description(maxSize:100, nullable:false)
		type(inList:["e-service","s-service"], nullable:true)
		lifecycleState(inList:["Online","Offline","Deprecated","Retired","In development"], nullable:true)
		classification(maxSize:20, nullable:true)
		homepage(maxSize:100, nullable:true)

		level1SupportOpeningHours(maxSize:200, nullable:true)
		level1SupportTelephone(maxSize:100, nullable:true)
		level1SupportAddress(maxSize:200, nullable:true)
		level1SupportEMail(maxSize:100, email:true,nullable:true)

		serviceOpeningHours(maxSize:200, nullable:true)
		serviceVersion(maxSize:20, nullable:true)
		serviceVersionDate(nullable:true)
		protocol(inList:["WS-I","REST", "Other"], nullable:true)
		authenticationRequirements(maxSize:200, nullable:true)
		
		liveURI(maxSize:100, nullable:true)
		testURI(maxSize:100, nullable:true)
		samplecodeURI(maxSize:100, nullable:true)
		schemaURI(maxSize:100, nullable:true)
		errorCodes(maxSize:100, nullable:true)
		dataDescription(maxSize:100, nullable:true)
		developerDocuments(maxSize:100, nullable:true)
		testData(maxSize:100, nullable:true)

    }
	
	String toString(){ return "${serviceTitle}" }
}
