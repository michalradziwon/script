
  package gen;
  public class Z_Gen161 {
  		@com.google.inject.Inject
  		public Z_Gen161(Z_Gen162 z_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  