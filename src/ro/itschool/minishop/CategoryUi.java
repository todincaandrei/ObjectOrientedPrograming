package ro.itschool.minishop;

import java.util.List;
import java.util.Scanner;

public class CategoryUi {
    private Scanner sc = new Scanner(System.in);
    private CategoryService categoryService = new CategoryService();


    public void startCategoryManagement() {
        int optiune = 0;

        do {
            displayMenu();
            optiune = sc.nextInt();
            sc.nextLine();

            if (optiune == 1) {
                displayCategoriesUi();
            } else if (optiune == 2) {
                findCategoryUi();
            } else if (optiune == 4) {
                updateUi();
            } else if (optiune == 5) {
                addCategoryUi();
            } else if (optiune == 6) {
                deleteCategoryUi();
            }
        } while (optiune != 7);
    }

    private void deleteCategoryUi() {
        System.out.println("Enter id of category that will be deleted:");
        String categoryId = sc.nextLine();
        categoryService.removeCategory(categoryId);
    }

    private void addCategoryUi() {
        System.out.println("Enter id of category:");
        String categoryId = sc.nextLine();
        System.out.println("Enter name of category:");
        String name = sc.nextLine();
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setId(categoryId);
        categoryModel.setName(name);
        categoryService.addCategory(categoryModel);
    }

    private void updateUi() {
        System.out.println("Enter id of category that will be changed:");
        String idOfCategory = sc.nextLine();
        System.out.println("Enter new name of category:");
        String newName = sc.nextLine();
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setId(idOfCategory);
        categoryModel.setName(newName);

        categoryService.update(categoryModel);
    }

    private void displayCategoriesUi() {
        List<CategoryModel> categories = categoryService.getAllCategories();
        for (CategoryModel category : categories) {
            System.out.println(category.getId() + " " + category.getName());
        }
    }


    private void findCategoryUi() {
        System.out.println("Enter id of category that you want to find:");
        String idOfCategory = sc.nextLine();
        try {
            CategoryModel categoryFound = categoryService.getCategoryById(idOfCategory);
            System.out.println(categoryFound.getId() + categoryFound.getName());

        } catch (CategoryNotFoundException var) {
            System.out.println("Category not found!");
        }
    }

    private void displayMenu() {
        System.out.println("1.View categories");
        System.out.println("2.Find category by id");
        System.out.println("3.View ordered categories");
        System.out.println("4.Change name of a category");
        System.out.println("5.Add category");
        System.out.println("6.Remove category");
        System.out.println("7.Exit");
    }
}
