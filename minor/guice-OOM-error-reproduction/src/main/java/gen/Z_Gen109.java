
  package gen;
  public class Z_Gen109 {
  		@com.google.inject.Inject
  		public Z_Gen109(Z_Gen110 z_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  