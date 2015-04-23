
  package gen;
  public class U_Gen58 {
  		@com.google.inject.Inject
  		public U_Gen58(U_Gen59 u_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  