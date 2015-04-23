
  package gen;
  public class Z_Gen187 {
  		@com.google.inject.Inject
  		public Z_Gen187(Z_Gen188 z_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  