/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.pattern;

import java.util.ArrayList;

/**
 *
 * @author ezer
 */
public class Folder extends AbstractFile{
    
    ArrayList<AbstractFile> files =new ArrayList<>();

    public Folder(String name) {
            super(name);
    }
    
    //add and remove files
    public void addFile(AbstractFile file){
        files.add(file);
    }
    
    public void removeFile(AbstractFile file){
        files.remove(file);
    }

    @Override
    public double getSize() {
        Double size=0.00;
        for (AbstractFile file : files) {
            size+=file.getSize();
        }
        
        return size;
    }
    
}
