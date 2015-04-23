
  package gen;
  public class Z_Gen138 {
  		@com.google.inject.Inject
  		public Z_Gen138(Z_Gen139 z_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  