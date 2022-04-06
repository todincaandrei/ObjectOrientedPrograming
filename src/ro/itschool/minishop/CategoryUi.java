package ro.itschool.minishop;

import java.util.List;
import java.util.Scanner;

public class CategoryUi {
    private Scanner sc = new Scanner(System.in);
    private CategoryService categoryService = new CategoryService();


    public void startCategoryManagement() {
        int optiune = 0;

        do {
            System.out.println("1.View categories");
            System.out.println("2.Find category by id");
            System.out.println("3.View ordered categories");
            System.out.println("4.Update category");
            System.out.println("5.Add category");
            System.out.println("6.remove category");
            System.out.println("7.Exit");
            optiune = sc.nextInt();
            sc.nextLine();

            if (optiune == 1) {
                List<CategoryModel> categories = categoryService.getAllCategories();
                for (CategoryModel category : categories) {
                    System.out.println(category.getId() + " " + category.getName());
                }
            }else if (optiune == 5){
                System.out.println("Enter id of category:");
                String categoryId = sc.nextLine();
                System.out.println("Enter name of category:");
                String name = sc.nextLine();
                CategoryModel categoryModel = new CategoryModel();
                categoryModel.setId(categoryId);
                categoryModel.setName(name);
                categoryService.addCategory(categoryModel);

            }
        } while (optiune != 7);
    }
}
