package servicecatalog

class Organisation {
	String name
	String organisationalNumber
	String homepage

	static hasMany = [serviceDescriptions:ServiceDescription]

    static constraints = {
    }
	
	String toString(){ return "${name}" }
	
}
