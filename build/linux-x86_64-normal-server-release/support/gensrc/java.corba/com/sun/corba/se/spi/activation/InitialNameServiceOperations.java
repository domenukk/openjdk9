package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/InitialNameServiceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /mnt/hdd/win_d/source/myself/darkdown/openjdk9/corba/src/java.corba/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Saturday, November 26, 2016 3:28:20 PM HKT
*/

public interface InitialNameServiceOperations 
{

  // bind initial name
  void bind (String name, org.omg.CORBA.Object obj, boolean isPersistant) throws com.sun.corba.se.spi.activation.InitialNameServicePackage.NameAlreadyBound;
} // interface InitialNameServiceOperations
