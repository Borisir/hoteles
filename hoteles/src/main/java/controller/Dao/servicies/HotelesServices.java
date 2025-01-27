package controller.Dao.servicies;

import controller.Dao.HotelesDao;
import models.Hoteles;
import controller.tda.list.LinkedList;
public class HotelesServices {
    private HotelesDao obj;

    public HotelesServices() {
        obj = new HotelesDao();
    }

    public Boolean save() throws Exception {
        return obj.save();
    }

    public LinkedList<Hoteles> listAll() {
        return obj.getListAll();
    }

    public Hoteles getHoteles() {
        return obj.getHoteles();
    }

    public void setHoteles(Hoteles hoteles) {
        obj.setHoteles(hoteles);
    }

    public Hoteles get(Integer id) throws Exception {
        return obj.get(id);
    }

    
    
}
