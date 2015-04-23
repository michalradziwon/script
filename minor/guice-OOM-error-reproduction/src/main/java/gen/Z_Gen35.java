
  package gen;
  public class Z_Gen35 {
  		@com.google.inject.Inject
  		public Z_Gen35(Z_Gen36 z_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  