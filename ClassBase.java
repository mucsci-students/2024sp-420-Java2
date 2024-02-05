import java.util.ArrayList;
public class ClassBase
{
    //Name of the class.
    private String className;
    //ArrayList of attributes for this class.
    private ArrayList<attributes> classAttributes;
    
    public ClassBase(String name)
    {
        className = name;
        classAttributes = new ArrayList<attributes>();
    }
    public String getName()
    {
        return className;
    }
    public void setName(String newName)
    {
        className = newName;
    }
    public ClassBase setEquals(ClassBase input)
    {
        input.className = className;
        input.classAttributes = classAttributes;
        return input;
    }


    /*Adds a new attribute, checks to see if an
    * attibute with this newName already exists
    */
    public void addAttribute(String newName, E newContent){
<<<<<<< HEAD
        try{
            for(Attributes att: classAttributes){
                if(att.getName().equalsIgnoreCase(newName)){
                    throw new exception("Attribute already exists");
                }
=======

        for (attributes att: classAttributes){
            if(att.getName().equalsIgnoreCase(newName)){
                throw new exception("Attribute already exists");
>>>>>>> 4a379ea9ea62d6b7fe4dbc02851ad764ac08d3a9
            }

            classAttributes.add(new attributes(newName, newContent));
        }
        catch(exception noAdd){
        }

    }

    /*Sets the name of an existing attribute,
    * an error is thrown if no attribute exists
    * with this name 
    */
    public void setAttName(String oldName, String newName){
<<<<<<< HEAD
        try{
            int set = 0;
            for(Attributes att: classAttributes){
                if(att.getName().equalsIgnoreCase(oldName)){
                    att.setName(newName);
                    set++;
                }
            }

            if(set == 0){
                throw new exception("Attribute with that name does not exist.");
=======
        int set = 0;
        for(attributes att: classAttributes){
            if(att.getName().equalsIgnoreCase(oldName)){
                att.setName(newName);
                set++;
>>>>>>> 4a379ea9ea62d6b7fe4dbc02851ad764ac08d3a9
            }
        }
        catch(exception noNameChange){
        }
        
    }

    /*Sets the content of an existing attribute
    * An error is thrown if an attribute with that
    * doesn't exist
    */
    public void setAttContent(String Name, E NewContent){
<<<<<<< HEAD
        try{
            int set = 0;
            for(Attributes att: classAttributes){
                if(att.getName().equalsIgnoreCase(Name)){
                    att.setContent(newContent);
                    set++;
                }
            }

            if(set == 0){
                throw new exception("Attribute with that name does not exist.");
=======
        int set = 0;
        for(attributes att: classAttributes){
            if(att.getName().equalsIgnoreCase(Name)){
                att.setContent(newContent);
                set++;
>>>>>>> 4a379ea9ea62d6b7fe4dbc02851ad764ac08d3a9
            }
        }
        catch(exception noAdd){
            System.out.println(noAdd);
        }

        
    }

    /*Deletes the attribute from the list
    * throws an exception if an attribute with
    * that name doesn't exist
    */
    public void deleteAttribute(String Name){
<<<<<<< HEAD
        try{
            int removed = 0;
            for(Attributes att: classAttributes){
                if(att.getName().equalsIgnoreCase(Name)){
                    classAttributes.remove(att);
                    removed++;
                }
=======
        int removed = 0;
        for(attributes att: classAttributes){
            if(att.getName().equalsIgnoreCase(Name)){
                classAttributes.remove(att);
                removed++;
>>>>>>> 4a379ea9ea62d6b7fe4dbc02851ad764ac08d3a9
            }

            if(removed == 0){
                throw new exception("Attribute with that name does not exist.");
            }

        }
        catch(exception noAdd){
            System.out.println(noAdd);
        }
        
    }


}
