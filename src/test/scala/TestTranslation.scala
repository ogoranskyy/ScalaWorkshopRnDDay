import org.scalatest.FunSuite
import TranslationConversion._

class TestTranslation extends FunSuite {

   test("Test translation"){
      assert("dog".translate("de") == "Hund")
      assert("cat".translate("ru") == "кот")
   }

}
