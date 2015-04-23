
  package gen;
  public class Z_Gen126 {
  		@com.google.inject.Inject
  		public Z_Gen126(Z_Gen127 z_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  