package ro.itschool.minishop;

import java.util.List;

public interface Dao<T> {

    /**
     * Sa obtina toate elementele dintr-un fisier.
     *
     * @return Lista elemente din fisier.
     */
    public List<T> getAll();

    /**
     * Gaseste un element in fisier dupa element.
     *
     * @param id Identificator unic
     * @return elementul gasit in fisier dupa id.
     */
    T findById(String id);

    /**
     * Stearga un element dupa id.
     *
     * @param id Id-ul elementului pe care il va sterge.
     */

    void remove(String id);


    /**
     * Adauga un obiect in fisier.
     *
     * @param objectToBeAdded Obiectul de se va adauga in fisier.
     */

    void add(T objectToBeAdded);

}
