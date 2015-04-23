
  package gen;
  public class Z_Gen47 {
  		@com.google.inject.Inject
  		public Z_Gen47(Z_Gen48 z_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  