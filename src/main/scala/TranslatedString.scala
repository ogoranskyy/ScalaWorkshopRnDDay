class TranslatedString(s: String) {
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
