
  package gen;
  public class Z_Gen172 {
  		@com.google.inject.Inject
  		public Z_Gen172(Z_Gen173 z_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  