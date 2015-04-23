
  package gen;
  public class U_Gen194 {
  		@com.google.inject.Inject
  		public U_Gen194(U_Gen195 u_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  