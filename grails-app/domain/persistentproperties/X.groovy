package persistentproperties

class X {
	
	String x
	String y
	A z

	static mapping = {
		id name: 'x', generator: 'assigned'
		version false
	}
	
}
