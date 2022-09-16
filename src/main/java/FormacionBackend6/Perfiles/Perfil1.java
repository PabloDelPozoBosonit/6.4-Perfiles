package FormacionBackend6.Perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil1")
public class Perfil1 implements Perfiles{

    Perfiles p;

    @Override
    public String miFuncion() {

        return "Estas en el perfil 1";
    }
}
