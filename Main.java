/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        LessonManager lessonManager = new LessonManager();
        lessonManager.listLessons();

        String day3 = "3. Gün 21 Nisan 2021";
        Content content4 = new Content("Ders 1", "Ders1 Detayları");
        Content content5 = new Content("Ders 2", "Ders2 Detayları");
        Content content6 = new Content("Ödev1", "Ödev1 Detayları");
        Content[] contents = { content4, content5, content6 };
        Lesson lesson3 = new Lesson(day3, contents);

        lessonManager.addLesson(lesson3);

    }
}