package com.examly.springapp.service;

import com.examly.springapp.model.Category;
import com.examly.springapp.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public Category addCategory(Category category) {
        return categoryRepo.save(category);
    }

    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    public Optional<Category> getCategoryById(Integer id) {
        return categoryRepo.findById(id);
    }
}