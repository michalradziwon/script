
  package gen;
  public class Z_Gen176 {
  		@com.google.inject.Inject
  		public Z_Gen176(Z_Gen177 z_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  