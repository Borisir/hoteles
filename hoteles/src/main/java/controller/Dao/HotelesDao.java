package controller.Dao;

import controller.Dao.implement.AdapterDao;
import controller.tda.graph.graphlablenodirect;
import controller.tda.list.LinkedList;
import models.Hoteles;
public class HotelesDao extends AdapterDao<Hoteles> {
    private Hoteles hoteles;
    private LinkedList<Hoteles> listaHoteles;

    public HotelesDao() {
        super(Hoteles.class);
    }

    public Hoteles getHoteles(){
        if(hoteles == null){
            hoteles = new Hoteles();
        }
        return this.hoteles;
    }

    public void setHoteles(Hoteles hoteles){
        this.hoteles = hoteles;
    }

    public LinkedList<Hoteles> getListAll(){
        if(listaHoteles == null){
            listaHoteles = new LinkedList<>();
        }
        return this.listaHoteles;
    }

    public Boolean save() throws Exception {
        Integer id = getListAll().getSize() + 1;
        getHoteles().setIdhotel(id);
        persist(getHoteles());
        return true;
    }

    
}
