package pro_ev2;
import java.io.*;
import javax.swing.*;
public class string8 {

	private String str;
	private String str_es = "";
	private String str_num = "";
	
	public string8(String texto){
		str = texto;
	}
	
	public void es_nopor(){
		str_es = str.replaceAll("es", "no por");
		JOptionPane.showMessageDialog(null, str_es);
	}
	
	public void num_ast(){
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		StringReader textoInput = new StringReader(str);
		CharArrayWriter textoOutput = new CharArrayWriter();
		char[] vec = new char[str.length()];
		int car = 0;
		
		try{
			while((car = textoInput.read()) != -1){
				textoOutput.write(car);
			}
			vec = textoOutput.toCharArray();
			
			for(int v = 0; v < vec.length; v++){
				for(int n = 0; n < num.length; n++){
					if(vec[v] == num[n]){
						vec[v] = '*';
					}
				}
			}
			
			for(int v = 0; v < vec.length; v++){
				if(vec[v] == '*'){
					if(vec[v-1] == '*'){
						vec[v-1] = ' ';
					}
				}
			}
			
			for(int v = 0; v < vec.length; v++){
				if(vec[v] != ' '){
					str_num += vec[v];
				}
			}
			
			JOptionPane.showMessageDialog(null, str_num);
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			textoInput.close();
			textoOutput.close();
		}
	}
	
	public static void main(String[] args) {
		string8 cambiar = new string8("esto1234es5678bueno900");
		cambiar.es_nopor();
		cambiar.num_ast();	
	}
}
