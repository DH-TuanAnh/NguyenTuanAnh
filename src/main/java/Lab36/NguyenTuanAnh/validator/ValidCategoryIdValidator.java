package Lab36.NguyenTuanAnh.validator;

import Lab36.NguyenTuanAnh.entity.Category;
import Lab36.NguyenTuanAnh.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category>{
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context) {
        return category != null && category.getId() != null;
    }
}
