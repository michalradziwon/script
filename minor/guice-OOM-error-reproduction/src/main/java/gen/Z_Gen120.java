
  package gen;
  public class Z_Gen120 {
  		@com.google.inject.Inject
  		public Z_Gen120(Z_Gen121 z_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  