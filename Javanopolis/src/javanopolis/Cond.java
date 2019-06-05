
package javanopolis;

public class Cond extends Casa {
    private String nomeCond;
    private String tipo = "Casa com Condominio";
    
    public Cond(int ano, double area, String prop, String endereco, String nomeCond){
	super(ano, area, prop,endereco);
        this.nomeCond = nomeCond;
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
    
    public double iptuCond() {
        double iptu = area * 9;
        System.out.println("O valor do IPTU eh: R$" + iptu);
        return iptu;
    }
    
}
