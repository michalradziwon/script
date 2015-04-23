
  package gen;
  public class U_Gen157 {
  		@com.google.inject.Inject
  		public U_Gen157(U_Gen158 u_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  