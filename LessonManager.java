import java.util.ArrayList;
import java.util.List;

public class LessonManager {

    List<Lesson> lessons = new ArrayList<Lesson>();

    public void listLessons() {

        String day1 = "1. Gün 21 Nisan 2021";
        Content content1 = new Content("Ders 1", "Ders1 Detayları");
        Content content2 = new Content("Ders 2", "Ders2 Detayları");
        Content content3 = new Content("Ödev1", "Ödev1 Detayları");
        Content[] contents = { content1, content2, content3 };
        Lesson lesson1 = new Lesson(day1, contents);

        String day2 = "2. Gün 21 Nisan 2021";
        Content content4 = new Content("Ders 1", "Ders1 Detayları");
        Content content5 = new Content("Ders 2", "Ders2 Detayları");
        Content content6 = new Content("Ödev1", "Ödev1 Detayları");
        Content[] contents2 = { content4, content5, content6 };
        Lesson lesson2 = new Lesson(day2, contents2);

        lessons.add(lesson1);
        lessons.add(lesson2);

        for (Lesson lesson : lessons) {
            System.out.println(lesson.name);
            for (Content content : lesson.contents) {
                System.out.println(content.name + " - " + content.body);
            }
        }
        System.out.println("Dersler başarıyla listelendi");
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
        System.out.println("Dersler başarıyla eklendi1");
    }
}
