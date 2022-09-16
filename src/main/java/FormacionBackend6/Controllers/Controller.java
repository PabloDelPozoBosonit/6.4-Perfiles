package FormacionBackend6.Controllers;
import FormacionBackend6.MyConfiguration.MyConfiguration;
import FormacionBackend6.Perfiles.Perfil1;
import FormacionBackend6.Perfiles.Perfiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {


    MyConfiguration Mc = new MyConfiguration();
    @Value("${var1}")
    private String var1;

    @Value("${var2}")
    private String var2;

    @Autowired
    Perfiles perfiles;

    @GetMapping("parametros")
    public String getParametros() {
        return "El valor de los parametros es:\nVARIABLE 1: " + var1 + "\nVARIABLE 2: " + var2;
    }

    @GetMapping("myconfiguration")
    public List<String> getMyConfiguration() throws Exception{
         return Mc.leerArchivo();
    }

    @GetMapping("perfil")
    public String getPerfil(){
        return perfiles.miFuncion();
    }


}
