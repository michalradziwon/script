
  package gen;
  public class U_Gen26 {
  		@com.google.inject.Inject
  		public U_Gen26(U_Gen27 u_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  