
  package gen;
  public class Z_Gen57 {
  		@com.google.inject.Inject
  		public Z_Gen57(Z_Gen58 z_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  