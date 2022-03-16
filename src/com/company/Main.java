package com.company;

import com.company.file.FileInfo;
import com.company.file.books.AudioBook;
import com.company.file.books.Book;
import com.company.file.books.ElectronicBook;
import com.company.file.books.PaperBook;
import com.company.file.prodavec.Client;
import com.company.file.prodavec.Vendor;

import java.time.LocalTime;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import static com.company.file.FileType.*;

public class Main {

    public static void main(String[] args) {
        FileInfo image1 = new FileInfo("image1.png", "12mb", IMAGE);
        FileInfo image2 = new FileInfo("image2.png", "54kb", IMAGE);
        FileInfo image3 = new FileInfo("image3.png", "234546b", IMAGE);
        FileInfo image4 = new FileInfo("image4.png", "1GB", IMAGE);
        FileInfo image5 = new FileInfo("image5.png", "34mb", IMAGE);
        FileInfo image6 = new FileInfo("image6.png", "65kb", IMAGE);

        //paper book
        PaperBook paperBook = new PaperBook("this is paper book fragment", 400, "Book House");

        Book<PaperBook> book1 = new Book<PaperBook>(paperBook, Set.of(image1, image2),
                "Elon Musk", "Bekzhan Rakhmankulov", 450);


        //audio book
        FileInfo audioFragment = new FileInfo("audiofragment.mp3", "43mb", AUDIO_FILE);
        FileInfo audioFile = new FileInfo("audioFile.mov", "200.mb", AUDIO_FILE);

        AudioBook audioBook = new AudioBook(
                audioFragment,
                LocalTime.of(2, 4, 32),
                audioFile
        );

        Book<AudioBook> book2 = new Book<>(
                audioBook,
                Set.of(image3, image4),
                "Syngan Kylych",
                "Tologon Kasymbekov",
                1000
        );

        //e-book

        FileInfo fileInfo = new FileInfo("electronicbook.pdf", "54mb", PDF);

        ElectronicBook electronicBook = new ElectronicBook("this is e-book fragment",
                432,
                "Dilazyk",
                fileInfo
        );

        Book<ElectronicBook> book3 = new Book<>(
                electronicBook,
                Set.of(image5, image6),
                "Kylym kaarytar bir kun",
                "Chyngyz Aitmatov",
                2000
        );

        //vendor

        Vendor vendor = new Vendor(
                "Nargiza",
                "nargiza@gmail.com",
                "+996552123456",
                List.of(book1, book2, book3)
        );

        //clients
        Client client1 = new Client("Bekzhan",
                "bekzhan@gmail.com"
        );

        Client client2 = new Client(
                "Azamat",
                "azamat@gmail.com"
        );

        System.out.println(vendor.getVendorName() + "'s books");
        vendor.getBooksToSale().forEach(printBook);

        System.out.println();

        application.like(client1, book2);

        System.out.println(client1.getClientName() + "'s liked books");
        client1.getLikedBooks().forEach(printBook);

        application.buyABook(client1, book3);

        System.out.println(client1.getClientName() + "'s bought books");
        client1.getSatypAlyngynganKitepteri().forEach(printBook);

    }

    static Consumer<Book<?>> printBook = System.out::println;

}
