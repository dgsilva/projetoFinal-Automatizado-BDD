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

public class AcessarContaStepDefinitions {
	
	WebDriver driver;

	@Given("Acessar a página de autenticação do cliente")
    public void acessar_a_pagina_de_autenticacao_de_cliente() {
    	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.navigate().to("http://localhost:4200/acessar-conta");
    }
	
	@Given("Informar o email de acesso {string}")
    public void informar_o_email_acesso(String email) {
    	WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/app-acessar-conta/div/div/div/div/form/div[1]/input"));
    	element.clear();
    	element.sendKeys(email);
    }
	
	@Given("Informar a senha de acesso {string}")
    public void informar_o_senha_acesso(String senha) {
    	WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/app-acessar-conta/div/div/div/div/form/div[2]/input"));
    	element.clear();
    	element.sendKeys(senha);
    }
	
	@When("Solicitar a realização de acesso")
    public void solicitar_realizacao_acesso() {
    	WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/app-acessar-conta/div/div/div/div/form/div[3]/div/input"));
    	if(element.isEnabled()) {
    		element.click();
    	}else {
    		fail("Botão não está habilitado");
    	}
    }
	
	
	@Then("Sistema autentica o cliente com sucesso")
    public void sistema_autentica_cliente_sucesso() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    	wait.until(ExpectedConditions.urlContains("/finalizar-conta"));
    }
	
	
}
