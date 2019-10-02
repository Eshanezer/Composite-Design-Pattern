/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.pattern;

/**
 *
 * @author ezer
 */
public class CompositePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("Harry Potter 1.mp4", 170.00);
        File file2 = new File("Harry Potter 2.mp4", 170.00);
        File file3 = new File("Mr.Bean.mp4", 170.00);
        
        Folder folder =new Folder("Films");
        Folder folder1 =new Folder("Harry Potter");
        Folder folder2 =new Folder("Mr.Bean");
        
        
        folder.addFile(folder1);
        folder.addFile(folder2);
        
        folder1.addFile(file);
        folder1.addFile(file2);
        folder2.addFile(file3);
        
        
        System.out.println(folder1.getName());
        System.out.println(folder1.getSize());
        System.out.println(file.getName());
        System.out.println(file.getSize());
    }

}
