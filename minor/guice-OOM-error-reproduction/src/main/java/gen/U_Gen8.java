
  package gen;
  public class U_Gen8 {
  		@com.google.inject.Inject
  		public U_Gen8(U_Gen9 u_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  