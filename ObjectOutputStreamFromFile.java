package co.ojcm.helper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamFromFile extends ObjectOutputStream {
    public ObjectOutputStreamFromFile(String file) throws IOException{
        super(new FileOutputStream(file));
    }
}
