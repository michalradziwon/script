
  package gen;
  public class U_Gen137 {
  		@com.google.inject.Inject
  		public U_Gen137(U_Gen138 u_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  