package model;

public class BaseModel {
    public int id;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BaseModel) {
           BaseModel id2 = (BaseModel)obj;
           if (this.id == id2.id) {
               return true;
           }
        }
        return false;
    }

    @Override
    public String toString() {
        return Integer.toString(this.id);
    }
}
