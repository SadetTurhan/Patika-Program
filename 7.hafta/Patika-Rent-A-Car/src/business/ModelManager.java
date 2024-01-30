package business;

import core.Helper;
import dao.ModelDao;
import entity.Model;

import java.util.ArrayList;

public class ModelManager {
    private final ModelDao modelDao = new ModelDao();
    public Model getById(int id){
        return this.modelDao.getById(id);
    }
    public ArrayList<Model> findAll(){
        return this.modelDao.findAll();
    }

    public ArrayList<Object[]> getForTable(int size,ArrayList<Model> models){
        ArrayList<Object[]> modelObjList = new ArrayList<>();
        for(Model obj: models){
            int i = 0;
            Object[] rowObject = new Object[size];
            rowObject[i++] = obj.getId();
            rowObject[i++] = obj.getBrand().getName();
            rowObject[i++] = obj.getName();
            rowObject[i++] = obj.getType();
            rowObject[i++] = obj.getYear();
            rowObject[i++] = obj.getFuel();
            rowObject[i++] = obj.getGear();
            modelObjList.add(rowObject);
        }
        return modelObjList;
    }
    public boolean save(Model model){
        if(this.getById(model.getId()) != null){
            Helper.showMsg("error");
            return false;
        }
        return this.modelDao.save(model);
    }
    public boolean update(Model model){
        if(this.getById(model.getId()) == null) {
            Helper.showMsg(model.getId() + " ID kayıtlı model bulunamadı");
            return false;
        }
        return this.modelDao.update(model);
    }
    public boolean delete(int id){
        if(this.getById(id) == null){
            return false;
        }

        return this.modelDao.delete(id);
    }
    public ArrayList<Model> getByListBrandId(int brandId){
        return this.modelDao.getByBrandId(brandId);
    }
}
