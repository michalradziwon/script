
  package gen;
  public class Z_Gen74 {
  		@com.google.inject.Inject
  		public Z_Gen74(Z_Gen75 z_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  