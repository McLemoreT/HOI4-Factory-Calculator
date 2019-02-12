public class Nation {
	public int Consumer_Goods = 0;
	public int Military_Factories = 0;
	public int Civilian_Factories = 0;
	public int Naval_Dockyards
	public double Construction_Bonus = 0;
	public double Civilian_Bonus = 0;
	//Constructors
	public SetConsumerGoods (int a){
		Consumer_Goods = a;
	}
	public SetMilitaryFactories (int a){
		Military_Factories = a;
	}
	public SetCivilianFactories (int a){
		Civilian_Factories = a;
	}
	public SetNavalDockyards (int a){
		Naval_Dockyards = a;
	}
	public SetConstructionBonus (double a){
		Construction_Bonus = a;
	}
	public SetCivilianBonus (double a){
		Civilian_Bonus = a;
	}
	//Return functions
	public int GetConsumerGoods(){
		return Consumer_Goods;
	}
	public int GetMilitaryFactories
