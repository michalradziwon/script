
  package gen;
  public class Z_Gen39 {
  		@com.google.inject.Inject
  		public Z_Gen39(Z_Gen40 z_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  