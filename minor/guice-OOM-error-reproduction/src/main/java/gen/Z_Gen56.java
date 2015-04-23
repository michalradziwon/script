
  package gen;
  public class Z_Gen56 {
  		@com.google.inject.Inject
  		public Z_Gen56(Z_Gen57 z_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  