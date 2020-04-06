class MainActivity : AppCompatActivity() {

    lateinit var option : Spinner
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        option = findViewById(R.id.spinner2) as Spinner
        result = findViewById(R.id.textView) as TextView

        val options = arrayOf("Dolar", "Euro", "Peso")
        var itemSelecionado = ""

        option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                result.text = "Seleciona a Opção"
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                result.text = options.get(position)
                itemSelecionado = options.get(position)
            }
        }

        botao.setOnClickListener{
            val intencao = Intent(this@MainActivity, Result::class.java)
            intencao.putExtra("valorInserido", valorInserido.text.toString() )
            intencao.putExtra("valorSpinner",itemSelecionado)
            startActivity(intencao)
        }

    }
}
