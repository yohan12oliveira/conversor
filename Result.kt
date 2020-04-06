class Result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        if (intent != null) {
            val valorInserido = intent.getStringExtra("valorInserido")
            val valorSpinner = intent.getStringExtra("valorSpinner")

            val resultado = findViewById<TextView>(R.id.resultado)
            if(valorInserido != null){
                if(valorSpinner.toString() == "Dolar"){
                    val valor = valorInserido.toDouble() * 5.30
                    val texto = "Valor: $valor"
                    resultado.text = texto
                }
                else if(valorSpinner.toString() == "Euro"){
                    val valor = valorInserido.toDouble() * 5.70
                    val texto = "Valor: $valor"
                    resultado.text = texto
                }
                else if(valorSpinner.toString() == "Peso"){
                    val valor = valorInserido.toDouble() * 0.082
                    val texto = "Valor: $valor"
                    resultado.text = texto
                }
            }

        }
    }
}
