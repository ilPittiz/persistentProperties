package persistentproperties

import grails.util.Holders
import org.grails.core.DefaultGrailsDomainClass

class MainController {

    def index() {
		String str = ''
		
		[A, X].each { Class clazz ->
			str += "<br/>$clazz.simpleName properties: "
			
			// Grails 3.2
			//str += new DefaultGrailsDomainClass(clazz).persistentProperties.collect { it.name }
			
			// Grails 3.3
			str += Holders.grailsApplication.mappingContext.getPersistentEntity(clazz.name)?.persistentPropertyNames
		}
		
		render str
	}
}
