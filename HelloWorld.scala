object HelloWorld {

    def main(args: Array[String]) {
        println("Hello World " + args{0} + "!")

       // método 1 
       for(param <- args) 
           println(param)

       // método 2 
       args.foreach((arg : String) => println(arg)) 
       args.foreach(arg => println(arg))

       // método 3
       args.foreach(println)
       args.foreach(sayHelloTo)

       args.foreach(name => println("Hello " + name))

    }

    def sayHelloTo(name: String) : Unit = {
        println("Hello " + name)
    }
}