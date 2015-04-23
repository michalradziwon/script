
  package gen;
  public class Z_Gen96 {
  		@com.google.inject.Inject
  		public Z_Gen96(Z_Gen97 z_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  