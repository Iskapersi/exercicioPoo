package aula9

interface Arquivo {
    fun arquivoDocx(){}
    fun arquivoPdf(){}

    fun salvarDocumento (acao: String) {
        when (acao) {
            "docx" -> arquivoDocx()
            "pdf" -> arquivoPdf()
        }
    }
}

open class GeradorDeArquivos: Arquivo {
    override fun arquivoDocx() {
        println("Salvo em Docx")}
    override fun arquivoPdf() {
        println("Salvo em PDF")}
}


fun main() {
    val arquivoDaFacul = GeradorDeArquivos()
    arquivoDaFacul.salvarDocumento("pdf")
}