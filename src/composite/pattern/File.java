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
public class File extends AbstractFile{
    Double size;

    public File(String name, Double size) {
        super(name);
        this.size = size;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
    
    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public double getSize() {
        return this.size;
    }
    
    
    
    
}