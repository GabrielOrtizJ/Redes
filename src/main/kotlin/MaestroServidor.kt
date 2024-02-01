 fun main(){
     val hilo = Thread{
         val servidor = Servidor2()
         servidor.iniciar()
     }
     hilo.start()
     hilo.join()

 }