
  package gen;
  public class Z_Gen46 {
  		@com.google.inject.Inject
  		public Z_Gen46(Z_Gen47 z_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  