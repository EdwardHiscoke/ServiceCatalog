package servicecatalog

class ServiceDescriptionController {

    def scaffold = true
	
	def search = {}
	
	def results = {
		def serviceDescriptions = ServiceDescription.withCriteria(){
			or{
				ilike("serviceTitle", "%${params.serviceName}%")
				ilike("description", "%${params.serviceName}%")
				order("serviceTitle", "asc")
			}
		}
		
		return [serviceDescriptions:serviceDescriptions, term:params.serviceName]
    }
		
}
