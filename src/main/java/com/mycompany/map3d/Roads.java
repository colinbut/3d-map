/*
 * |-------------------------------------------------
 * | Copyright © 2009 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.map3d;

import java.awt.Color;
/**
 * @author Colin
 *
 */
public class Roads extends MapData{
	
	private Shape3D shape;
	
	/**
	 * Constructor
	 */
	public Roads(){
		shape = new Shape3D(410,150,-290);
		makeRoads();
	}
	
	/**
	 * 
	 */
	public void makeRoads(){
		Surface3DFlat sauchie = new Surface3DFlat();
		sauchie.addPoints(50, 50, -50);
		sauchie.addPoints(50, 50, -70);
		sauchie.addPoints(130, 50, -70);
		sauchie.addPoints(130, 50, -50);
		sauchie.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(sauchie);
		
		Surface3DFlat sauchie2 = new Surface3DFlat();
		sauchie2.addPoints(130,50,-50);
		sauchie2.addPoints(130,50,-70);
		sauchie2.addPoints(170,55,-70);
		sauchie2.addPoints(170,55,-50);
		sauchie2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(sauchie2);
		
		Surface3DFlat sauchie3 = new Surface3DFlat();
		sauchie3.addPoints(170,55,-50);
		sauchie3.addPoints(170,55,-70);
		sauchie3.addPoints(190,55,-70);
		sauchie3.addPoints(190,55,-50);
		sauchie3.setColor(1f, 0.7f, 0.7f);
		sauchie3.setActualColour(Color.PINK);
		shape.addGItems(sauchie3);
		
		Surface3DFlat sauchie4 = new Surface3DFlat();
		sauchie4.addPoints(190,55,-50);
		sauchie4.addPoints(190,55,-70);
		sauchie4.addPoints(230,60,-70);
		sauchie4.addPoints(230,60,-50);
		sauchie4.setColor(1f, 0.7f, 0.7f);
		sauchie4.setActualColour(Color.PINK);
		shape.addGItems(sauchie4);
		
		Surface3DFlat sauchie5 = new Surface3DFlat();
		sauchie5.addPoints(230,60,-50);
		sauchie5.addPoints(230,60,-70);
		sauchie5.addPoints(250,60,-70);
		sauchie5.addPoints(250,60,-50);
		sauchie5.setColor(1f, 0.7f, 0.7f);
		sauchie5.setActualColour(Color.PINK);
		shape.addGItems(sauchie5);
		
		Surface3DFlat sauchie6 = new Surface3DFlat();
		sauchie6.addPoints(250,60,-50);
		sauchie6.addPoints(250,60,-70);
		sauchie6.addPoints(290,65,-70);
		sauchie6.addPoints(290,65,-50);
		sauchie6.setColor(1f, 0.7f, 0.7f);
		sauchie6.setActualColour(Color.PINK);
		shape.addGItems(sauchie6);
		
		Surface3DFlat sauchie7 = new Surface3DFlat();
		sauchie7.addPoints(290,65,-50);
		sauchie7.addPoints(290,65,-70);
		sauchie7.addPoints(310,65,-70);
		sauchie7.addPoints(310,65,-50);
		sauchie7.setColor(1f, 0.7f, 0.7f);
		sauchie7.setActualColour(Color.PINK);
		shape.addGItems(sauchie7);
		
		Surface3DFlat sauchie8 = new Surface3DFlat();
		sauchie8.addPoints(310,65,-50);
		sauchie8.addPoints(310,65,-70);
		sauchie8.addPoints(350,70,-70);
		sauchie8.addPoints(350,70,-50);
		sauchie8.setColor(1f, 0.7f, 0.7f);
		sauchie8.setActualColour(Color.PINK);
		shape.addGItems(sauchie8);
		
		Surface3DFlat sauchie9 = new Surface3DFlat();
		sauchie9.addPoints(350,70,-50);
		sauchie9.addPoints(350,70,-70);
		sauchie9.addPoints(490,70,-70);
		sauchie9.addPoints(490,70,-50);
		sauchie9.setColor(1f, 0.7f, 0.7f);
		sauchie9.setActualColour(Color.PINK);
		shape.addGItems(sauchie9);
		
		//****
		Surface3DFlat douglas = new Surface3DFlat();
		douglas.addPoints(50,50,-70);
		douglas.addPoints(50,40,-110);
		douglas.addPoints(70,40,-110);
		douglas.addPoints(70,50,-70);
		douglas.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(douglas);
		
		Surface3DFlat douglas2 = new Surface3DFlat();
		douglas2.addPoints(50,40,-110);
		douglas2.addPoints(50,40,-130);
		douglas2.addPoints(70,40,-130);
		douglas2.addPoints(70,40,-110);
		douglas2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(douglas2);
		
		Surface3DFlat douglas3 = new Surface3DFlat();
		douglas3.addPoints(50,40,-130);
		douglas3.addPoints(50,30,-170);
		douglas3.addPoints(70,30,-170);
		douglas3.addPoints(70,40,-130);
		douglas3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(douglas3);
			
		Surface3DFlat douglas4 = new Surface3DFlat();
		douglas4.addPoints(50,30,-170);
		douglas4.addPoints(50,30,-250);
		douglas4.addPoints(70,30,-250);
		douglas4.addPoints(70,30,-170);
		douglas4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(douglas4);
		
		Surface3DFlat douglas5 = new Surface3DFlat();
		douglas5.addPoints(50,30,-250);
		douglas5.addPoints(50,40,-290);
		douglas5.addPoints(70,40,-290);
		douglas5.addPoints(70,30,-250);
		douglas5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(douglas5);
		
		Surface3DFlat douglas6 = new Surface3DFlat();
		douglas6.addPoints(50,40,-290);
		douglas6.addPoints(50,40,-310);
		douglas6.addPoints(70,40,-310);
		douglas6.addPoints(70,40,-290);
		douglas6.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(douglas6);
		
		//***
		Surface3DFlat blyth = new Surface3DFlat();
		blyth.addPoints(110,50,-70);
		blyth.addPoints(110,40,-110);
		blyth.addPoints(130,40,-110);
		blyth.addPoints(130,50,-70);
		blyth.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(blyth);
		
		Surface3DFlat blyth2 = new Surface3DFlat();
		blyth2.addPoints(110,40,-110);
		blyth2.addPoints(110,40,-130);
		blyth2.addPoints(130,40,-130);
		blyth2.addPoints(130,40,-110);
		blyth2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(blyth2);
		
		Surface3DFlat blyth3 = new Surface3DFlat();
		blyth3.addPoints(110,40,-130);
		blyth3.addPoints(110,30,-170);
		blyth3.addPoints(130,30,-170);
		blyth3.addPoints(130,40,-130);
		blyth3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(blyth3);
			
		Surface3DFlat blyth4 = new Surface3DFlat();
		blyth4.addPoints(110,30,-170);
		blyth4.addPoints(110,30,-250);
		blyth4.addPoints(130,30,-250);
		blyth4.addPoints(130,30,-170);
		blyth4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(blyth4);
		
		Surface3DFlat blyth5 = new Surface3DFlat();
		blyth5.addPoints(110,30,-250);
		blyth5.addPoints(110,40,-290);
		blyth5.addPoints(130,40,-290);
		blyth5.addPoints(130,30,-250);
		blyth5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(blyth5);
		
		Surface3DFlat blyth6 = new Surface3DFlat();
		blyth6.addPoints(110,40,-290);
		blyth6.addPoints(110,40,-310);
		blyth6.addPoints(130,40,-310);
		blyth6.addPoints(130,40,-290);
		blyth6.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(blyth6);
		
		
		//***
		Surface3DFlat wcamp = new Surface3DFlat();
		wcamp.addPoints(170,55,-70);
		wcamp.addPoints(170,45,-110);
		wcamp.addPoints(190,45,-110);
		wcamp.addPoints(190,55,-70);
		wcamp.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wcamp);
		
