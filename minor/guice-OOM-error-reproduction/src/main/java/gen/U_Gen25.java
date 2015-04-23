
  package gen;
  public class U_Gen25 {
  		@com.google.inject.Inject
  		public U_Gen25(U_Gen26 u_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  