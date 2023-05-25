package Lab36.NguyenTuanAnh.repository;

import Lab36.NguyenTuanAnh.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** IBookRepository.java là các file
 interface trong một ứng dụng phần mềm quản lý sách. Chúng được sử dụng
 để tương tác với các đối tượng sách (books). Cung cấp các phương thức để thêm, sửa, xóa,
 lấy danh sách các cuốn sách trong cơ sở dữ liệu. */
@Repository
public interface IBookRepository extends  JpaRepository<Book, Long> {
}
