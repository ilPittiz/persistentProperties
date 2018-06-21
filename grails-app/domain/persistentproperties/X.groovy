package persistentproperties

class X {
	
	String x
	String y
	A z
	Set<F> fs
	Set<F> efs

	static mapping = {
		id name: 'x', generator: 'assigned'
		version false
	}

	static embedded = [ 'efs' ]

}
