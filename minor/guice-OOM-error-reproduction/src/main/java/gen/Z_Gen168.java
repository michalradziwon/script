
  package gen;
  public class Z_Gen168 {
  		@com.google.inject.Inject
  		public Z_Gen168(Z_Gen169 z_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  