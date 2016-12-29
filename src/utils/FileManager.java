package utils;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import data.Library;

public class FileManager {

	public void save(Library library) throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		mapper.writeValue(new File("library.json"), library);
		
	}

	public Library upload() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		Library library = mapper.readValue(new File("library.json"), Library.class);
		return library;
	}

}
