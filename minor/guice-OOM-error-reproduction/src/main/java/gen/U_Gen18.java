
  package gen;
  public class U_Gen18 {
  		@com.google.inject.Inject
  		public U_Gen18(U_Gen19 u_gen19){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen19 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  