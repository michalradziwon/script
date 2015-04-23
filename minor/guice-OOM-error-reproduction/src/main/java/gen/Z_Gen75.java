
  package gen;
  public class Z_Gen75 {
  		@com.google.inject.Inject
  		public Z_Gen75(Z_Gen76 z_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  