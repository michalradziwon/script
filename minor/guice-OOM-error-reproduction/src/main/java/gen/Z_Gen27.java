
  package gen;
  public class Z_Gen27 {
  		@com.google.inject.Inject
  		public Z_Gen27(Z_Gen28 z_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  