
  package gen;
  public class Z_Gen140 {
  		@com.google.inject.Inject
  		public Z_Gen140(Z_Gen141 z_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  