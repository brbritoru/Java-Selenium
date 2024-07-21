# language: pt

  Funcionalidade: Realizar cadastro de usuário em site flores online

  Esquema do Cenario: Cadastro de usuario
    Dado que estou na area de cadastro do site flores online
    Quando preencho o email como "<email>"
    E preencho o nome como "<nome>"
    E preencho o telefone como "<telefone>"
    E preencho a senha com o valor "<senha>"
    E clico em cadastrar
    Entao o usuario aparece com o login efetuado na pagina

    Exemplos:
      | email                  | nome           | telefone   | senha    |
      | Maria.Jose@abc.com     | Maria Jose     | 1155116666  | 00112244 |
      | Maria.Joao@aaa.com     | Maria Joao     | 1155117777  | 00112244 |
      | Maria.Jesus@bbb.com    | Maria Jesus    | 1155118888  | 00112244 |