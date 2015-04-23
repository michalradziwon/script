
  package gen;
  public class Z_Gen144 {
  		@com.google.inject.Inject
  		public Z_Gen144(Z_Gen145 z_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  