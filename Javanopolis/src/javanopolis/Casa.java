package javanopolis;

import java.util.Collection;


public class Casa implements Comparable<Casa>{
	
	double area;
	String prop;
	private String endereco;
	private int ano;
        private String tipo = "Casa";

	public Casa(int ano, double area, String prop, String endereco){
		this.ano = ano;
		this.area = area;
		this.prop = prop;
		this.endereco = endereco;
	}


	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}
        
	public String getProp() {
		return this.prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
	}
        
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String area) {
		this.tipo = tipo;
	}


        public double iptuCasa(){
            double iptu = this.area * 7;
            System.out.println("O valor do IPTU eh: R$" + iptu);
            return iptu;
        }

    @Override
    public int compareTo(Casa outraCasa) {
       if (this.area > outraCasa.getArea()){
           return -1;
    } else if(this.area < outraCasa.getArea()){
        return 1;
    } else {
        return 0;
    }
       
           
        

}
    
}
