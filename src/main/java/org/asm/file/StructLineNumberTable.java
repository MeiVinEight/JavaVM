package org.asm.file;

public class StructLineNumberTable
{
	private short startPc;
	private short lineNumber;

	public short getStartPc()
	{
		return startPc;
	}

	public void setStartPc(short startPc)
	{
		this.startPc = startPc;
	}

	public short getLineNumber()
	{
		return lineNumber;
	}

	public void setLineNumber(short lineNumber)
	{
		this.lineNumber = lineNumber;
	}

	public byte[] toByteArray()
	{
		byte[] b = new byte[4];
		b[0] = (byte) ((this.startPc >>> 8) & 0XFF);
		b[1] = (byte) (this.startPc & 0XFF);
		b[2] = (byte) ((this.lineNumber >>> 8) & 0XFF);
		b[3] = (byte) (this.lineNumber & 0XFF);
		return b;
	}
}
