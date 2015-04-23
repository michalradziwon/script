
  package gen;
  public class Z_Gen106 {
  		@com.google.inject.Inject
  		public Z_Gen106(Z_Gen107 z_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  