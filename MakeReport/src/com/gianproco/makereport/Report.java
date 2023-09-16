package com.gianproco.makereport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class Report {
	private String nameFile;
	private String title;
	private String content;
	private String extension;
	
	
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getNameFile() {
		return nameFile;
	}
	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public void makeReport() {
		if((getNameFile() != null) && (getTitle() != null) && (getContent() != null)){
			/*
			 * 1. Creamos un archivo (Clase File)
			 * 2. El archivo lo convertimos en un stream de bytes (Clase FileOutputStream)
			 * 3. El stream de bytes se convierte a caracteres (Clase OutputStreamWriter)
			 * 4. El Buffer nos ayuda a escribir (o leer) elementos rapidamente
			 * */
			try {
				File reportFile = new File(getNameFile() + "." + getExtension());
				FileOutputStream fos = new FileOutputStream(reportFile);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(getContent());
				bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}else {
			System.out.println("Enter all the file data");
		}
		}
	
	
}
