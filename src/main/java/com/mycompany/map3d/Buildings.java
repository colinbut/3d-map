/*
 * |-------------------------------------------------
 * | Copyright © 2009 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.map3d;

import java.awt.Color;
import java.util.*;

/**
 * @author Colin
 *
 */
public class Buildings extends MapData {
	
	private ArrayList<Shape3D> shapes;
	
	/**
	 * Constructor..
	 */
	public Buildings(){
		shapes = new ArrayList<Shape3D>();
		produceBuildings();
	}
	
	public void produceBuildings(){
		//A
		Point3D P = new Point3D(70,50,-70);
		Point3D Q = new Point3D(70,40,-110);
		Point3D R = new Point3D(110,40,-110);
		Point3D S = new Point3D(110,50,-70);
		Point3D A = new Point3D(70,20,-70);
		Point3D B = new Point3D(70,20,-110);
		Point3D C = new Point3D(110,20,-110);
		Point3D D = new Point3D(110,20,-70);
		shapes.add(makeBuildingShapes(P,Q,R,S,A,B,C,D,0.5f,0.5f,0f,Color.YELLOW));
		//A1
		Point3D P1 = new Point3D(130,50,-70);
		Point3D Q1 = new Point3D(130,40,-110);
		Point3D R1 = new Point3D(170,45,-110);
		Point3D S1 = new Point3D(170,55,-70);
		Point3D A1 = new Point3D(130,20,-70);
		Point3D B1 = new Point3D(130,20,-110);
		Point3D C1 = new Point3D(170,20,-110);
		Point3D D1 = new Point3D(170,20,-70);
		shapes.add(makeBuildingShapes(P1,Q1,R1,S1,A1,B1,C1,D1,0.5f,0.5f,0f,Color.YELLOW));
		//A2
		Point3D P2 = new Point3D(190,55,-70);
		Point3D Q2 = new Point3D(190,45,-110);
		Point3D R2 = new Point3D(230,55,-110);
		Point3D S2 = new Point3D(230,60,-70);
		Point3D A2 = new Point3D(190,20,-70);
		Point3D B2 = new Point3D(190,20,-110);
		Point3D C2 = new Point3D(230,20,-110);
		Point3D D2 = new Point3D(230,20,-70);
		shapes.add(makeBuildingShapes(P2,Q2,R2,S2,A2,B2,C2,D2,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P3 = new Point3D(250,60,-70);
		Point3D Q3 = new Point3D(250,55,-110);
		Point3D R3 = new Point3D(290,65,-110);
		Point3D S3 = new Point3D(290,65,-70);
		Point3D A3 = new Point3D(250,30,-70);
		Point3D B3 = new Point3D(250,30,-110);
		Point3D C3 = new Point3D(290,30,-110);
		Point3D D3 = new Point3D(290,30,-70);
		shapes.add(makeBuildingShapes(P3,Q3,R3,S3,A3,B3,C3,D3,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P4 = new Point3D(310,65,-70);
		Point3D Q4 = new Point3D(310,65,-110);
		Point3D R4 = new Point3D(350,80,-110);
		Point3D S4 = new Point3D(350,70,-70);
		Point3D A4 = new Point3D(310,40,-70);
		Point3D B4 = new Point3D(310,40,-110);
		Point3D C4 = new Point3D(350,40,-110);
		Point3D D4 = new Point3D(350,40,-70);
		shapes.add(makeBuildingShapes(P4,Q4,R4,S4,A4,B4,C4,D4,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P5 = new Point3D(370,70,-70);
		Point3D Q5 = new Point3D(370,80,-110);
		Point3D R5 = new Point3D(410,90,-110);
		Point3D S5 = new Point3D(410,70,-70);
		Point3D A5 = new Point3D(370,50,-70);
		Point3D B5 = new Point3D(370,50,-110);
		Point3D C5 = new Point3D(410,50,-110);
		Point3D D5 = new Point3D(410,50,-70);
		shapes.add(makeBuildingShapes(P5,Q5,R5,S5,A5,B5,C5,D5,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P6 = new Point3D(430,70,-70);
		Point3D Q6 = new Point3D(430,90,-110);
		Point3D R6 = new Point3D(470,90,-110);
		Point3D S6 = new Point3D(470,70,-70);
		Point3D A6 = new Point3D(430,60,-70);
		Point3D B6 = new Point3D(430,60,-110);
		Point3D C6 = new Point3D(470,60,-110);
		Point3D D6 = new Point3D(470,60,-70);
		shapes.add(makeBuildingShapes(P6,Q6,R6,S6,A6,B6,C6,D6,0.5f,0.5f,0f,Color.YELLOW));
		
		//2nd row
		
		Point3D P7 = new Point3D(70,40,-130);
		Point3D Q7 = new Point3D(70,30,-170);
		Point3D R7 = new Point3D(110,30,-170);
		Point3D S7 = new Point3D(110,40,-130);
		Point3D A7 = new Point3D(70,20,-130);
		Point3D B7 = new Point3D(70,20,-170);
		Point3D C7 = new Point3D(110,20,-170);
		Point3D D7 = new Point3D(110,20,-130);
		shapes.add(makeBuildingShapes(P7,Q7,R7,S7,A7,B7,C7,D7,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P8 = new Point3D(130,40,-130);
		Point3D Q8 = new Point3D(130,30,-170);
		Point3D R8 = new Point3D(170,45,-170);
		Point3D S8 = new Point3D(170,45,-130);
		Point3D A8 = new Point3D(130,20,-130);
		Point3D B8 = new Point3D(130,20,-170);
		Point3D C8 = new Point3D(170,20,-170);
		Point3D D8 = new Point3D(170,20,-130);
		shapes.add(makeBuildingShapes(P8,Q8,R8,S8,A8,B8,C8,D8,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P9 = new Point3D(190,45,-130);
		Point3D Q9 = new Point3D(190,45,-170);
		Point3D R9 = new Point3D(230,70,-170);
		Point3D S9 = new Point3D(230,55,-130);
		Point3D A9 = new Point3D(190,20,-130);
		Point3D B9 = new Point3D(190,20,-170);
		Point3D C9 = new Point3D(230,20,-170);
		Point3D D9 = new Point3D(230,20,-130);
		shapes.add(makeBuildingShapes(P9,Q9,R9,S9,A9,B9,C9,D9,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P10 = new Point3D(250,55,-130);
		Point3D Q10 = new Point3D(250,70,-170);
		Point3D R10 = new Point3D(290,85,-170);
		Point3D S10 = new Point3D(290,65,-130);
		Point3D A10 = new Point3D(250,40,-130);
		Point3D B10 = new Point3D(250,40,-170);
		Point3D C10 = new Point3D(290,40,-170);
		Point3D D10 = new Point3D(290,40,-130);
		shapes.add(makeBuildingShapes(P10,Q10,R10,S10,A10,B10,C10,D10,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P11 = new Point3D(310,65,-130);
		Point3D Q11 = new Point3D(310,85,-170);
		Point3D R11 = new Point3D(350,115,-170);
		Point3D S11 = new Point3D(350,80,-130);
		Point3D A11 = new Point3D(310,50,-130);
		Point3D B11 = new Point3D(310,50,-170);
		Point3D C11 = new Point3D(350,50,-170);
		Point3D D11 = new Point3D(350,50,-130);
		shapes.add(makeBuildingShapes(P11,Q11,R11,S11,A11,B11,C11,D11,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P12 = new Point3D(370,80,-130);
		Point3D Q12 = new Point3D(370,115,-170);
		Point3D R12 = new Point3D(410,125,-170);
		Point3D S12 = new Point3D(410,90,-130);
		Point3D A12 = new Point3D(370,55,-130);
		Point3D B12 = new Point3D(370,55,-170);
		Point3D C12 = new Point3D(410,55,-170);
		Point3D D12 = new Point3D(410,55,-130);
		shapes.add(makeBuildingShapes(P12,Q12,R12,S12,A12,B12,C12,D12,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P13 = new Point3D(130,30,-190);
		Point3D Q13 = new Point3D(130,30,-230);
		Point3D R13 = new Point3D(170,50,-230);
		Point3D S13 = new Point3D(170,45,-190);
		Point3D A13 = new Point3D(130,15,-190);
		Point3D B13 = new Point3D(130,15,-230);
		Point3D C13 = new Point3D(170,15,-230);
		Point3D D13 = new Point3D(170,15,-190);
		shapes.add(makeBuildingShapes(P13,Q13,R13,S13,A13,B13,C13,D13,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P14 = new Point3D(190,45,-190);
		Point3D Q14 = new Point3D(190,50,-230);
		Point3D R14 = new Point3D(230,85,-230);
		Point3D S14 = new Point3D(230,70,-190);
		Point3D A14 = new Point3D(190,35,-190);
		Point3D B14 = new Point3D(190,35,-230);
		Point3D C14 = new Point3D(230,35,-230);
		Point3D D14 = new Point3D(230,35,-190);
		shapes.add(makeBuildingShapes(P14,Q14,R14,S14,A14,B14,C14,D14,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P15 = new Point3D(250,70,-190);
		Point3D Q15 = new Point3D(250,85,-230);
		Point3D R15 = new Point3D(290,105,-230);
		Point3D S15 = new Point3D(290,90,-190);
		Point3D A15 = new Point3D(250,55,-190);
		Point3D B15 = new Point3D(250,55,-230);
		Point3D C15 = new Point3D(290,55,-230);
		Point3D D15 = new Point3D(290,55,-190);
		shapes.add(makeBuildingShapes(P15,Q15,R15,S15,A15,B15,C15,D15,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P16 = new Point3D(310,90,-190);
		Point3D Q16 = new Point3D(310,105,-230);
		Point3D R16 = new Point3D(350,140,-230);
		Point3D S16 = new Point3D(350,115,-190);
		Point3D A16 = new Point3D(310,65,-190);
		Point3D B16 = new Point3D(310,65,-230);
		Point3D C16 = new Point3D(350,65,-230);
		Point3D D16 = new Point3D(350,65,-190);
		shapes.add(makeBuildingShapes(P16,Q16,R16,S16,A16,B16,C16,D16,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P17 = new Point3D(370,115,-190);
		Point3D Q17 = new Point3D(370,140,-230);
		Point3D R17 = new Point3D(410,150,-230);
		Point3D S17 = new Point3D(410,125,-190);
		Point3D A17 = new Point3D(370,75,-190);
		Point3D B17 = new Point3D(370,75,-230);
		Point3D C17 = new Point3D(410,75,-230);
		Point3D D17 = new Point3D(410,75,-190);
		shapes.add(makeBuildingShapes(P17,Q17,R17,S17,A17,B17,C17,D17,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P18 = new Point3D(70,40,-250);
		Point3D Q18 = new Point3D(70,40,-290);
		Point3D R18 = new Point3D(110,40,-290);
		Point3D S18 = new Point3D(110,40,-250);
		Point3D A18 = new Point3D(70,20,-250);
		Point3D B18 = new Point3D(70,20,-290);
		Point3D C18 = new Point3D(110,20,-290);
		Point3D D18 = new Point3D(110,20,-250);
		shapes.add(makeBuildingShapes(P18,Q18,R18,S18,A18,B18,C18,D18,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P19 = new Point3D(130,40,-250);
		Point3D Q19 = new Point3D(130,40,-290);
		Point3D R19 = new Point3D(170,75,-290);
		Point3D S19 = new Point3D(170,55,-250);
		Point3D A19 = new Point3D(130,30,-250);
		Point3D B19 = new Point3D(130,30,-290);
		Point3D C19 = new Point3D(170,30,-290);
		Point3D D19 = new Point3D(170,30,-250);
		shapes.add(makeBuildingShapes(P19,Q19,R19,S19,A19,B19,C19,D19,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P20 = new Point3D(190,75,-250);
		Point3D Q20 = new Point3D(190,75,-290);
		Point3D R20 = new Point3D(230,100,-290);
		Point3D S20 = new Point3D(230,85,-250);
		Point3D A20 = new Point3D(190,50,-250);
		Point3D B20 = new Point3D(190,50,-290);
		Point3D C20 = new Point3D(230,50,-290);
		Point3D D20 = new Point3D(230,50,-250);
		shapes.add(makeBuildingShapes(P20,Q20,R20,S20,A20,B20,C20,D20,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P21 = new Point3D(250,100,-250);
		Point3D Q21 = new Point3D(250,100,-290);
		Point3D R21 = new Point3D(290,135,-290);
		Point3D S21 = new Point3D(290,105,-250);
		Point3D A21 = new Point3D(250,70,-250);
		Point3D B21 = new Point3D(250,70,-290);
		Point3D C21 = new Point3D(290,70,-290);
		Point3D D21 = new Point3D(290,70,-250);
		shapes.add(makeBuildingShapes(P21,Q21,R21,S21,A21,B21,C21,D21,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P22 = new Point3D(310,105,-250);
		Point3D Q22 = new Point3D(310,135,-290);
		Point3D R22 = new Point3D(350,145,-290);
		Point3D S22 = new Point3D(350,140,-250);
		Point3D A22 = new Point3D(310,80,-250);
		Point3D B22 = new Point3D(310,80,-290);
		Point3D C22 = new Point3D(350,80,-290);
		Point3D D22 = new Point3D(350,80,-250);
		shapes.add(makeBuildingShapes(P22,Q22,R22,S22,A22,B22,C22,D22,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P23 = new Point3D(370,140,-250);
		Point3D Q23 = new Point3D(370,145,-290);
		Point3D R23 = new Point3D(410,150,-290);
		Point3D S23 = new Point3D(410,150,-250);
		Point3D A23 = new Point3D(370,90,-250);
		Point3D B23 = new Point3D(370,90,-290);
		Point3D C23 = new Point3D(410,90,-290);
		Point3D D23 = new Point3D(410,90,-250);
		shapes.add(makeBuildingShapes(P23,Q23,R23,S23,A23,B23,C23,D23,0.5f,0.5f,0f,Color.YELLOW));
		
		//***************************************************************
		Point3D P24 = new Point3D(70,40,-310);
		Point3D Q24 = new Point3D(70,60,-330);
		Point3D R24 = new Point3D(110,70,-330);
		Point3D S24 = new Point3D(110,40,-310);
		Point3D A24 = new Point3D(70,30,-310);
		Point3D B24 = new Point3D(70,30,-330);
		Point3D C24 = new Point3D(110,30,-330);
		Point3D D24 = new Point3D(110,30,-310);
		shapes.add(makeBuildingShapes(P24,Q24,R24,S24,A24,B24,C24,D24,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P25 = new Point3D(130,40,-310);
		Point3D Q25 = new Point3D(130,70,-330);
		Point3D R25 = new Point3D(170,115,-330);
		Point3D S25 = new Point3D(170,75,-310);
		Point3D A25 = new Point3D(130,40,-310);
		Point3D B25 = new Point3D(130,40,-330);
		Point3D C25 = new Point3D(170,40,-330);
		Point3D D25 = new Point3D(170,40,-310);
		shapes.add(makeBuildingShapes(P25,Q25,R25,S25,A25,B25,C25,D25,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P26 = new Point3D(190,75,-310);
		Point3D Q26 = new Point3D(190,115,-330);
		Point3D R26 = new Point3D(230,125,-330);
		Point3D S26 = new Point3D(230,100,-310);
		Point3D A26 = new Point3D(190,60,-310);
		Point3D B26 = new Point3D(190,60,-330);
		Point3D C26 = new Point3D(230,60,-330);
		Point3D D26 = new Point3D(230,60,-310);
		shapes.add(makeBuildingShapes(P26,Q26,R26,S26,A26,B26,C26,D26,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P27 = new Point3D(250,100,-310);
		Point3D Q27 = new Point3D(250,125,-330);
		Point3D R27 = new Point3D(290,140,-330);
		Point3D S27 = new Point3D(290,135,-310);
		Point3D A27 = new Point3D(250,90,-310);
		Point3D B27 = new Point3D(250,90,-330);
		Point3D C27 = new Point3D(290,90,-330);
		Point3D D27 = new Point3D(290,90,-310);
		shapes.add(makeBuildingShapes(P27,Q27,R27,S27,A27,B27,C27,D27,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P28 = new Point3D(70,60,-350);
		Point3D Q28 = new Point3D(70,90,-410);
		Point3D R28 = new Point3D(110,100,-410);
		Point3D S28 = new Point3D(110,70,-350);
		Point3D A28 = new Point3D(70,40,-350);
		Point3D B28 = new Point3D(70,40,-410);
		Point3D C28 = new Point3D(110,40,-410);
		Point3D D28 = new Point3D(110,40,-350);
		shapes.add(makeBuildingShapes(P28,Q28,R28,S28,A28,B28,C28,D28,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P29 = new Point3D(130,70,-350);
		Point3D Q29 = new Point3D(130,100,-410);
		Point3D R29 = new Point3D(170,135,-410);
		Point3D S29 = new Point3D(170,115,-350);
		Point3D A29 = new Point3D(130,60,-350);
		Point3D B29 = new Point3D(130,60,-410);
		Point3D C29 = new Point3D(170,60,-410);
		Point3D D29 = new Point3D(170,60,-350);
		shapes.add(makeBuildingShapes(P29,Q29,R29,S29,A29,B29,C29,D29,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P30 = new Point3D(190,115,-350);
		Point3D Q30 = new Point3D(190,135,-410);
		Point3D R30 = new Point3D(230,140,-410);
		Point3D S30 = new Point3D(230,125,-350);
		Point3D A30 = new Point3D(190,80,-350);
		Point3D B30 = new Point3D(190,80,-410);
		Point3D C30 = new Point3D(230,80,-410);
		Point3D D30 = new Point3D(230,80,-350);
		shapes.add(makeBuildingShapes(P30,Q30,R30,S30,A30,B30,C30,D30,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P31 = new Point3D(250,125,-350);
		Point3D Q31 = new Point3D(250,140,-410);
		Point3D R31 = new Point3D(290,150,-410);
		Point3D S31 = new Point3D(290,150,-350);
		Point3D A31 = new Point3D(250,100,-350);
		Point3D B31 = new Point3D(250,100,-410);
		Point3D C31 = new Point3D(290,100,-410);
		Point3D D31 = new Point3D(290,100,-350);
		shapes.add(makeBuildingShapes(P31,Q31,R31,S31,A31,B31,C31,D31,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P32 = new Point3D(70,90,-430);
		Point3D Q32 = new Point3D(70,150,-480);
		Point3D R32 = new Point3D(110,150,-480);
		Point3D S32 = new Point3D(110,100,-430);
		Point3D A32 = new Point3D(70,70,-430);
		Point3D B32 = new Point3D(70,70,-480);
		Point3D C32 = new Point3D(110,70,-480);
		Point3D D32 = new Point3D(110,70,-430);
		shapes.add(makeBuildingShapes(P32,Q32,R32,S32,A32,B32,C32,D32,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P33 = new Point3D(130,100,-430);
		Point3D Q33 = new Point3D(130,150,-480);
		Point3D R33 = new Point3D(170,150,-480);
		Point3D S33 = new Point3D(170,135,-430);
		Point3D A33 = new Point3D(130,90,-430);
		Point3D B33 = new Point3D(130,90,-480);
		Point3D C33 = new Point3D(170,90,-480);
		Point3D D33 = new Point3D(170,90,-430);
		shapes.add(makeBuildingShapes(P33,Q33,R33,S33,A33,B33,C33,D33,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P34 = new Point3D(190,135,-430);
		Point3D Q34 = new Point3D(190,150,-480);
		Point3D R34 = new Point3D(230,150,-480);
		Point3D S34 = new Point3D(230,140,-430);
		Point3D A34 = new Point3D(190,110,-430);
		Point3D B34 = new Point3D(190,110,-480);
		Point3D C34 = new Point3D(230,110,-480);
		Point3D D34 = new Point3D(230,110,-430);
		shapes.add(makeBuildingShapes(P34,Q34,R34,S34,A34,B34,C34,D34,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P35 = new Point3D(250,140,-430);
		Point3D Q35 = new Point3D(250,150,-480);
		Point3D R35 = new Point3D(290,150,-480);
		Point3D S35 = new Point3D(290,150,-430);
		Point3D A35 = new Point3D(250,110,-430);
		Point3D B35 = new Point3D(250,110,-480);
		Point3D C35 = new Point3D(290,110,-480);
		Point3D D35 = new Point3D(290,110,-430);
		shapes.add(makeBuildingShapes(P35,Q35,R35,S35,A35,B35,C35,D35,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P36 = new Point3D(310,140,-310);
		Point3D Q36 = new Point3D(310,150,-370);
		Point3D R36 = new Point3D(350,150,-370);
		Point3D S36 = new Point3D(350,145,-310);
		Point3D A36 = new Point3D(310,110,-310);
		Point3D B36 = new Point3D(310,110,-370);
		Point3D C36 = new Point3D(350,110,-370);
		Point3D D36 = new Point3D(350,110,-310);
		shapes.add(makeBuildingShapes(P36,Q36,R36,S36,A36,B36,C36,D36,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P37 = new Point3D(370,145,-310);
		Point3D Q37 = new Point3D(370,150,-370);
		Point3D R37 = new Point3D(410,150,-370);
		Point3D S37 = new Point3D(410,150,-310);
		Point3D A37 = new Point3D(370,125,-310);
		Point3D B37 = new Point3D(370,125,-370);
		Point3D C37 = new Point3D(410,125,-370);
		Point3D D37 = new Point3D(410,125,-310);
		shapes.add(makeBuildingShapes(P37,Q37,R37,S37,A37,B37,C37,D37,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P38 = new Point3D(430,150,-250);
		Point3D Q38 = new Point3D(430,150,-290);
		Point3D R38 = new Point3D(470,150,-290);
		Point3D S38 = new Point3D(470,150,-250);
		Point3D A38 = new Point3D(430,130,-250);
		Point3D B38 = new Point3D(430,130,-290);
		Point3D C38 = new Point3D(470,130,-290);
		Point3D D38 = new Point3D(470,130,-250);
		shapes.add(makeBuildingShapes(P38,Q38,R38,S38,A38,B38,C38,D38,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P39 = new Point3D(430,150,-310);
		Point3D Q39 = new Point3D(430,150,-370);
		Point3D R39 = new Point3D(470,150,-370);
		Point3D S39 = new Point3D(470,150,-310);
		Point3D A39 = new Point3D(430,130,-310);
		Point3D B39 = new Point3D(430,130,-370);
		Point3D C39 = new Point3D(470,130,-370);
		Point3D D39 = new Point3D(470,130,-310);
		shapes.add(makeBuildingShapes(P39,Q39,R39,S39,A39,B39,C39,D39,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P40 = new Point3D(430,150,-390);
		Point3D Q40 = new Point3D(430,150,-480);
		Point3D R40 = new Point3D(470,150,-480);
		Point3D S40 = new Point3D(470,150,-390);
		Point3D A40 = new Point3D(430,130,-390);
		Point3D B40 = new Point3D(430,130,-480);
		Point3D C40 = new Point3D(470,130,-480);
		Point3D D40 = new Point3D(470,130,-390);
		shapes.add(makeBuildingShapes(P40,Q40,R40,S40,A40,B40,C40,D40,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P41 = new Point3D(490,150,-250);
		Point3D Q41 = new Point3D(490,150,-290);
		Point3D R41 = new Point3D(510,150,-290);
		Point3D S41 = new Point3D(510,150,-250);
		Point3D A41 = new Point3D(490,130,-250);
		Point3D B41 = new Point3D(490,130,-290);
		Point3D C41 = new Point3D(510,130,-290);
		Point3D D41 = new Point3D(510,130,-250);
		shapes.add(makeBuildingShapes(P41,Q41,R41,S41,A41,B41,C41,D41,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P42 = new Point3D(490,150,-310);
		Point3D Q42 = new Point3D(490,150,-340);
		Point3D R42 = new Point3D(510,150,-340);
		Point3D S42 = new Point3D(510,150,-310);
		Point3D A42 = new Point3D(490,130,-310);
		Point3D B42 = new Point3D(490,130,-340);
		Point3D C42 = new Point3D(510,130,-340);
		Point3D D42 = new Point3D(510,130,-310);
		shapes.add(makeBuildingShapes(P42,Q42,R42,S42,A42,B42,C42,D42,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P43 = new Point3D(490,150,-360);
		Point3D Q43 = new Point3D(490,150,-480);
		Point3D R43 = new Point3D(510,150,-480);
		Point3D S43 = new Point3D(510,150,-360);
		Point3D A43 = new Point3D(490,130,-360);
		Point3D B43 = new Point3D(490,130,-480);
		Point3D C43 = new Point3D(510,130,-480);
		Point3D D43 = new Point3D(510,130,-360);
		shapes.add(makeBuildingShapes(P43,Q43,R43,S43,A43,B43,C43,D43,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P44 = new Point3D(370,150,-390);
		Point3D Q44 = new Point3D(395,150,-480);
		Point3D R44 = new Point3D(410,150,-480);
		Point3D S44 = new Point3D(410,150,-390);
		Point3D A44 = new Point3D(370,130,-390);
		Point3D B44 = new Point3D(395,130,-480);
		Point3D C44 = new Point3D(410,130,-480);
		Point3D D44 = new Point3D(410,130,-390);
		shapes.add(makeBuildingShapes(P44,Q44,R44,S44,A44,B44,C44,D44,0.5f,0.5f,0f,Color.YELLOW));
		
		
		Point3D P45 = new Point3D(430,90,-130);
		Point3D Q45 = new Point3D(430,150,-230);
		Point3D R45 = new Point3D(470,150,-230);
		Point3D S45 = new Point3D(470,90,-130);
		Point3D A45 = new Point3D(430,70,-130);
		Point3D B45 = new Point3D(430,70,-230);
		Point3D C45 = new Point3D(470,70,-230);
		Point3D D45 = new Point3D(470,70,-130);
		shapes.add(makeBuildingShapes(P45,Q45,R45,S45,A45,B45,C45,D45,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P46 = new Point3D(530,150,-360);
		Point3D Q46 = new Point3D(530,150,-480);
		Point3D R46 = new Point3D(560,150,-480);
		Point3D S46 = new Point3D(560,150,-360);
		Point3D A46 = new Point3D(530,120,-360);
		Point3D B46 = new Point3D(530,120,-480);
		Point3D C46 = new Point3D(560,120,-480);
		Point3D D46 = new Point3D(560,120,-360);
		shapes.add(makeBuildingShapes(P46,Q46,R46,S46,A46,B46,C46,D46,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P47 = new Point3D(580,150,-360);
		Point3D Q47 = new Point3D(580,150,-480);
		Point3D R47 = new Point3D(640,150,-480);
		Point3D S47 = new Point3D(640,150,-360);
		Point3D A47 = new Point3D(580,130,-360);
		Point3D B47 = new Point3D(580,130,-480);
		Point3D C47 = new Point3D(640,130,-480);
		Point3D D47 = new Point3D(640,130,-360);
		shapes.add(makeBuildingShapes(P47,Q47,R47,S47,A47,B47,C47,D47,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P48 = new Point3D(530,150,-310);
		Point3D Q48 = new Point3D(530,150,-340);
		Point3D R48 = new Point3D(600,150,-340);
		Point3D S48 = new Point3D(600,150,-310);
		Point3D A48 = new Point3D(530,130,-310);
		Point3D B48 = new Point3D(530,130,-340);
		Point3D C48 = new Point3D(600,130,-340);
		Point3D D48 = new Point3D(600,130,-310);
		shapes.add(makeBuildingShapes(P48,Q48,R48,S48,A48,B48,C48,D48,0.5f,0.5f,0f,Color.YELLOW));
		
		Point3D P49 = new Point3D(620,150,-310);
		Point3D Q49 = new Point3D(620,150,-340);
		Point3D R49 = new Point3D(650,150,-340);
		Point3D S49 = new Point3D(650,150,-310);
		Point3D A49 = new Point3D(620,130,-310);
		Point3D B49 = new Point3D(620,130,-340);
		Point3D C49 = new Point3D(650,130,-340);
		Point3D D49 = new Point3D(650,130,-310);
		shapes.add(makeBuildingShapes(P49,Q49,R49,S49,A49,B49,C49,D49,0.5f,0.5f,0f,Color.YELLOW));
				
		Point3D P50 = new Point3D(620,150,-250);
		Point3D Q50 = new Point3D(620,150,-290);
		Point3D R50 = new Point3D(650,150,-290);
		Point3D S50 = new Point3D(650,150,-250);
		Point3D A50 = new Point3D(620,110,-250);
		Point3D B50 = new Point3D(620,110,-290);
		Point3D C50 = new Point3D(650,110,-290);
		Point3D D50 = new Point3D(650,110,-250);
		shapes.add(makeBuildingShapes(P50,Q50,R50,S50,A50,B50,C50,D50,0.5f,0.5f,0f, Color.YELLOW));
		
		Point3D P51 = new Point3D(560,130,-190);
		Point3D Q51 = new Point3D(560,150,-230);
		Point3D R51 = new Point3D(600,150,-230);
		Point3D S51 = new Point3D(600,130,-190);
		Point3D A51 = new Point3D(560,80,-190);
		Point3D B51 = new Point3D(560,80,-230);
		Point3D C51 = new Point3D(600,80,-230);
		Point3D D51 = new Point3D(600,80,-190);
		shapes.add(makeBuildingShapes(P51,Q51,R51,S51,A51,B51,C51,D51,0.5f,0.5f,0f, Color.YELLOW));
		
		Point3D P52 = new Point3D(560,90,-130);
		Point3D Q52 = new Point3D(560,130,-190);
		Point3D R52 = new Point3D(600,130,-190);
		Point3D S52 = new Point3D(600,90,-130);
		Point3D A52 = new Point3D(560,20,-130);
		Point3D B52 = new Point3D(560,20,-190);
		Point3D C52 = new Point3D(600,20,-190);
		Point3D D52 = new Point3D(600,20,-130);
		shapes.add(makeBuildingShapes(P52,Q52,R52,S52,A52,B52,C52,D52,0f,0f,1f, Color.BLUE));
		//return shapes;
	}
	
	public ArrayList<Shape3D> getBuildings(){
		return shapes;
	}

}
