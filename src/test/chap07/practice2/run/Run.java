package test.chap07.practice2.run;

import test.chap07.practice2.model.vo.GalaxyNote9;
import test.chap07.practice2.model.vo.SmartPhone;
import test.chap07.practice2.model.vo.V40;

public class Run {

	public static void main(String[] args) {
		
		SmartPhone[] smartPhones = new SmartPhone[2];
		
		smartPhones[0] = new GalaxyNote9();
		smartPhones[1] = new V40();
		
		for(SmartPhone s : smartPhones) {
		
			s.printMaker();
			s.makeaCall();
			s.tackaCall();
			s.touch();
			s.charge();
			s.picture();
				
		}

	}

}
