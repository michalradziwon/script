
  package gen;
  public class Z_Gen108 {
  		@com.google.inject.Inject
  		public Z_Gen108(Z_Gen109 z_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  