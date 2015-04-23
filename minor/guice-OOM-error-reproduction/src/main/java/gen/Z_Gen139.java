
  package gen;
  public class Z_Gen139 {
  		@com.google.inject.Inject
  		public Z_Gen139(Z_Gen140 z_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  