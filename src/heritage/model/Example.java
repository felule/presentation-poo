package heritage.model;

// Type Class - Visibilité Public
public class Example {
    private String name;
    private Integer age;

    // Constructor vide
    public Example(){}

    // Constructor complet
    public Example(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    // Setter
    public void setName(String name){
            this.name = name;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    // Methode
    public String presenter(){
        return "Je suis "+ this.name + " j'ai " + this.age + "ans";
    }

    // Cas du to string
    public String toString(){
        return "Name : "+ this.name + "\nAge : " + this.age + "ans";
    }
}
