# Projeto - Cloud Games

Desenvolvi esse pequeno projeto para práticar o uso de conceitos como: RecyclerView, uso do Adapter, Fragments e uso do TabLayout nos fragments.

Um breve resumo sobre o projeto: Comecei o projeto criando a base de como ficaria o layout, feita a base, comecei criando o primeiro RecyclerView que foi da aba "Catálogo de Jogos", logo após criei um novo layout (catalogo_item) para criar os itens da minha lista, terminado de montar os itens, crei uma classe para servir como modelo de dados para os itens da minha lista (Catalogo Model) e por fim criei um adapter (CatalogoAdapter) para receber e adicionar os itens de lista a meu RecyclerView. Refiz o mesmo processo para a segunda aba "Comprar Separadamente".

Feito o recyclerView, itens, model e adapter das duas abas comecei a criar os Fragments. O primeiro fragment, com o nome de "CatalogoFragment" recebeu os métodos, variáveis que recebiam as views e o layout de "Catalogo de Jogos". Já o segundo fragment o "ComprarSeparadamenteFragment", recebeu os dados e layout da segunda aba "Comprar Separadamente". Depois foi criado um adapter para o TabLayout (TabsAdapter), e por fim configurei o click do botão do TabLayout funcionar com os Fragments.

## Visualização do projeto

![parte 1](https://github.com/johnnvic17/Cloud-Games/assets/142692290/36f6cc61-1682-410b-b01f-df994de7872e)
![parte 2](https://github.com/johnnvic17/Cloud-Games/assets/142692290/7b6892d1-6544-4ddd-9360-a574f6ffc0dc)
