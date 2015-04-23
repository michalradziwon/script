
  package gen;
  public class Z_Gen132 {
  		@com.google.inject.Inject
  		public Z_Gen132(Z_Gen133 z_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  