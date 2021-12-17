package com.library.hw18q4.application.book;

import com.library.hw18q4.entity.Book;
import com.library.hw18q4.entity.Genre;
import com.library.hw18q4.entity.Language;
import com.library.hw18q4.service.AuthorService;
import com.library.hw18q4.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "addbook",value = "/addbook")
public class AddBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("Title");
        int price = Integer.parseInt(req.getParameter("Price"));
        long isbn = Long.parseLong(req.getParameter("ISBN"));
        int genreNum = Integer.parseInt(req.getParameter("Genre"));
        Genre genre=Genre.getGenre(genreNum);

        int languageNum = Integer.parseInt(req.getParameter("Language"));
        Language language = Language.getLanguage(languageNum);

        String[] inputId = req.getParameter("Author").split(",");
        int[] authorId = new int[inputId.length];
        for (int i = 0; i < inputId.length; i++) {
            authorId[i] = Integer.parseInt(inputId[i]);
        }
        AuthorService authorService = new AuthorService();
        /*List<Author> authors = new ArrayList<>();
        for (int j : authorId) {
            try {
                authors.add(authorService.loadById(j));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }*/
        new BookService().saveOrUpdate(Book.bookBuilder()
                .setTitle(name)
                .setPrice(price)
                .setIsbn(isbn)
                .setGenre(genre)
                .setLanguage(language)
                //.setAuthors(authors)
                .build());
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        String title = "Adding";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
                "transactional//en\">\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body background = \"Orange\">\n" +
                "<h1 align = \"center\">" + title + "</h1>\n" +
                "<ul>\n" +
                "   <li><b>Done!</b>: " +
                "</ul>\n" +
                "</body>\n" +
                "</html>");
    }
}
