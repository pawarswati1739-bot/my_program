package com.library;

public class Library {
public String libraryName;
public int libID;
public String libAddress;

public Library() {
	
}

public Library(String libraryName, int libID, String libAddress) {
	super();
	this.libraryName = libraryName;
	this.libID = libID;
	this.libAddress = libAddress;
}

public String getLibraryName() {
	return libraryName;
}

public void setLibraryName(String libraryName) {
	this.libraryName = libraryName;
}

public int getLibID() {
	return libID;
}

public void setLibID(int libID) {
	this.libID = libID;
}

public String getLibAddress() {
	return libAddress;
}

public void setLibAddress(String libAddress) {
	this.libAddress = libAddress;
}




}
