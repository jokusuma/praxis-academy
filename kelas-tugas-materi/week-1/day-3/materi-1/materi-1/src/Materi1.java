/* Annotation
 * 1.Anotation bisa seperti @author, namanya anotation with element
 * 2.Instead of using anotation, programmer usually use comment (seperti yg di bawah  line public class Materi1)
 * 3.Penulisan annotation yang lebih tepat adalah dengan menggunakan @interface ClassPreamble {} lalu di bawah nya di definisikan @classpreamble 
 * 4.Untuk mengimport dari @ClassPreamble ke java doc, gunakan @Document di atas line @interace
 * 5.Diatas anotation harus ada komen yang menjelaskan detaila anotation untuk apa
 */
/*
//The Author details
@Author( //Annotation with element
   name = "Jojo",
   date = "1/22/2020"
)*/

// import this to use @Documented
import java.lang.annotation.*;

@Documented
@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}

@ClassPreamble (
    author = "John Doe",
    date = "3/17/2002",
    currentRevision = 6,
    lastModified = "4/12/2004",
    lastModifiedBy = "Jane Doe",
    // Note array notation
    reviewers = {"Alice", "Bob", "Cindy"}
)

public class Materi1 {

    /**
     * Author: John Doe
     * Date: 3/17/2002
     * Current revision: 6
     * Last modified: 4/12/2004
     * By: Jane Doe
     * Reviewers: Alice, Bill, Cindy
     * class code goes here
     */

    
    public static void main(String[] args) {
        System.out.println("test");
    }
}