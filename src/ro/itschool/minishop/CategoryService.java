package ro.itschool.minishop;

import java.util.List;

public class CategoryService {

    private CategoryDao categoryDao = new CategoryDao();

    public List<CategoryModel> getAllCategories() {
        List<CategoryModel> category = categoryDao.getAll();
        return category;
    }


    public void addCategory(CategoryModel category) {
        categoryDao.add(category);
    }

    public CategoryModel getCategoryById(String id) {
        CategoryModel categoryModel = categoryDao.findById(id);
        if (categoryModel == null) {
            CategoryNotFoundException cat = new CategoryNotFoundException();
            throw cat;
        } else {
            return categoryModel;
        }
    }

    public void removeCategory(String id) {
        categoryDao.remove(id);
    }

    public void update(CategoryModel newCategory) {
        String id = newCategory.getId();
        categoryDao.remove(id);
        categoryDao.add(newCategory);
    }


}
