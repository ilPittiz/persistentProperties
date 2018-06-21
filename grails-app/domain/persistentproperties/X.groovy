package persistentproperties

class X {
	
	String x
	String y
	A z
	Set<F> fs

	static mapping = {
		id name: 'x', generator: 'assigned'
		version false
	}
	
}
