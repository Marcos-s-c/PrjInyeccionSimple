package testbean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import writer.Serializer;
import writer.JsonSerializer;
import writer.XmlSerializer;


import java.io.Writer;
import java.util.HashMap;


public class MySpringWriterBeanWithDependency {
    private JsonSerializer writer;
    @Autowired
    public void setWriter (JsonSerializer jsonSerializer){
        this.writer = jsonSerializer;
    }
    public void run(){

        HashMap<String, String> hashList = new HashMap<>();
        writer.serialize(hashList);
        hashList.put("name", "John");
        hashList.put("age", "30");
        hashList.put("city", "New York");

        Serializer serializer = new JsonSerializer(); // Creamos una instancia de JsonSerializer por defecto
        String json = serializer.serialize(hashList); // Obtenemos el string JSON

        serializer = new XmlSerializer(); // Cambiamos la implementación a XmlSerializer
        String xml = serializer.serialize(hashList); // Obtenemos el string XML

        System.out.println(json);
        System.out.println(xml);
    }

}
