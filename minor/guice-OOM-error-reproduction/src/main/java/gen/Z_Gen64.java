
  package gen;
  public class Z_Gen64 {
  		@com.google.inject.Inject
  		public Z_Gen64(Z_Gen65 z_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  