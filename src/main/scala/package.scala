import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

package object sjcl extends js.GlobalScope {

  trait SJCLStatic extends js.Object {
    val hash: HashStatic = js.native
    val codec: CodecStatic = js.native 
    val random: PrngStatic = js.native 
    val json: JsonStatic = js.native 
    val misc: MiscStatic = js.native 
    def encrypt(password: String, data: String) : String = js.native 
    def decrypt(password: String, ciphertext: String) : String = js.native
  }

  trait HashStatic extends js.Object {
    val sha256: SHA256Static = js.native
  }

  trait SHA256Static extends js.Object {
    def hash(data: js.Any): js.Array[Int] = js.native
  }

  @JSName("sjcl.hash.sha256")
  class SHA256 extends js.Object {
    def update(data: js.Any): this.type = js.native
    @JSName("finalize")
    def fin(): js.Array[Int] = js.native
    def reset(): this.type = js.native
  }

  trait CodecStatic extends js.Object {
    val hex: HexStatic = js.native
    val base64: Base64Static = js.native
    val utf8String: Utf8StringStatic = js.native
  }

  trait HexStatic extends js.Object {
    def toBits(str: String): js.Array[Int] = js.native
    def fromBits(bits: js.Array[Int]): String = js.native
  }

  trait Utf8StringStatic extends js.Object {
    def toBits(str: String): js.Array[Int] = js.native
    def fromBits(bits: js.Array[Int]): String = js.native
  }

  trait Base64Static extends js.Object {
    def toBits(str: String): js.Array[Int] = js.native 
    def fromBits(bits: js.Array[Int]): String = js.native 
  }

  trait PrngStatic extends js.Object {
    def startCollectors() : Unit = js.native
    def stopCollectors() : Unit = js.native
    def addEntropy(data: js.Any, estimatedEntropy: Int, source: String) : Unit = js.native
    def randomWords(nwords: Int, paranoia: Int): js.Array[Int] = js.native
    def randomWords(nwords: Int): js.Array[Int] = js.native
  }

  trait JsonStatic extends js.Object {
    def encrypt(password: String, data: String) : String = js.native
    def decrypt(password: String, ciphertext: String) : String = js.native
    def encode(obj: js.Object) : String = js.native
    def decode(str: String) : js.Object = js.native
  }

  trait MiscStatic extends js.Object {
    def cachedPbkdf2(password: String, params: js.Object) : CachedPbkdf2 = js.native
    def cachedPbkdf2(password: String) : CachedPbkdf2 = js.native
    def pbkdf2(password: js.Any, salt: js.Any, count: Int, length: Int) : js.Array[Int] = js.native
    def pbkdf2(password: js.Any, salt: js.Any, count: Int) : js.Array[Int] = js.native
    def pbkdf2(password: js.Any, salt: js.Any) : js.Array[Int] = js.native
  }

  trait CachedPbkdf2 extends js.Object {
    val key: js.Array[Int] = js.native
    val salt: js.Array[Int] = js.native
  }

  @JSName("sjcl.misc.hmac")
  class HMAC(key: js.Array[Int]) extends js.Object {
    def encrypt(data: js.Any): js.Array[Int] = js.native
  }

  val sjcl: SJCLStatic = js.native
}
