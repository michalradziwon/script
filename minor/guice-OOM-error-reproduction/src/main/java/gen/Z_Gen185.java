
  package gen;
  public class Z_Gen185 {
  		@com.google.inject.Inject
  		public Z_Gen185(Z_Gen186 z_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  