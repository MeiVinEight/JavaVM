package org.asm.file;

public abstract class Attribute
{
	private final short attributeNameIndex;

	public Attribute(short attributeNameIndex)
	{
		this.attributeNameIndex = attributeNameIndex;
	}

	public abstract AttributeType getType();

	public short getAttributeNameIndex()
	{
		return attributeNameIndex;
	}

	public abstract int getLength();

	public abstract byte[] toByteArray();
}
