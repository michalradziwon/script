
  package gen;
  public class Z_Gen157 {
  		@com.google.inject.Inject
  		public Z_Gen157(Z_Gen158 z_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  