		Surface3DFlat wcamp2 = new Surface3DFlat();
		wcamp2.addPoints(170,45,-110);
		wcamp2.addPoints(170,45,-190);
		wcamp2.addPoints(190,45,-190);
		wcamp2.addPoints(190,45,-110);
		wcamp2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wcamp2);
		
		Surface3DFlat wcamp3 = new Surface3DFlat();
		wcamp3.addPoints(170,45,-190);
		wcamp3.addPoints(170,50,-230);
		wcamp3.addPoints(190,50,-230);
		wcamp3.addPoints(190,45,-190);
		wcamp3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wcamp3);
		
		Surface3DFlat wcamp4 = new Surface3DFlat();
		wcamp4.addPoints(170,50,-230);
		wcamp4.addPoints(170,50,-250);
		wcamp4.addPoints(190,50,-250);
		wcamp4.addPoints(190,50,-230);
		wcamp4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wcamp4);
		
		Surface3DFlat wcamp5 = new Surface3DFlat();
		wcamp5.addPoints(170,50,-250);
		wcamp5.addPoints(170,75,-290);
		wcamp5.addPoints(190,75,-290);
		wcamp5.addPoints(190,50,-250);
		wcamp5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wcamp5);
		
		Surface3DFlat wcamp6 = new Surface3DFlat();
		wcamp6.addPoints(170,75,-290);
		wcamp6.addPoints(170,75,-310);
		wcamp6.addPoints(190,75,-310);
		wcamp6.addPoints(190,75,-290);
		wcamp6.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wcamp6);
		
		//*
		Surface3DFlat well = new Surface3DFlat();
		well.addPoints(230,60,-70);
		well.addPoints(230,55,-110);
		well.addPoints(250,55,-110);
		well.addPoints(250,60,-70);
		well.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(well);
		
		Surface3DFlat well2 = new Surface3DFlat();
		well2.addPoints(230,55,-130);
		well2.addPoints(230,70,-170);
		well2.addPoints(250,70,-170);
		well2.addPoints(250,55,-130);
		well2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(well2);
		
		Surface3DFlat well3 = new Surface3DFlat();
		well3.addPoints(230,70,-170);
		well3.addPoints(230,70,-190);
		well3.addPoints(250,70,-190);
		well3.addPoints(250,70,-170);
		well3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(well3);
		
		Surface3DFlat well4 = new Surface3DFlat();
		well4.addPoints(230,70,-190);
		well4.addPoints(230,85,-230);
		well4.addPoints(250,85,-230);
		well4.addPoints(250,70,-190);
		well4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(well4);
		
		Surface3DFlat well5 = new Surface3DFlat();
		well5.addPoints(230,85,-230);
		well5.addPoints(230,85,-250);
		well5.addPoints(250,85,-250);
		well5.addPoints(250,85,-230);
		well5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(well5);
		
		Surface3DFlat well6 = new Surface3DFlat();
		well6.addPoints(230,85,-250);
		well6.addPoints(230,100,-290);
		well6.addPoints(250,100,-290);
		well6.addPoints(250,85,-250);
		well6.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(well6);
		
		Surface3DFlat well7 = new Surface3DFlat();
		well7.addPoints(230,100,-290);
		well7.addPoints(230,100,-310);
		well7.addPoints(250,100,-310);
		well7.addPoints(250,100,-290);
		well7.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(well7);
		//*
		Surface3DFlat hope = new Surface3DFlat();
		hope.addPoints(290,65,-70);
		hope.addPoints(290,65,-110);
		hope.addPoints(310,65,-110);
		hope.addPoints(310,65,-70);
		hope.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(hope);
		
		Surface3DFlat hope2 = new Surface3DFlat();
		hope2.addPoints(290,65,-130);
		hope2.addPoints(290,85,-170);
		hope2.addPoints(310,85,-170);
		hope2.addPoints(310,65,-130);
		hope2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(hope2);
		
		Surface3DFlat hope3 = new Surface3DFlat();
		hope3.addPoints(290,85,-170);
		hope3.addPoints(290,85,-190);
		hope3.addPoints(310,85,-190);
		hope3.addPoints(310,85,-170);
		hope3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(hope3);
		
		Surface3DFlat hope4 = new Surface3DFlat();
		hope4.addPoints(290,85,-190);
		hope4.addPoints(290,105,-230);
		hope4.addPoints(310,105,-230);
		hope4.addPoints(310,85,-190);
		hope4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(hope4);
		
		Surface3DFlat hope5 = new Surface3DFlat();
		hope5.addPoints(290,105,-230);
		hope5.addPoints(290,105,-250);
		hope5.addPoints(310,105,-250);
		hope5.addPoints(310,105,-230);
		hope5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(hope5);
		
		Surface3DFlat hope6 = new Surface3DFlat();
		hope6.addPoints(290,105,-250);
		hope6.addPoints(290,135,-290);
		hope6.addPoints(310,135,-290);
		hope6.addPoints(310,105,-250);
		hope6.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(hope6);
		
		Surface3DFlat hope7 = new Surface3DFlat();
		hope7.addPoints(290,135,-290);
		hope7.addPoints(290,135,-310);
		hope7.addPoints(310,135,-310);
		hope7.addPoints(310,135,-290);
		hope7.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(hope7);
		
		
		//*
		Surface3DFlat renfield = new Surface3DFlat();
		renfield.addPoints(350,70,-70);
		renfield.addPoints(350,80,-110);
		renfield.addPoints(370,80,-110);
		renfield.addPoints(370,70,-70);
		renfield.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(renfield);
		
		Surface3DFlat renfield2 = new Surface3DFlat();
		renfield2.addPoints(350,80,-110);
		renfield2.addPoints(350,80,-130);
		renfield2.addPoints(370,80,-130);
		renfield2.addPoints(370,80,-110);
		renfield2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(renfield2);
		
		Surface3DFlat renfield3 = new Surface3DFlat();
		renfield3.addPoints(350,80,-130);
		renfield3.addPoints(350,115,-170);
		renfield3.addPoints(370,115,-170);
		renfield3.addPoints(370,80,-130);
		renfield3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(renfield3);
		
		Surface3DFlat renfield4 = new Surface3DFlat();
		renfield4.addPoints(350,115,-170);
		renfield4.addPoints(350,115,-190);
		renfield4.addPoints(370,115,-190);
		renfield4.addPoints(370,115,-170);
		renfield4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(renfield4);
		
		Surface3DFlat renfield5 = new Surface3DFlat();
		renfield5.addPoints(350,115,-190);
		renfield5.addPoints(350,140,-230);
		renfield5.addPoints(370,140,-230);
		renfield5.addPoints(370,115,-190);
		renfield5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(renfield5);
		
		Surface3DFlat renfield6 = new Surface3DFlat();
		renfield6.addPoints(350,140,-230);
		renfield6.addPoints(350,140,-250);
		renfield6.addPoints(370,140,-250);
		renfield6.addPoints(370,140,-230);
		renfield6.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(renfield6);
		
		Surface3DFlat renfield7 = new Surface3DFlat();
		renfield7.addPoints(350,140,-250);
		renfield7.addPoints(350,145,-290);
		renfield7.addPoints(370,145,-290);
		renfield7.addPoints(370,140,-250);
		renfield7.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(renfield7);
		
		Surface3DFlat renfield8 = new Surface3DFlat();
		renfield8.addPoints(350,145,-290);
		renfield8.addPoints(350,145,-310);
		renfield8.addPoints(370,145,-310);
		renfield8.addPoints(370,145,-290);
		renfield8.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(renfield8);
		
		//*
		Surface3DFlat wNile = new Surface3DFlat();
		wNile.addPoints(410,70,-70);
		wNile.addPoints(410,90,-110);
		wNile.addPoints(430,90,-110);
		wNile.addPoints(430,70,-70);
		wNile.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wNile);
		
		Surface3DFlat wNile2 = new Surface3DFlat();
		wNile2.addPoints(410,90,-130);
		wNile2.addPoints(410,125,-170);
		wNile2.addPoints(430,125,-170);
		wNile2.addPoints(430,90,-130);
		wNile2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wNile2);
		
		Surface3DFlat wNile3 = new Surface3DFlat();
		wNile3.addPoints(410,125,-170);
		wNile3.addPoints(410,125,-190);
		wNile3.addPoints(430,125,-190);
		wNile3.addPoints(430,125,-170);
		wNile3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wNile3);
		
		Surface3DFlat wNile4 = new Surface3DFlat();
		wNile4.addPoints(410,125,-190);
		wNile4.addPoints(410,150,-230);
		wNile4.addPoints(430,150,-230);
		wNile4.addPoints(430,125,-190);
		wNile4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wNile4);
		
		Surface3DFlat wNile5 = new Surface3DFlat();
		wNile5.addPoints(410,150,-250);
		wNile5.addPoints(410,150,-290);
		wNile5.addPoints(430,150,-290);
		wNile5.addPoints(430,150,-250);
		wNile5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wNile5);
		
		//**
		Surface3DFlat wGrge = new Surface3DFlat();
		wGrge.addPoints(410,150,-230);
		wGrge.addPoints(410,150,-250);
		wGrge.addPoints(620,150,-250);
		wGrge.addPoints(620,150,-230);
		wGrge.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wGrge);
		
		Surface3DFlat wGrge2 = new Surface3DFlat();
		wGrge2.addPoints(70,30,-230);
		wGrge2.addPoints(70,30,-250);
		wGrge2.addPoints(110,30,-250);
		wGrge2.addPoints(110,30,-230);
		wGrge2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wGrge2);
		
		Surface3DFlat wGrge3 = new Surface3DFlat();
		wGrge3.addPoints(130,30,-230);
		wGrge3.addPoints(130,30,-250);
		wGrge3.addPoints(170,50,-250);
		wGrge3.addPoints(170,50,-230);
		wGrge3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wGrge3);
		
		Surface3DFlat wGrge4 = new Surface3DFlat();
		wGrge4.addPoints(190,50,-230);
		wGrge4.addPoints(190,50,-250);
		wGrge4.addPoints(230,85,-250);
		wGrge4.addPoints(230,85,-230);
		wGrge4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wGrge4);
		
		Surface3DFlat wGrge5 = new Surface3DFlat();
		wGrge5.addPoints(250,85,-230);
		wGrge5.addPoints(250,85,-250);
		wGrge5.addPoints(290,105,-250);
		wGrge5.addPoints(290,105,-230);
		wGrge5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wGrge5);
		
		Surface3DFlat wGrge6 = new Surface3DFlat();
		wGrge6.addPoints(310,105,-230);
		wGrge6.addPoints(310,105,-250);
		wGrge6.addPoints(350,140,-250);
		wGrge6.addPoints(350,140,-230);
		wGrge6.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wGrge6);
		
		Surface3DFlat wGrge7 = new Surface3DFlat();
		wGrge7.addPoints(370,140,-230);
		wGrge7.addPoints(370,140,-250);
		wGrge7.addPoints(410,150,-250);
		wGrge7.addPoints(410,150,-230);
		wGrge7.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wGrge7);
		
		//***
		//Buchannan street
		Surface3DFlat buch = new Surface3DFlat();
		buch.addPoints(470,70,-70);
		buch.addPoints(470,90,-110);
		buch.addPoints(490,90,-110);
		buch.addPoints(490,70,-70);
		buch.setColor(1f, 0.7f, 0.7f);
		buch.setActualColour(Color.PINK);
		shape.addGItems(buch);
		
		Surface3DFlat buch2 = new Surface3DFlat();
		buch2.addPoints(470,90,-130);
		buch2.addPoints(470,150,-230);
		buch2.addPoints(490,150,-230);
		buch2.addPoints(490,90,-130);
		buch2.setColor(1f, 0.7f, 0.7f);
		buch2.setActualColour(Color.PINK);
		shape.addGItems(buch2);
		
		Surface3DFlat buch3 = new Surface3DFlat();
		buch3.addPoints(470,150,-230);
		buch3.addPoints(470,150,-290);
		buch3.addPoints(490,150,-290);
		buch3.addPoints(490,150,-230);
		buch3.setColor(1f, 0.7f, 0.7f);
		buch3.setActualColour(Color.PINK);
		shape.addGItems(buch3);
		
		//***
		Surface3DFlat bath = new Surface3DFlat();
		bath.addPoints(50,40,-110);
		bath.addPoints(50,40,-130);
		bath.addPoints(130,40,-130);
		bath.addPoints(130,40,-110);
		bath.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(bath);
		
		Surface3DFlat bath2 = new Surface3DFlat();
		bath2.addPoints(130,40,-110);
		bath2.addPoints(130,40,-130);
		bath2.addPoints(170,45,-130);
		bath2.addPoints(170,45,-110);
		bath2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(bath2);
		
		Surface3DFlat bath3 = new Surface3DFlat();
		bath3.addPoints(170,45,-110);
		bath3.addPoints(170,45,-130);
		bath3.addPoints(310,65,-130);
		bath3.addPoints(310,65,-110);
		bath3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(bath3);
		
		Surface3DFlat bath4 = new Surface3DFlat();
		bath4.addPoints(310,65,-110);
		bath4.addPoints(310,65,-130);
		bath4.addPoints(350,80,-130);
		bath4.addPoints(350,80,-110);
		bath4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(bath4);
		
		Surface3DFlat bath5 = new Surface3DFlat();
		bath5.addPoints(370,80,-110);
		bath5.addPoints(370,80,-130);
		bath5.addPoints(410,90,-130);
		bath5.addPoints(410,90,-110);
		bath5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(bath5);
		
		Surface3DFlat bath6 = new Surface3DFlat();
		bath6.addPoints(410,90,-110);
		bath6.addPoints(410,90,-130);
		bath6.addPoints(620, 90, -130);
		bath6.addPoints(620, 90, -110);
		bath6.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(bath6);
		
		//**
		Surface3DFlat hannover = new Surface3DFlat();
		hannover.addPoints(540,90,-130);
		hannover.addPoints(540,150,-230);
		hannover.addPoints(560,150,-230);
		hannover.addPoints(560,90,-130);
		hannover.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(hannover);
		
		Surface3DFlat hannover2 = new Surface3DFlat();
		hannover2.addPoints(540,50,-10);
		hannover2.addPoints(540,90,-110);
		hannover2.addPoints(560,90,-110);
		hannover2.addPoints(560,50,-10);
		hannover2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(hannover2);
		
		//**
		Surface3DFlat fred = new Surface3DFlat();
		fred.addPoints(600,90,-130);
		fred.addPoints(600,150,-230);
		fred.addPoints(620,150,-230);
		fred.addPoints(620,90,-130);
		fred.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(fred);
		
		Surface3DFlat fred2 = new Surface3DFlat();
		fred2.addPoints(600,150,-230);
		fred2.addPoints(600,150,-290);
		fred2.addPoints(620,150,-290);
		fred2.addPoints(620,150,-230);
		fred2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(fred2);
		
		//*
		Surface3DFlat wReg = new Surface3DFlat();
		wReg.addPoints(50,30,-170);
		wReg.addPoints(50,30,-190);
		wReg.addPoints(130,30,-190);
		wReg.addPoints(130,30,-170);
		wReg.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wReg);
		
		Surface3DFlat wReg2 = new Surface3DFlat();
		wReg2.addPoints(130,30,-170);
		wReg2.addPoints(130,30,-190);
		wReg2.addPoints(170,45,-190);
		wReg2.addPoints(170,45,-170);
		wReg2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wReg2);
		
		Surface3DFlat wReg3 = new Surface3DFlat();
		wReg3.addPoints(190,45,-170);
		wReg3.addPoints(190,45,-190);
		wReg3.addPoints(230,70,-190);
		wReg3.addPoints(230,70,-170);
		wReg3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wReg3);
		
		Surface3DFlat wReg4 = new Surface3DFlat();
		wReg4.addPoints(250,70,-170);
		wReg4.addPoints(250,70,-190);
		wReg4.addPoints(290,85,-190);
		wReg4.addPoints(290,85,-170);
		wReg4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wReg4);
		
		Surface3DFlat wReg5 = new Surface3DFlat();
		wReg5.addPoints(310,85,-170);
		wReg5.addPoints(310,85,-190);
		wReg5.addPoints(350,115,-190);
		wReg5.addPoints(350,115,-170);
		wReg5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wReg5);
		
		Surface3DFlat wReg6 = new Surface3DFlat();
		wReg6.addPoints(370,115,-170);
		wReg6.addPoints(370,115,-190);
		wReg6.addPoints(410,125,-190);
		wReg6.addPoints(410,125,-170);
		wReg6.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(wReg6);
		
		Surface3DFlat stVincent = new Surface3DFlat();
		stVincent.addPoints(70,40,-290);
		stVincent.addPoints(70,40,-310);
		stVincent.addPoints(110,40,-310);
		stVincent.addPoints(110,40,-290);
		stVincent.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(stVincent);
		
		Surface3DFlat stVincent2 = new Surface3DFlat();
		stVincent2.addPoints(130,40,-290);
		stVincent2.addPoints(130,40,-310);
		stVincent2.addPoints(170,75,-310);
		stVincent2.addPoints(170,75,-290);
		stVincent2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(stVincent2);
		
		Surface3DFlat stVincent3 = new Surface3DFlat();
		stVincent3.addPoints(190,75,-290);
		stVincent3.addPoints(190,75,-310);
		stVincent3.addPoints(230,100,-310);
		stVincent3.addPoints(230,100,-290);
		stVincent3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(stVincent3);
		
		Surface3DFlat stVincent4 = new Surface3DFlat();
		stVincent4.addPoints(250,100,-290);
		stVincent4.addPoints(250,100,-310);
		stVincent4.addPoints(290,135,-310);
		stVincent4.addPoints(290,135,-290);
		stVincent4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(stVincent4);
		
		Surface3DFlat stVincent5 = new Surface3DFlat();
		stVincent5.addPoints(310,135,-290);
		stVincent5.addPoints(310,135,-310);
		stVincent5.addPoints(350,145,-310);
		stVincent5.addPoints(350,145,-290);
		stVincent5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(stVincent5);
		
		Surface3DFlat stVincent6 = new Surface3DFlat();
		stVincent6.addPoints(370,145,-290);
		stVincent6.addPoints(370,145,-310);
		stVincent6.addPoints(410,150,-310);
		stVincent6.addPoints(410,150,-290);
		stVincent6.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(stVincent6);
		
		Surface3DFlat stVincent7 = new Surface3DFlat();
		stVincent7.addPoints(410,150,-290);
		stVincent7.addPoints(410,150,-310);
		stVincent7.addPoints(680,150,-310);
		stVincent7.addPoints(680,150,-290);
		stVincent7.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(stVincent7);
		
		//********************************************************************
		Surface3DFlat Douglas = new Surface3DFlat();
		Douglas.addPoints(50,40,-310);
		Douglas.addPoints(50,60,-330);
		Douglas.addPoints(70,60,-330);
		Douglas.addPoints(70,40,-310);
		Douglas.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Douglas);
		
		Surface3DFlat Douglas2 = new Surface3DFlat();
		Douglas2.addPoints(50,60,-330);
		Douglas2.addPoints(50,60,-350);
		Douglas2.addPoints(70,60,-350);
		Douglas2.addPoints(70,60,-330);
		Douglas2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Douglas2);
		
		Surface3DFlat Douglas3 = new Surface3DFlat();
		Douglas3.addPoints(50,60,-350);
		Douglas3.addPoints(50,90,-410);
		Douglas3.addPoints(70,90,-410);
		Douglas3.addPoints(70,60,-350);
		Douglas3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Douglas3);
				
		
		Surface3DFlat Douglas5 = new Surface3DFlat();
		Douglas5.addPoints(50,90,-410);
		Douglas5.addPoints(50,90,-430);
		Douglas5.addPoints(70,90,-430);
		Douglas5.addPoints(70,90,-410);
		Douglas5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Douglas5);
		
		Surface3DFlat Douglas6 = new Surface3DFlat();
		Douglas6.addPoints(50,90,-430);
		Douglas6.addPoints(50,150,-480);
		Douglas6.addPoints(70,150,-480);
		Douglas6.addPoints(70,90,-430);
		Douglas6.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Douglas6);
		
		
		Surface3DFlat Hope = new Surface3DFlat();
		Hope.addPoints(290,135,-310);
		Hope.addPoints(290,140,-330);
		Hope.addPoints(310,140,-330);
		Hope.addPoints(310,135,-310);
		Hope.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Hope);
		
		Surface3DFlat Hope2 = new Surface3DFlat();
		Hope2.addPoints(290,140,-330);
		Hope2.addPoints(290,140,-350);
		Hope2.addPoints(310,140,-350);
		Hope2.addPoints(310,140,-330);
		Hope2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Hope2);
		
		Surface3DFlat Hope3 = new Surface3DFlat();
		Hope3.addPoints(290,140,-350);
		Hope3.addPoints(290,150,-370);
		Hope3.addPoints(310,150,-370);
		Hope3.addPoints(310,140,-350);
		Hope3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Hope3);
		
		Surface3DFlat Hope4 = new Surface3DFlat();
		Hope4.addPoints(290,150,-370);
		Hope4.addPoints(290,150,-390);
		Hope4.addPoints(310,150,-390);
		Hope4.addPoints(310,150,-370);
		Hope4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Hope4);
		
		Surface3DFlat Hope5 = new Surface3DFlat();
		Hope5.addPoints(290,150,-390);
		Hope5.addPoints(290,150,-480);
		Hope5.addPoints(310,150,-480);
		Hope5.addPoints(310,150,-390);
		Hope5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Hope5);
		
		Surface3DFlat Hope6 = new Surface3DFlat();
		Hope6.addPoints(290,150,-500);
		Hope6.addPoints(290,150,-580);
		Hope6.addPoints(310,150,-580);
		Hope6.addPoints(310,150,-500);
		Hope6.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Hope6);
		
		Surface3DFlat Renfield = new Surface3DFlat();
		Renfield.addPoints(350,145,-310);
		Renfield.addPoints(350,150,-370);
		Renfield.addPoints(370,150,-370);
		Renfield.addPoints(370,145,-310);
		Renfield.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Renfield);
		
		Surface3DFlat Renfield2 = new Surface3DFlat();
		Renfield2.addPoints(350,150,-390);
		Renfield2.addPoints(375,150,-480);
		Renfield2.addPoints(395,150,-480);
		Renfield2.addPoints(370,150,-390);
		Renfield2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Renfield2);
		
		Surface3DFlat Renfield3 = new Surface3DFlat();
		Renfield3.addPoints(375,150,-500);
		Renfield3.addPoints(350,150,-580);
		Renfield3.addPoints(370,150,-580);
		Renfield3.addPoints(395,150,-500);
		Renfield3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Renfield3);
		
		Surface3DFlat WNile = new Surface3DFlat();
		WNile.addPoints(410,150,-290);
		WNile.addPoints(410,150,-480);
		WNile.addPoints(430,150,-480);
		WNile.addPoints(430,150,-290);
		WNile.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(WNile);
		
		Surface3DFlat BUCH = new Surface3DFlat();
		BUCH.addPoints(470,150,-290);
		BUCH.addPoints(470,150,-480);
		BUCH.addPoints(490,150,-480);
		BUCH.addPoints(490,150,-290);
		BUCH.setColor(1f, 0.7f, 0.7f);
		BUCH.setActualColour(Color.PINK);
		shape.addGItems(BUCH);
		
		Surface3DFlat Queen = new Surface3DFlat();
		Queen.addPoints(510,150,-250);
		Queen.addPoints(510,150,-480);
		Queen.addPoints(530,150,-480);
		Queen.addPoints(530,150,-250);
		Queen.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Queen);
		
		Surface3DFlat Fred = new Surface3DFlat();
		Fred.addPoints(600,150,-310);
		Fred.addPoints(600,150,-340);
		Fred.addPoints(620,150,-340);
		Fred.addPoints(620,150,-310);
		Fred.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Fred);
		
		Surface3DFlat Ingram = new Surface3DFlat();
		Ingram.addPoints(510,150,-340);
		Ingram.addPoints(510,150,-360);
		Ingram.addPoints(700,150,-360);
		Ingram.addPoints(700,150,-340);
		Ingram.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Ingram);
		
		Surface3DFlat Ingram2 = new Surface3DFlat();
		Ingram2.addPoints(490,150,-340);
		Ingram2.addPoints(490,150,-360);
		Ingram2.addPoints(510,150,-360);
		Ingram2.addPoints(510,150,-340);
		Ingram2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Ingram2);
		
		Surface3DFlat Glassford = new Surface3DFlat();
		Glassford.addPoints(640,150,-360);
		Glassford.addPoints(640,150,-480);
		Glassford.addPoints(660,150,-480);
		Glassford.addPoints(660,150,-360);
		Glassford.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Glassford);
		
		Surface3DFlat Glassford2 = new Surface3DFlat();
		Glassford2.addPoints(640,150,-500);
		Glassford2.addPoints(640,150,-580);
		Glassford2.addPoints(660,150,-580);
		Glassford2.addPoints(660,150,-500);
		Glassford2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Glassford2);
		
		Surface3DFlat argylle = new Surface3DFlat();
		argylle.addPoints(50,150,-480);
		argylle.addPoints(50,150,-500);
		argylle.addPoints(530,150,-500);
		argylle.addPoints(530,150,-480);
		argylle.setColor(0.5f, 0.5f, 0.5f);
		argylle.setActualColour(Color.DARK_GRAY);
		shape.addGItems(argylle);
		
		Surface3DFlat argylle2 = new Surface3DFlat();
		argylle2.addPoints(530,150,-480);
		argylle2.addPoints(530,150,-500);
		argylle2.addPoints(700,150,-500);
		argylle2.addPoints(700,150,-480);
		argylle2.setColor(1f, 0.7f, 0.7f);
		argylle2.setActualColour(Color.PINK);
		shape.addGItems(argylle2);
		
		Surface3DFlat Blythwood = new Surface3DFlat();
		Blythwood.addPoints(110,40,-310);
		Blythwood.addPoints(110,70,-330);
		Blythwood.addPoints(130,70,-330);
		Blythwood.addPoints(130,40,-310);
		Blythwood.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Blythwood);
		
		Surface3DFlat Blythwood2 = new Surface3DFlat();
		Blythwood2.addPoints(110,70,-330);
		Blythwood2.addPoints(110,70,-350);
		Blythwood2.addPoints(130,70,-350);
		Blythwood2.addPoints(130,70,-330);
		Blythwood2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Blythwood2);
		
		Surface3DFlat Blythwood3 = new Surface3DFlat();
		Blythwood3.addPoints(110,70,-350);
		Blythwood3.addPoints(110,100,-410);
		Blythwood3.addPoints(130,100,-410);
		Blythwood3.addPoints(130,70,-350);
		Blythwood3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Blythwood3);
		
		Surface3DFlat Blythwood4 = new Surface3DFlat();
		Blythwood4.addPoints(110,100,-410);
		Blythwood4.addPoints(110,100,-430);
		Blythwood4.addPoints(130,100,-430);
		Blythwood4.addPoints(130,100,-410);
		Blythwood4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Blythwood4);
		
		Surface3DFlat Blythwood5 = new Surface3DFlat();
		Blythwood5.addPoints(110,100,-430);
		Blythwood5.addPoints(110,150,-480);
		Blythwood5.addPoints(130,150,-480);
		Blythwood5.addPoints(130,100,-430);
		Blythwood5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(Blythwood5);
		
