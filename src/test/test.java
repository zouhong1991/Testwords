package test;

import com.shu.service.Function;
import com.shu.service.FunctionService;

public class test {
	
	public  static void main(String[] args){
		Function fu =new FunctionService().getFunctionPort();
		String str=fu.transWords("Let's Get Heck Out Of Here!");
		//���str������Trans��Ŀ�µ�transWords�����������ַ�����!
		System.out.println(str);
	}


}
