
  package gen;
  public class Z_Gen182 {
  		@com.google.inject.Inject
  		public Z_Gen182(Z_Gen183 z_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  