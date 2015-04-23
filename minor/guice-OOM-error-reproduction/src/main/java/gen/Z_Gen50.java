
  package gen;
  public class Z_Gen50 {
  		@com.google.inject.Inject
  		public Z_Gen50(Z_Gen51 z_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  