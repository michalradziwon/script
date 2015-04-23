
  package gen;
  public class Z_Gen134 {
  		@com.google.inject.Inject
  		public Z_Gen134(Z_Gen135 z_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  