package com.oop;

public class MultilevelInheritance {

	public static void main(String[] args) {
    Walton w=new Walton();
    w.baseMoble();
    w.NokiaMoble();
    w.SamsungMoble();
    w.WaltionMoble();
	}

}

 class Mobile{
	void baseMoble(){
		System.out.println("Base Moblile phone");
	}
}
 
 class Samsung extends Mobile{
	 void SamsungMoble(){
			System.out.println("Samsung Moblile phone");
		}
 }
 class Nokia extends Samsung{
	 void NokiaMoble(){
			System.out.println("Nokia Moblile phone");
		}	
 }
 class Walton extends Nokia{
	 void WaltionMoble(){
			System.out.println("walton Moblile phone");
		}
 }
 
