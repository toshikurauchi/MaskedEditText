# MaskedEditText

*************************************************************************************************
## en_US

MakedEditText is a simple Android EditText with customizable input mask support.

### Setup

1. Clone the project into your workspace
2. Import it as an Eclipse project.
3. Then in __your__ project properties select _Android -> Add_
4. Select MaskedEditText
5. Click _ok_
6. Click _ok_ :)

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
    
*************************************************************************************************
## pt_BR

MaskedEditText é um EditText do Android com suporte a máscaras de texto customizáveis.

### Setup

1. Clone o projeto em seu workspace
2. Importe-o como um projeto do Eclipse
3. Nas _properties_ do __seu__ projeto selecione _Android -> Add_
4. Selecione MaskedEditText
5. Clique _ok_
6. Clique _ok_ :)

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