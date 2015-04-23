
  package gen;
  public class Z_Gen198 {
  		@com.google.inject.Inject
  		public Z_Gen198(Z_Gen199 z_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  