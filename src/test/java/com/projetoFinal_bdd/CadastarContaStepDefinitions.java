package com.projetoFinal_bdd;

import static org.junit.jupiter.api.Assertions.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastarContaStepDefinitions {
	
	WebDriver driver;

	@Given("Acessar a página de cadastro")
    public void acessar_a_pagina_de_autenticacao_de_cliente() {
    	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.navigate().to("http://localhost:4200/criar-conta");
    }
	
	@Given("Informar nome do cliente {string}")
    public void informar_o_nome_cadastro(String nome) {
    	WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/app-criar-conta/div/div/div/form/div[1]/div[1]/input"));
    	element.clear();
    	element.sendKeys(nome);
    }
	
	@Given("Informar telefone do cliente {string}")
    public void informar_o_telefone_acesso(String telefone) {
    	WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/app-criar-conta/div/div/div/form/div[2]/div[1]/input"));
    	element.clear();
    	element.sendKeys(telefone);
    }
	
	@Given("Informar email do cliente {string}")
    public void informar_o_email_cadastro(String email){
    	WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/app-criar-conta/div/div/div/form/div[3]/div[1]/input"));
    	element.clear();
    	element.sendKeys(email);
    }
	
	@Given("Informar a senha do cliente {string}")
    public void informar_o_senha_cadastro(String senha){
    	WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/app-criar-conta/div/div/div/form/div[4]/div[1]/input"));
    	element.clear();
    	element.sendKeys(senha);
    }
}
