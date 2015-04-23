
  package gen;
  public class Z_Gen68 {
  		@com.google.inject.Inject
  		public Z_Gen68(Z_Gen69 z_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  