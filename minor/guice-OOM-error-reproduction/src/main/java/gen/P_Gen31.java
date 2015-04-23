
  package gen;
  public class P_Gen31 {
  		@com.google.inject.Inject
  		public P_Gen31(P_Gen32 p_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  