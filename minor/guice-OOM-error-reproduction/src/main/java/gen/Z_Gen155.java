
  package gen;
  public class Z_Gen155 {
  		@com.google.inject.Inject
  		public Z_Gen155(Z_Gen156 z_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  