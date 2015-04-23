
  package gen;
  public class Z_Gen122 {
  		@com.google.inject.Inject
  		public Z_Gen122(Z_Gen123 z_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  