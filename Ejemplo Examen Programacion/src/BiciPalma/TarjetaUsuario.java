package BiciPalma;

public class TarjetaUsuario {
	
	//Propiedad de la clase 
	
		private String id = "000000000";
		private Boolean estado = true;
		
	//Constructor de la clase 
		public TarjetaUsuario(){
		}
		
		
		public TarjetaUsuario (String id, Boolean true){
				this.id = id;
				this.estado = estado;
		}
		
	//Getters y setters
		public String getId(){
				return this.id;
		}
		public void setId(String id){
				this.id = id;
		}
		public Boolean getEsatdo(){
				return this.estado
		}
		
}
