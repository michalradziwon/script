
  package gen;
  public class Z_Gen76 {
  		@com.google.inject.Inject
  		public Z_Gen76(Z_Gen77 z_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  