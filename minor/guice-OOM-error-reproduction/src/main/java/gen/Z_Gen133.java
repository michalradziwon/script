
  package gen;
  public class Z_Gen133 {
  		@com.google.inject.Inject
  		public Z_Gen133(Z_Gen134 z_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  