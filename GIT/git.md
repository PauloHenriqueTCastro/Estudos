cd: Comando utilizado para entrar em uma determinada pasta.\
cd aula , cd aula/git/projeto

cd..: Comando utilizado para sair da pasta atual (Volta um nivel no diretório).

clear: Limpa o terminal

git init: Cria um repositório na pasta local (Cria uma pasta chamada git).

git status: Mostra o status atual do repositório.

git add: Adiciona um ou varios aruivos ao controle de versão.\
git add Readme.txt, git add . (git add. adiciona todos os arquivos ao controle de versão), git add *.txt (adiciona todos os arquivos que possuiem a extenção escolhida)

git rm: Remove os arquivos do controle de versão. (Pode usar os mesmo exemplos do git add so que subtituindo o add por rm).

git commit -m "Informações do commit": Leva as informações do repositório local para o repositório no git e permite a cração de uma descrção para esse bloco de informações.

.gitignore: É um arquivo que pode ser criado no diretorio principal para ignorar outros arquivos não devem ser enviados para o repositório principal. Basicamente faz com que o git pare de monitorar os arquivos que foram adicionados.

git diff: Mostra as alterações feitas que ainda não estão no controle de versão.Possui outra versão que mostras os arquivos que já estão no controle de versão mas ainda não foram commitados (git diff --staged).

git log: Mostra todos os commits feitos desde o inicio do projeto. Para vizualizar o que foi alterado em cada arquivo, é só utilizaar o parametro -p (git log -p). Para limitar a quatidade de commits que deseja vizualizar, utilize um parametro numérico(git log -p -1). Para sair da tela de log é só pressionar a letra Q\

gitk: Abre o vizualizador de informações do git.

git checkout nomedatag: Troca para uma tag especifica.

git checkout nomedabranch: Troca para uma branch especifica.

git checkout -- nomeArquivo.ExtençãoDele: Remove todas as alterações que foram feitas em um arquivo antes de utilizar o comando git add.

git tag: A tag uma etiqueta para determinado ponto do sistema. Geralmente é utilizada para criar marcações nas diferentes versões de um sistema.\
git tag -a nomedatag -m "Adiciona uma descrição para a tag"

git branch nomedabranch: Cria uma nova ramificação no sistema para que o desenvolvedor consiga fazer modificações sem alterar a principal. 

git branch: Lista todas as branchs de um projeto.

git branch -d nomedabranch: Deleta a branch escolhida.

git show nomedatag: Mostra uma tag especifica do sistema.

git merge nomedabranch: Junta duas branchs. Para ser utilizado precisa estar em uma branch princial e realizar o comando chamando a branch secudaria. 

git clone caminho/do/repositório \ Link do projeto no git hub: Permite criar o clone de um projeto em uma maquina local.

git push origin nomedabranch: Faz o envio de infomações que estão commitadas em uma maquina para o servidor.

git pull origin nomedabranch: Faz a busca dos dados no servidor e faz um merge com o que está atualmente na sua maquina.

Stiruações do dia a dia:\
Para adicionar um arquivo dentro de um commit que já foi realizado, utilize o comando git commit --amend -m "Novo nome do ultimo committ feito".

Para remover um arquivo de um git add. utilize o comando git reset HEAD nomeArquivo.ExtençãoDele












