
  package gen;
  public class Z_Gen65 {
  		@com.google.inject.Inject
  		public Z_Gen65(Z_Gen66 z_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  