
  package gen;
  public class Z_Gen131 {
  		@com.google.inject.Inject
  		public Z_Gen131(Z_Gen132 z_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  