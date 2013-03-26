# MaskedEditText

*************************************************************************************************
## en_US

MakedEditText is a simple Android EditText with customizable input mask support.

### JAR

If you want only the jar file it is available [here](https://github.com/toshikurauchi/MaskedEditText/blob/master/MaskedEditText/bin/maskededittext.jar).

### Usage

Add _xmlns:mask="http://schemas.android.com/apk/res/com.your.app.package"_ to your layout xml root.
You're now ready to use MaskedEditText! Just add to your layout xml:

    <br.com.sapereaude.maskedEditText.MaskedEditText 
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        mask:mask="###.###.###-##"
    />
    
Where _mask_ is the input mask you want and '#' is an editable position (will be replaced by a whitespace on screen).
    
You can optionally set the representation character (in case you don't want to use '#'):

    <br.com.sapereaude.maskedEditText.MaskedEditText 
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        mask:mask="ccc.ccc.ccc-cc"
        mask:char_representation="c"
    />

You can also change the mask and the representation character programatically:

	MaskedEditText editText = (MaskedEditText) findViewById(R.id.my_edit_text)
	// Setting the representation character to '$'
	editText.setCharRepresentation('$');
	// Logging the representation character
	Log.i("Representation character", editText.getCharRepresentation());
	// Setting the mask
	editText.setMask("##/##/####");
	// Logging the mask
	Log.i("Mask", editText.getMask());
    
*************************************************************************************************
## pt_BR

MaskedEditText é um EditText do Android com suporte a máscaras de texto customizáveis.

### JAR

Se você quiser somente o arquivo jar ele está disponível [aqui](https://github.com/toshikurauchi/MaskedEditText/blob/master/MaskedEditText/bin/maskededittext.jar).

### Como usar

Adicione _xmlns:mask="http://schemas.android.com/apk/res/br.com.package.do.seu.app"_ à raíz do seu xml de layout.
Agora você já pode usar o MaskedEditText! Basta inserir no local desejado em seu xml de layout:

    <br.com.sapereaude.maskedEditText.MaskedEditText 
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        mask:mask="###.###.###-##"
    />

Onde _mask_ é a máscara do seu interesse e '#' é uma posição editável (que será substituída por um espaço em branco na tela).

Caso seja do seu interesse você pode mudar o caracter de representação (se você não quiser utilizar '#'):

    <br.com.sapereaude.maskedEditText.MaskedEditText 
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        mask:mask="ccc.ccc.ccc-cc"
        mask:char_representation="c"
    />

Você também pode mudar a máscara e o caracter de representação programaticamente:

	MaskedEditText editText = (MaskedEditText) findViewById(R.id.meu_edit_text)
	// Setando o caracter de representação para '$'
	editText.setCharRepresentation('$');
	// Logando o caracter de representação
	Log.i("Caracter de representação", editText.getCharRepresentation());
	// Setando a máscara
	editText.setMask("##/##/####");
	// Logando a máscara
	Log.i("Mascara", editText.getMask());