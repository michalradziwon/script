
  package gen;
  public class Z_Gen111 {
  		@com.google.inject.Inject
  		public Z_Gen111(Z_Gen112 z_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  