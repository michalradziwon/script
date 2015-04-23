
  package gen;
  public class Z_Gen32 {
  		@com.google.inject.Inject
  		public Z_Gen32(Z_Gen33 z_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  