//.........
		
		Surface3DFlat WCAMP = new Surface3DFlat();
		WCAMP.addPoints(170,75,-310);
		WCAMP.addPoints(170,115,-330);
		WCAMP.addPoints(190,115,-330);
		WCAMP.addPoints(190,75,-310);
		WCAMP.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(WCAMP);
		
		Surface3DFlat WCAMP2 = new Surface3DFlat();
		WCAMP2.addPoints(170,115,-330);
		WCAMP2.addPoints(170,115,-350);
		WCAMP2.addPoints(190,115,-350);
		WCAMP2.addPoints(190,115,-330);
		WCAMP2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(WCAMP2);
		
		Surface3DFlat WCAMP3 = new Surface3DFlat();
		WCAMP3.addPoints(170,115,-350);
		WCAMP3.addPoints(170,135,-410);
		WCAMP3.addPoints(190,135,-410);
		WCAMP3.addPoints(190,115,-350);
		WCAMP3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(WCAMP3);
		
		Surface3DFlat WCAMP4 = new Surface3DFlat();
		WCAMP4.addPoints(170,135,-410);
		WCAMP4.addPoints(170,135,-430);
		WCAMP4.addPoints(190,135,-430);
		WCAMP4.addPoints(190,135,-410);
		WCAMP4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(WCAMP4);
		
		Surface3DFlat WCAMP5 = new Surface3DFlat();
		WCAMP5.addPoints(170,135,-430);
		WCAMP5.addPoints(170,150,-480);
		WCAMP5.addPoints(190,150,-480);
		WCAMP5.addPoints(190,135,-430);
		WCAMP5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(WCAMP5);
		
		Surface3DFlat WELL = new Surface3DFlat();
		WELL.addPoints(230,100,-310);
		WELL.addPoints(230,125,-330);
		WELL.addPoints(250,125,-330);
		WELL.addPoints(250,100,-310);
		WELL.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(WELL);
		
		Surface3DFlat WELL2 = new Surface3DFlat();
		WELL2.addPoints(230,125,-330);
		WELL2.addPoints(230,125,-350);
		WELL2.addPoints(250,125,-350);
		WELL2.addPoints(250,125,-330);
		WELL2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(WELL2);
		
		Surface3DFlat WELL3 = new Surface3DFlat();
		WELL3.addPoints(230,125,-350);
		WELL3.addPoints(230,140,-410);
		WELL3.addPoints(250,140,-410);
		WELL3.addPoints(250,125,-350);
		WELL3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(WELL3);
		
		Surface3DFlat WELL4 = new Surface3DFlat();
		WELL4.addPoints(230,140,-410);
		WELL4.addPoints(230,140,-430);
		WELL4.addPoints(250,140,-430);
		WELL4.addPoints(250,140,-410);
		WELL4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(WELL4);
		
		Surface3DFlat WELL5 = new Surface3DFlat();
		WELL5.addPoints(230,140,-430);
		WELL5.addPoints(230,150,-480);
		WELL5.addPoints(250,150,-480);
		WELL5.addPoints(250,140,-430);
		WELL5.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(WELL5);
		
		//**
		Surface3DFlat bothwell = new Surface3DFlat();
		bothwell.addPoints(70,60,-330);
		bothwell.addPoints(70,60,-350);
		bothwell.addPoints(110,70,-350);
		bothwell.addPoints(110,70,-330);
		bothwell.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(bothwell);
		
		Surface3DFlat bothwell2 = new Surface3DFlat();
		bothwell2.addPoints(130,70,-330);
		bothwell2.addPoints(130,70,-350);
		bothwell2.addPoints(170,115,-350);
		bothwell2.addPoints(170,115,-330);
		bothwell2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(bothwell2);
		
		Surface3DFlat bothwell3 = new Surface3DFlat();
		bothwell3.addPoints(190,115,-330);
		bothwell3.addPoints(190,115,-350);
		bothwell3.addPoints(230,125,-350);
		bothwell3.addPoints(230,125,-330);
		bothwell3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(bothwell3);
		
		Surface3DFlat bothwell4 = new Surface3DFlat();
		bothwell4.addPoints(250,125,-330);
		bothwell4.addPoints(250,125,-350);
		bothwell4.addPoints(290,140,-350);
		bothwell4.addPoints(290,140,-330);
		bothwell4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(bothwell4);
		
		Surface3DFlat waterloo = new Surface3DFlat();
		waterloo.addPoints(70,90,-410);
		waterloo.addPoints(70,90,-430);
		waterloo.addPoints(110,100,-430);
		waterloo.addPoints(110,100,-410);
		waterloo.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(waterloo);
		
		Surface3DFlat waterloo2 = new Surface3DFlat();
		waterloo2.addPoints(130,100,-410);
		waterloo2.addPoints(130,100,-430);
		waterloo2.addPoints(170,135,-430);
		waterloo2.addPoints(170,135,-410);
		waterloo2.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(waterloo2);
		
		Surface3DFlat waterloo3 = new Surface3DFlat();
		waterloo3.addPoints(190,135,-410);
		waterloo3.addPoints(190,135,-430);
		waterloo3.addPoints(230,140,-430);
		waterloo3.addPoints(230,140,-410);
		waterloo3.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(waterloo3);
		
		Surface3DFlat waterloo4 = new Surface3DFlat();
		waterloo4.addPoints(250,140,-410);
		waterloo4.addPoints(250,140,-430);
		waterloo4.addPoints(290,150,-430);
		waterloo4.addPoints(290,150,-410);
		waterloo4.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(waterloo4);
		
		Surface3DFlat GordonSt = new Surface3DFlat();
		GordonSt.addPoints(310,150,-370);
		GordonSt.addPoints(310,150,-390);
		GordonSt.addPoints(470,150,-390);
		GordonSt.addPoints(470,150,-370);
		GordonSt.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(GordonSt);
		
		Surface3DFlat nullStreet = new Surface3DFlat();
		nullStreet.addPoints(560,150,-360);
		nullStreet.addPoints(560,150,-480);
		nullStreet.addPoints(580,150,-480);
		nullStreet.addPoints(580,150,-360);
		nullStreet.setColor(0.5f, 0.5f, 0.5f);
		shape.addGItems(nullStreet);
		
		
	}
	
	/**
	 * 
	 * @return
	 */
	public Shape3D getRoads(){
		return shape;
	}
	
	

}
