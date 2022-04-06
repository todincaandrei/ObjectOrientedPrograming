package ro.itschool.minishop;

import java.util.List;

public abstract class ModelDao<M extends Model> implements Dao<M> {

    private String fileName;
    private ObjectFileScanner<M> objectFileScanner = new ObjectFileScanner<>();

    public ModelDao(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<M> getAll() {

        List<M> object = objectFileScanner.readFromFile(this.fileName);
        return object;
    }


    @Override
    public void add(M objectToBeAdded) {
        List<M> object = objectFileScanner.readFromFile(fileName);
        object.add(objectToBeAdded);
        objectFileScanner.writeToFile(fileName, object);

    }

    @Override
    public void remove(String id) {
        List<M> objects = objectFileScanner.readFromFile(fileName);
        for (int i = 0; i < objects.size(); i++) {
            M object = objects.get(i);
            if (object.getId().equals(id)) {
                objects.remove(i);
                break;
            }
        }
        objectFileScanner.writeToFile(fileName, objects);
    }

    @Override
    public M findById(String id) {
        List<M> objects = objectFileScanner.readFromFile(fileName);
        M objectFound = null;
        for (M object : objects){
            if (object.getId().equals(id)){
                objectFound = object;
                break;
            }
        }

        return null;
    }
}
