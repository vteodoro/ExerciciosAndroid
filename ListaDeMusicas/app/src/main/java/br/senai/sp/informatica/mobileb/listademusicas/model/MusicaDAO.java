package br.senai.sp.informatica.mobileb.listademusicas.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicaDAO {
    public static MusicaDAO manager = new MusicaDAO();
    private List<Musica> lista;
    private long id = 0;

    private MusicaDAO(){
        lista = new ArrayList<>();
        lista.add(new Musica(id++, "The Stage", "A7x", "The Stage", "14/11/17"));
        lista.add(new Musica(id++, "Exist", "A7x", "The Stage", "14/11/17"));
        lista.add(new Musica(id++, "Roman Sky", "A7x", "The Stage", "14/11/17"));
        lista.add(new Musica(id++, "Buried Alive", "A7x", "Nightmare", "14/11/17"));
        lista.add(new Musica(id++, "Natural Born Killer", "A7x", "Nightmare", "14/11/17"));
        lista.add(new Musica(id++, "Danger Line", "A7x", "Nightmare", "14/11/17"));
        lista.add(new Musica(id++, "All My Life", "Foo Fighters", "One By One", "14/11/17"));
        lista.add(new Musica(id++, "The Sky Is A Neighborhood", "Foo Fighters", "Concrete and Gold", "14/11/17"));
        lista.add(new Musica(id++, "The Line", "Foo Fighters", "Concrete and Gold", "14/11/17"));
        lista.add(new Musica(id++, "Something From Nothing", "Foo Fighters", "Sonic Highways", "14/11/17"));
    }

    public List<Musica> getLista() {
        Collections.sort(lista);
        return Collections.synchronizedList(lista);
    }

    public Musica getMusica(final Long id) {
        Musica objMus = null;
        for(Musica obj : lista) {
            if(obj.getId() == id) {
                objMus = obj;
                break;
            }
        }
        return objMus;
    }

}
