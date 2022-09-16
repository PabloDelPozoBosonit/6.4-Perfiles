package FormacionBackend6.MyConfiguration;

import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyConfiguration  {

    File doc = new File("C:\\Users\\pablo.delpozo\\Documents\\ProyectosJava\\6.4Perfiles\\src\\main\\resources\\myconfiguration.properties");
    String linea;
    List<String> valores = new ArrayList<>();
    String[] var;


    public List<String> leerArchivo() throws Exception {

        BufferedReader obj = new BufferedReader(new FileReader(doc));


        while ((linea = obj.readLine()) != null) {

            var = linea.split("=");

            for (int i = 0; i < var.length; i++) {
                valores.add(var[i]);
            }

        }

        return valores;


    }
}
