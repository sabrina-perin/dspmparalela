
package javanopolis;

public class Apto extends Casa {
    
    private int andar;
    private String tipo = "Apartamento";
    
       public Apto(int andar, int ano, double area, String prop, String endereco) {
           super(ano, area, prop, endereco);
           this.andar = andar;
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
       
    /**
     *
     * @return
     */
        public double iptuApto() {
        double iptu = area * 8.50;
        System.out.println("O valor do IPTU eh: R$" + iptu);
        return iptu;
    }
}


