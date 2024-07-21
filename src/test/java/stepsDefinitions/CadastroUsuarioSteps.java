package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.FloresHomePage;
import pages.FloresModalPage;

public class CadastroUsuarioSteps {

    FloresHomePage floresHomePage = new FloresHomePage();
    FloresModalPage floresModalPage = new FloresModalPage();

    @Dado("que estou na area de cadastro do site flores online")
    public void que_estou_na_area_de_cadastro_do_site_flores_online() {
        floresHomePage.clicaBotaoEntrar();
        floresModalPage.clicarLinkCadastrar();
    }

    @Quando("preencho o email como {string}")
    public void preencho_o_email_como(String email) {
        floresModalPage.preencherEmail(email);
    }

    @Quando("preencho o nome como {string}")
    public void preencho_o_nome_como(String nome) {
        floresModalPage.preencherNome(nome);
    }

    @Quando("preencho o telefone como {string}")
    public void preencho_o_telefone_como(String telefone) {
        floresModalPage.preencherTelefone(telefone);
    }

    @Quando("preencho a senha com o valor {string}")
    public void preencho_a_senha_com_o_valor(String senha) {
        floresModalPage.preencherSenha(senha);
    }

    @Quando("clico em cadastrar")
    public void clico_em_cadastrar() {
        floresModalPage.clicarCadastrar();
    }

    @Entao("o usuario aparece com o login efetuado na pagina")
    public void o_usuario_aparece_com_o_login_efetuado_na_pagina() {
        floresHomePage.validarMenuMinhaConta();
    }

}
