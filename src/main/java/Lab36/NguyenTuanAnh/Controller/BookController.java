package Lab36.NguyenTuanAnh.Controller;

import Lab36.NguyenTuanAnh.entity.Book;
import Lab36.NguyenTuanAnh.services.BookService;
import Lab36.NguyenTuanAnh.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    /** categoryService; cho
     phép đối tượng implement (thực thi) CategoryService được tự động chèn vào thuộc
     tính categoryService của class hiện tại, để đối tượng này có thể được sử dụng
     trong các phương thức của class đó. Điều này giúp cho việc sử dụng
     CategoryService trở nên dễ dàng và tiện lợi hơn trong quá trình lập trình. **/
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String showAllBooks(Model model){
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books",books);
        return "book/list";
    }
    /**Phương thức addBookForm() này trả về một trang HTML cho phép người
     dùng thêm mới một đối tượng Book vào cơ sở dữ liệu. **/
    @GetMapping("/add")
    public String addBookForm(Model model)
    {
        model.addAttribute("book", new Book());
        model.addAttribute("categories", categoryService.getAllCategories());
        return "book/add";
    }
    /** Phương thức addBook() này được sử dụng để xử lý dữ liệu đăng ký từ trang
     HTML "/add" được trả về bởi phương thức "addBookForm" trong câu hỏi trước đó. **/
    @PostMapping("/add")
    public String addBook(@ModelAttribute("book") Book book)
    {
        bookService.addBook(book);
        return "redirect:/books";
    }
}