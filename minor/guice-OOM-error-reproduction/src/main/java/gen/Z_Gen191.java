
  package gen;
  public class Z_Gen191 {
  		@com.google.inject.Inject
  		public Z_Gen191(Z_Gen192 z_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  