package controller;
import java.util.ArrayList;

public abstract class BaseRepository <T>{
    public ArrayList<T> pratos;

    public BaseRepository() {
        this.pratos = new ArrayList<T>();
    }

    //create
    public void create(T obj) {
        this.pratos = new ArrayList<T>();
    }
    //read
    public ArrayList<T> read(){
        return this.pratos;
    }
    //update
    public void update(T obj) {
        if (this.pratos.contains(obj)) {
            this.delete(obj);
            this.create(obj);
        }
    }
    //delete
    public void delete(T obj) {
        this.pratos.remove(obj);
    }
    

}
