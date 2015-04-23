
  package gen;
  public class Z_Gen165 {
  		@com.google.inject.Inject
  		public Z_Gen165(Z_Gen166 z_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  