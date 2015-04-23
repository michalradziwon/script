
  package gen;
  public class Z_Gen112 {
  		@com.google.inject.Inject
  		public Z_Gen112(Z_Gen113 z_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  