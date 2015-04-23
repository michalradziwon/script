
  package gen;
  public class P_Gen180 {
  		@com.google.inject.Inject
  		public P_Gen180(P_Gen181 p_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  