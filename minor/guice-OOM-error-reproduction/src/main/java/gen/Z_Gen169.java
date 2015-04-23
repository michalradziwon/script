
  package gen;
  public class Z_Gen169 {
  		@com.google.inject.Inject
  		public Z_Gen169(Z_Gen170 z_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  