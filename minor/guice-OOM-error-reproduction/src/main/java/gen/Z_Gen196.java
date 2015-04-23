
  package gen;
  public class Z_Gen196 {
  		@com.google.inject.Inject
  		public Z_Gen196(Z_Gen197 z_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  