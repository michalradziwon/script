
  package gen;
  public class Z_Gen79 {
  		@com.google.inject.Inject
  		public Z_Gen79(Z_Gen80 z_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  