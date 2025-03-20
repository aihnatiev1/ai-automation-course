package lessonTrelloApi.serDeser;

import java.io.*;
import java.nio.file.Files;


public class SerializationWorker {

    private static final String STORAGE_ROOT_FOLDER = "src/main/java/";

    public static void serializeStorage(Object o, String fileName) {
        File folder = new File(STORAGE_ROOT_FOLDER);
        if (!folder.exists() && !folder.mkdirs()) {
            System.err.println("Не вдалося створити директорію: " + STORAGE_ROOT_FOLDER);
            return;
        }

        File file = new File(folder, fileName + ".ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(file.toPath()))) {
            oos.writeObject(o);
            System.out.println("Об'єкт збережено у файлі: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object deserializeStorage(String fileName) {
        File file = new File(STORAGE_ROOT_FOLDER + fileName + ".ser");
        Object o = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            o = ois.readObject();
        } catch (FileNotFoundException e) {
            return null;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Object loaded from storage file: " + fileName);
        return o;
    }


//    public static void serializeStorage(Object o, String fileName) {
//        File folder = new File(STORAGE_ROOT_FOLDER);
//        if (!folder.exists() && !folder.mkdirs()) {
//            System.err.println("Не вдалося створити директорію: " + STORAGE_ROOT_FOLDER);
//            return;
//        }
//
//        File file = new File(folder, fileName + ".txt");
//
//        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//             ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
//             FileWriter writer = new FileWriter(file)) {
//
//            // Серіалізація об'єкта у байтовий масив
//            oos.writeObject(o);
//            oos.flush();
//
//            // Кодування в Base64
//            String base64String = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
//
//            // Запис у файл у текстовому вигляді
//            writer.write(base64String);
//            System.out.println("Об'єкт збережено у файлі (Base64): " + file.getAbsolutePath());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static Object deserializeStorage(String fileName) {
//        File file = new File(STORAGE_ROOT_FOLDER, fileName + ".txt");
//        if (!file.exists()) {
//            System.err.println("Файл не знайдено: " + file.getAbsolutePath());
//            return null;
//        }
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(file));
//             ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
//                     Base64.getDecoder().decode(reader.readLine()));
//             ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream)) {
//
//            return ois.readObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

}
