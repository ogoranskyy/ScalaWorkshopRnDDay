object TranslationConversion {
   // use of implicit class will prevent that TranslatedString will be created at runtime
   implicit class TranslatedString(s: String) {
      val stringToTranslate: String = s
      val dictionary = Map(
         "en"->Map("cat" ->"cat", "dog"->"dog"),
         "de"->Map("cat"->"Katze", "dog"->"Hund"),
         "ru"->Map("cat"->"кот", "dog"->"пёс")
      )
      def translate(lang: String): String = {
         dictionary(lang)(stringToTranslate)
      }
   }

   // compiler will try to apply this conversion, when String is found, but TranslatedString is expected
   implicit def stringToTranslatedString(s: String): TranslatedString = new TranslatedString(s)

}
