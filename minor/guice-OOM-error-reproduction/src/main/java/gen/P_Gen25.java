
  package gen;
  public class P_Gen25 {
  		@com.google.inject.Inject
  		public P_Gen25(P_Gen26 p_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  