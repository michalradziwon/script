
  package gen;
  public class Z_Gen190 {
  		@com.google.inject.Inject
  		public Z_Gen190(Z_Gen191 z_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  