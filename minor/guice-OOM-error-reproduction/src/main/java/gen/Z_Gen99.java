
  package gen;
  public class Z_Gen99 {
  		@com.google.inject.Inject
  		public Z_Gen99(Z_Gen100 z_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  