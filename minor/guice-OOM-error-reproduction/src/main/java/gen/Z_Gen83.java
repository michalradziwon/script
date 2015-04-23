
  package gen;
  public class Z_Gen83 {
  		@com.google.inject.Inject
  		public Z_Gen83(Z_Gen84 z_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  