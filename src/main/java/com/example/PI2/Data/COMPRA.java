
package com.example.PI2.Data;

public class COMPRA {
     
    int id;
    String nome;
    String Fpagamento;
    float valor;
    int desconto;
    
    
    public void setId(int id){
    this.id = id;}
    
    public int getId(){
    return id;}
    
    public void setNome(String a){
    this.nome = a;}
    
    public String getNome(){
    return nome;}
    
    public void setFpagamento(String f){
    this.Fpagamento = f;}
    
    public String getFpagamento(){
    return Fpagamento;}
    
    public void setValor(float v){
    this.valor = v;}
    
    public float getValor(){
    return valor;}
    
    public void setDesconto(int d){
    this.desconto = d;}
    
    public int getDesconto(){
    return desconto;}
}
