object TranslationConversion {
   implicit def stringToTranslatedString(s: String): TranslatedString = new TranslatedString(s)
}
