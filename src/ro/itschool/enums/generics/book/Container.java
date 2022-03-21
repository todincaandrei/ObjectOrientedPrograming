package ro.itschool.enums.generics.book;

public class Container<T> {

    private T [] objects ;

    private int counter = 0;

    public Container(T[] objects) {
        this.objects = objects;
    }

    public T[] getObjects() {
        return objects;
    }


    public void setObjects(T[] objects) {
        this.objects = objects;
    }


    public void add(T object){
        this.objects[counter] = object;
        counter++;
    }

    public void remove(int index){
        this.objects[index] = null;
    }
}
