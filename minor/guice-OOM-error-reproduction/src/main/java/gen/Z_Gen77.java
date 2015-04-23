
  package gen;
  public class Z_Gen77 {
  		@com.google.inject.Inject
  		public Z_Gen77(Z_Gen78 z_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  