package main;
/*
 * Copyright (c) 2019 - Luca Bernardini
 * 
 *  This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Xoring1 {
 
	// char is 16 bits unsigned integers representing UTF-16 code units
	// from '\u0000' to '\uffff' inclusive, that is, from 0 to 65535
	
	public static void printBitsChar(char a)
	{
		byte bit;
		for(int x = 15; x >= 0; x--)
		{
			// >>> the logical shift to the right shifts the bit to the right
			// the number of positions specified by x and fills from the left with 0s
			
			bit = (byte)((a >>> x) & 0x0001);
			System.out.print(bit);
		}
		System.out.println("");
		
		
	}
	
	public static char xoringChar(char car, char key)
	{
		// xoring unsigned 16 bits 
		char xoredChar = (char)(car ^ key);
		return xoredChar;
	}
	
	public static byte[] xoringArrayBytes(byte[] data, byte[] key)
	{
		// xor function on two byte array
		byte[] xoredByte = (byte[]) new byte[data.length];
		int j = 0;
		for(int i = 0; i < data.length; i++)
		{
			j = i % key.length;
			xoredByte[i] = (byte) (data[i] ^ key[j]);
		}
		return xoredByte;
	}
	
	
	
	public static String toHex(byte[] arrayBytes) {
		// It creates a BigInteger object by passing a signum and a byte array,
		// signum 1 means positive, otherwise if the first byte is negative 
		// it returns a negative BigInteger
		// with the toString(16) base 16 method the output isn't padded with leading zeros
		
	    return new BigInteger(1, arrayBytes).toString(16);
	}
		
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il testo: ");
		String testo = scan.nextLine();
		
		System.out.println("Inserisci la chiave: ");
		String chiave = scan.nextLine();
		
		// Encodes this String into a sequence of bytes using the platform's default 
		// charset, storing the result into a new byte array.
		
		byte[] testoBytes = testo.getBytes(StandardCharsets.UTF_8);
		byte[] chiaveBytes = chiave.getBytes(StandardCharsets.UTF_8);
		
		byte[] cifrato = xoringArrayBytes(testoBytes, chiaveBytes);
		
		System.out.println("Testo cifrato rappresentato in esadecimale " + toHex(cifrato));
		
		byte[] chiaro = xoringArrayBytes(cifrato, chiaveBytes);
		
		// Constructs a new String by decoding the specified 
		// array of bytes using the specified charset.
		String s = new String(chiaro, StandardCharsets.UTF_8);
		
		System.out.println("Testo decifrato " + s);
		
	}

}
