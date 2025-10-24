import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Java File Handling Example
 * --------------------------
 * This program demonstrates:
 *  1. Creating and writing to a file
 *  2. Reading from a file
 *  3. Viewing file information
 *  4. Deleting a file
 *
 * The File, FileWriter, and Scanner classes are used here.
 * The try-with-resources statement ensures that resources
 * (like FileWriter and Scanner) are automatically closed.
 */

public class Files {
    public static void main(String[] args) {

        // Step 1️⃣: Create a File object representing "myfile.txt"
        File file = new File("myfile.txt");

        // Step 2️⃣: Write text to the file (creates file if it doesn’t exist)
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Hello, Clement! Welcome to Java File Handling.\n");
            writer.write("This example shows how to create, read, and delete files.\n");
            System.out.println("✅ Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }

        // Step 3️⃣: Read contents from the file
        try (Scanner reader = new Scanner(file)) {
            System.out.println("\n📖 File Contents:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }

        // Step 4️⃣: Display file information (name, path, etc.)
        if (file.exists()) {
            System.out.println("\n📂 File Information:");
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("❌ File does not exist.");
        }

        // Step 5️⃣: Delete the file
        System.out.println("\n🗑️ Attempting to delete the file...");
        if (file.delete()) {
            System.out.println("✅ File deleted successfully: " + file.getName());
        } else {
            System.out.println("❌ Failed to delete the file.");
        }
    }
}
