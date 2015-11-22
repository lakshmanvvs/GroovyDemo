

/**
 * Created by LAKI on 11/22/2015.
 */
class HelloGroovy {
    String name
    String greet()
    { "Hello, $name"}

    static void main(String[] args){
     def helloWorld = new HelloGroovy(name: "Coders")
        println(helloWorld.greet())
    }
}
