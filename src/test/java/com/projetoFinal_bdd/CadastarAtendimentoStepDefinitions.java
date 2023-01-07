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

public class CadastarAtendimentoStepDefinitions {
	
	WebDriver driver;

	@Given("Acessar a página de cadastro atendimento")
    public void acessar_a_pagina_de_autenticacao_de_cliente() {
    	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.navigate().to("http://localhost:4200/cadastrar-atendimentos");
    }
	
	@Given("Informar a data {string}")
    public void informar_o_data(String data) {
    	WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastrar-atendimentos/div/div/div/form/div[1]/div/input"));
    	element.clear();
    	element.sendKeys(data);
    }
	
	@Given("Informar a hora {string}")
    public void informar_a_hora(String hora) {
    	WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastrar-atendimentos/div/div/div/form/div[2]/div/input"));
    	element.clear();
    	element.sendKeys(hora);
    }
	
	@Given("Informar o assunto {string}")
    public void informar_o_assunto(String assunto){
    	WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastrar-atendimentos/div/div/div/form/div[3]/div/input"));
    	element.clear();
    	element.sendKeys(assunto);
    }
	
	@Given("Informar observacoes {string}")
    public void informar_observacoes(String observacoes){
    	WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastrar-atendimentos/div/div/div/form/div[4]/div/input"));
    	element.clear();
    	element.sendKeys(observacoes);
    }
	
	@Given("Informar o email {string}")
    public void informar_o_email(String email){
    	WebElement element = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastrar-atendimentos/div/div/div/form/div[5]/div/input"));
    	element.clear();
    	element.sendKeys(email);
    }
	
}
