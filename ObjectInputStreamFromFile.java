package co.ojcm.helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamFromFile extends ObjectInputStream {
    public ObjectInputStreamFromFile(String file) throws IOException{
        super(new FileInputStream(file));
    }  
}
