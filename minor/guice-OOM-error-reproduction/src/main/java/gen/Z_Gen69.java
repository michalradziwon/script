
  package gen;
  public class Z_Gen69 {
  		@com.google.inject.Inject
  		public Z_Gen69(Z_Gen70 z_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  