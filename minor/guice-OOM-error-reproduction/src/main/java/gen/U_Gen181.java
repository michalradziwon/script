
  package gen;
  public class U_Gen181 {
  		@com.google.inject.Inject
  		public U_Gen181(U_Gen182 u_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  