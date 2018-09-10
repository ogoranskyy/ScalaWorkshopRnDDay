object TranslationConversion {
   // compiler will try to apply this conversion, when String is found, but TranslatedString is expected
   implicit def stringToTranslatedString(s: String): TranslatedString = new TranslatedString(s)
}
