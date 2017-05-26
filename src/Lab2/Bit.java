package Lab2;

/**
 * Class to implement communication bits, for use in bit strings.
 * 
 */
public class Bit
{

	/**
	 * The value of the <code>Bit</code>, stored as a boolean to make use of
	 * boolean operators.
	 */
	private boolean value;

	/**
	 * Constructs a new <code>Bit</code> with a default value of 0.
	 */
	public Bit( )
	{
		value = false;
	}

	/**
	 * Constructs a new <code>Bit</code> from an integer value of 0 or 1.
	 * 
	 * @param intValue
	 *            Value to assign to the <code>Bit</code>.
	 * @throw IllegalArgumentException if <code>intValue</code> is not 0 or 1.
	 */
	public Bit( int intValue )
	{
		setValue( intValue );
	}

	/**
	 * Constructs a new <code>Bit</code> from <code>boolean</code> value,
	 * where <code>false</code> is 0 and <code>true</code> is 1.
	 * 
	 * @param boolValue
	 *            Value to assign to the <code>Bit</code>.
	 */
	private Bit( boolean boolValue )
	{
		value = boolValue;
	}

	/**
	 * Constructs a new <code>Bit</code> by copying the value from an existing
	 * <code>Bit</code>.
	 * 
	 * @param bitValue
	 *            Value to copy to the new <code>Bit</code>.
	 */
	public Bit( Bit bitValue )
	{
		this.value = bitValue.value;
	}

	/**
	 * Returns the value of this <code>Bit</code> as an integer.
	 * 
	 * @return The bit value of 0 or 1.
	 */
	public int getIntValue( )
	{
		if ( value )
		{
			return 1;
		}
		return 0;

	}

	/**
	 * Sets the value of this <code>Bit</code> from an integer value of 0 or
	 * 1.
	 * 
	 * @param theValue
	 *            Value to assign to the <code>Bit</code>.
	 * @throw IllegalArgumentException if <code>theValue</code> is not 0 or 1.
	 */
	public void setValue( int theValue )
	{
		if ( theValue != 0 && theValue != 1 )
		{
			throw new IllegalArgumentException( "Bit value must be 0 or 1." );
		}
		this.value = ( theValue == 1 );
	}

	/**
	 * Sets the value of this <code>Bit</code> by copying the value from an
	 * existing <code>Bit</code>.
	 * 
	 * @param bitValue
	 *            Value to assign to the <code>Bit</code>.
	 */
	/**
	 * @param bitValue
	 */
	public void setValue( Bit bitValue )
	{
		this.value = bitValue.value;
	}

	/**
	 * Returns a new <code>Bit</code> that is the logical NOT of this
	 * <code>Bit</code>.
	 * 
	 * @return A new <code>Bit</code> that is the complement of this
	 *         <code>Bit</code>.
	 */
	public Bit not( )
	{
		return new Bit( !value );
	}

	/**
	 * Returns a new <code>Bit</code> that is the logical AND of this
	 * <code>Bit</code> and the operand.
	 * 
	 * @param operand
	 *            The <code>Bit</code> with which the AND value should be
	 *            determined.
	 * @return A new <code>Bit</code> with the operation result.
	 */
	public Bit and( Bit operand )
	{
		return new Bit( this.value && operand.value );
	}

	/**
	 * Returns a new <code>Bit</code> that is the logical OR of this
	 * <code>Bit</code> and the operand.
	 * 
	 * @param operand
	 *            The <code>Bit</code> with which the OR value should be
	 *            determined.
	 * @return A new <code>Bit</code> with the operation result.
	 */
	public Bit or( Bit operand )
	{
		return new Bit( this.value || operand.value );
	}

	/**
	 * Returns a new <code>Bit</code> that is the logical XOR (exclusive or)
	 * of this <code>Bit</code> and the operand.
	 * 
	 * @param operand
	 *            The <code>Bit</code> with which the XOR value should be
	 *            determined.
	 * @return A new <code>Bit</code> with the operation result.
	 */
	public Bit xor( Bit operand )
	{
		// The operator ^ is the little-known xor operator in Java
		
		return new Bit( this.value ^ operand.value );
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode( )
	{
		// Code automatically generated by Eclipse to provide a functional hash
		// value.

		final int prime = 31;
		int result = 1;
		result = prime * result + ( value ? 1231 : 1237 );
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals( Object obj )
	{
		// Code automatically generated by Eclipse.

		// Identity check
		
		if ( this == obj )
			return true;
		
		// Null operand check
		
		if ( obj == null )
			return false;
		
		// Type of objects must be the same
		
		if ( getClass( ) != obj.getClass( ) )
			return false;
		
		// We now know there are two distinct Bit objects.  Compare their values.
		
		final Bit other = ( Bit ) obj;
		if ( value != other.value )
			return false;
		return true;
	}

	/**
	 * Returns a {@link String} corresponding to this bit's value.
	 * 
	 * @return A {@link String} with value "0" or "1".
	 */
	@Override
	public String toString( )
	{
		// Converts boolean to int to String
		
		return Integer.toString( this.getIntValue( ) );
	}

}