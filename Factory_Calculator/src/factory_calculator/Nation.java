/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_calculator;

/**
 *
 * @author Tyler
 */
public class Nation {
	public int Consumer_Goods = 0;
	public int Military_Factories = 0;
	public int Civilian_Factories = 0;
	public int Naval_Dockyards = 0;
	public int Infrastructure_Level = 0;
	public double Construction_Bonus = 0;
	public double Civilian_Bonus = 0;
	//Constructors
	public void SetConsumerGoods (int a){
		Consumer_Goods = a;
	}
	public void SetMilitaryFactories (int a){
		Military_Factories = a;
	}
	public void SetCivilianFactories (int a){
		Civilian_Factories = a;
	}
	public void SetNavalDockyards (int a){
		Naval_Dockyards = a;
	}
	public void SetInfrastructureLevel(int a){
		Infrastructure_Level = a;
	}
	public void SetConstructionBonus (double a){
		Construction_Bonus = a;
	}
	public void SetCivilianBonus (double a){
		Civilian_Bonus = a;
	}
	//Return functions
	public int GetConsumerGoods(){
		return Consumer_Goods;
	}
	public int GetMilitaryFactories(){
		return Military_Factories;
	}
	public int GetCivilianFactories(){
		return Civilian_Factories;
	}
	public int GetNavalDockyards(){
		return Naval_Dockyards;
	}
	public int GetInfrastructureLevel(){
		return Infrastructure_Level;
	}
	public double GetConstructionBonus(){
		return Construction_Bonus;
	}
	public double GetCivilianBonus(){
		return Civilian_Bonus;
	}
	
}
