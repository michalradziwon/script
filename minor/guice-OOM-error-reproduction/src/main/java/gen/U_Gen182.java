
  package gen;
  public class U_Gen182 {
  		@com.google.inject.Inject
  		public U_Gen182(U_Gen183 u_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  