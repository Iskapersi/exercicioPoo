package aula9

interface Arquivo {
    fun arquivoDocx(){}
    fun arquivoPdf(){}
    fun arquivoTxt()

    fun salvarDocumento (acao: String) {
        when (acao) {
            "docx" -> arquivoDocx()
            "pdf" -> arquivoPdf()
            "txt" -> arquivoTxt()
        }
    }
}

class GeradorDeArquivos: Arquivo {
    override fun arquivoDocx() {
        println("Salvo em Docx")}
    override fun arquivoPdf() {
        println("Salvo em PDF")}

    override fun arquivoTxt() {
        println("Salvo em txt")
    }
}


fun main() {

    val arquivoDaFacul = GeradorDeArquivos()
    arquivoDaFacul.salvarDocumento("txt")

//    val arquivosDaFacul = mutableListOf<GeradorDeArquivos>()
//    arquivosDaFacul.salvarDocumento()


}