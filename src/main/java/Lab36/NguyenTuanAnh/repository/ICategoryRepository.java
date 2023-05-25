package Lab36.NguyenTuanAnh.repository;

import Lab36.NguyenTuanAnh.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/** ICategoryRepository.java là các file
 interface trong một ứng dụng phần mềm quản lý sách. Chúng được sử dụng
 để tương tác với các đối tượng danh mục (categories). Cung cấp các phương thức để thêm, sửa,
 xóa, lấy danh sách các danh mục trong cơ sở dữ liệu.*/
@Repository
public interface ICategoryRepository extends  JpaRepository<Category, Long> {

}
