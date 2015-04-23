
  package gen;
  public class Z_Gen78 {
  		@com.google.inject.Inject
  		public Z_Gen78(Z_Gen79 z_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  