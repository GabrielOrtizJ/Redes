import java.util.Base64
import javax.crypto.Cipher
import javax.crypto.SecretKey
import javax.crypto.spec.SecretKeySpec

fun main(){
    val clavesecreta = "1234567891234567"
    val clavesecretabase64 :String = Base64.getEncoder().encodeToString(clavesecreta.toByteArray())
println(clavesecretabase64)
    val deco:ByteArray= Base64.getDecoder().decode(clavesecretabase64)
    println(deco)

    val clavesecretabyte:ByteArray = "1234567891234567".toByteArray()
    val key :SecretKey = SecretKeySpec(clavesecretabyte,0,clavesecretabyte.size,"AES")


    val cifrado = Cipher.getInstance("AES")
    val texto = "hoy estamos en clase"

    val textobyte = texto.toByteArray()
    println(texto)
    cifrado.init(Cipher.ENCRYPT_MODE,key)
    val cifradobyte = cifrado.doFinal(textobyte)
    val cifradotexto = String(cifradobyte)
    println(cifradotexto)

}
