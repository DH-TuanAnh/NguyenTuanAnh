package Lab36.NguyenTuanAnh.services;

import Lab36.NguyenTuanAnh.entity.Book;
import Lab36.NguyenTuanAnh.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/** Trong lớp BookService.java, thường sẽ có các phương thức để thêm,
 sửa, xóa, lấy danh sách các cuốn sách, cùng với việc tìm kiếm các cuốn
 sách theo các tiêu chí khác nhau (ví dụ: tên sách, tác giả, danh mục). Lớp này
 thường sử dụng IBookRepository.java để tương tác với cơ sở dữ liệu và thực
 hiện các tác vụ liên quan đến sách.**/
@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
    public void addBook(Book book){
        bookRepository.save(book);
    }
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    public void updateBook(Book book){
        bookRepository.save(book);
    }

}
