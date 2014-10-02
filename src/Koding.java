
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GILSUR
 */
public class Koding {
	protected String PIN;
	protected int Saldo;
        
	public String setPin(String P){
            PIN = P;
            return PIN;
	}
        public int setSaldo(int S){
            Saldo = S;
            return Saldo;
        }
        
        public String getPin(){
            return PIN;
        }
        
        public int getSaldo(){
            return Saldo;
        }
        
        public void Tabung (int T){
            Saldo = Saldo + T;
        }
        
        public void Tarik (int R){
            if (R > Saldo){
                JOptionPane.showMessageDialog(null, "Anda Tidak Bisa Menarik Saldo Anda Hanya" + Saldo);
            } else{
            Saldo = Saldo - R;
            }   
        }        
}
