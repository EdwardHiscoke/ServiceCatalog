import servicecatalog.Organisation;
import servicecatalog.ServiceDescription;

class BootStrap {

    def init = { servletContext ->
		def orgSJV = new Organisation( name:"Jordbruksverket", organisationalNumber:"100", homepage:"www.sjv.se").save()
		def orgCSN = new Organisation( name:"Centrala Studienämnden", organisationalNumber:"200", homepage:"www.csn.se").save()
		def orgMGV = new Organisation( name:"Migrationsverket", organisationalNumber:"300", homepage:"www.mgv.se").save()
		
//		def sdKor = new ServiceDescription(serviceTitle:"CowPurchaser", description:"A service for purchasing cows").save()
//		def x = new ServiceDescription(serviceTitle:"x").save()
		
//		orgSJV.addToServiceDescriptions(x)
		
		def sdKor = new ServiceDescription(serviceTitle:"KoHandlarn", 
			UUID:"1111", 
			description:"Handla dina kor enkelt och effektivt!",
			type:"s-service",
			lifecycleState:"Online",
			classification:"Kreatur",
			homepage:"http://www.jordbruksverket.se/services/KoHandlarn/info",
			level1SupportOpeningHours:"Må-Fre 07-17",
			level1SupportTelephone:"036-155000",
			level1SupportAddress:"Servicedesk, Jordbruksverket, Jönköping",
			level1SupportEMail:"servicedesk@jordbruksverket.se",
			serviceOpeningHours:"365 24/7",
			serviceVersion:"1.2.1",
			protocol:"REST",
			authenticationRequirements:"Inga",
			liveURI:"http://www.jordbruksverket.se/services/KoHandlarn",
			testURI:"http://www.jordbruksverket.se/services/KoHandlarn/test",
			samplecodeURI:"http://www.jordbruksverket.se/services/KoHandlarn/code",
			schemaURI:"http://www.jordbruksverket.se/services/KoHandlarn/schema",
			errorCodes:"http://www.jordbruksverket.se/services/KoHandlarn/errorcodes",
			dataDescription:"http://www.jordbruksverket.se/services/KoHandlarn/datadescription",
			developerDocuments:"http://www.jordbruksverket.se/services/KoHandlarn/developerinfo",
			testData:"http://www.jordbruksverket.se/services/KoHandlarn/testdata"
			).save()
			
		def sdChick = new ServiceDescription(serviceTitle:"KycklingRegistrator", 
			UUID:"1112", 
			description:"Registrera dina kycklingar. Fina priser att vinna"
			).save()
			
		def sdStudy = new ServiceDescription(serviceTitle:"StudiePlaneraren", 
			UUID:"1113", 
			description:"Boka in din studieplan."
			).save()
			
		def sdMigratematic = new ServiceDescription(serviceTitle:"MigreromatEU", 
			UUID:"1114", 
			description:"Allt för dig som skall migrera inom EU."
			).save()

		def sdRegPoints = new ServiceDescription(serviceTitle:"PointCounter",
			UUID:"1156",
			description:"Registrera eller visa studiepoäng."
			).save()

		def sdNameGen = new ServiceDescription(serviceTitle:"NameGenerator",
			UUID:"2134",
			description:"Skall du flytta och vill dessutom ha hjälp med nytt namn? Välj land så ger vi förslag på namn."
			).save()
		
			
			
			
				}
	
    def destroy = {
    }
}
