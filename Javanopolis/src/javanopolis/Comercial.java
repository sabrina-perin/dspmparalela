package javanopolis;

public class Comercial extends Casa {
    
        private String tipo = "Imovel Comercial";
        
        
	public Comercial(int ano, double area, String prop, String endereco){
		super(ano, area, prop,endereco);       
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
        
        
        public double iptuComercial() {
        double iptu = area * 10.70;
        System.out.println("O valor do IPTU eh: R$" + iptu);
        return iptu;
    }
}
