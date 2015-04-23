
  package gen;
  public class Z_Gen36 {
  		@com.google.inject.Inject
  		public Z_Gen36(Z_Gen37 z_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  