object HelloWorld {

    def main(args: Array[String]): Unit = {
        println("Hello World " + args{0} + "!")

        var i = 0
        while (i < args.length) {
            
            if(i % 2 == 0)
                println(args(i))
            else
                println("X")
            i += 1
        }
    }
}