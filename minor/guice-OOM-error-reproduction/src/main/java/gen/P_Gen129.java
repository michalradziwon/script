
  package gen;
  public class P_Gen129 {
  		@com.google.inject.Inject
  		public P_Gen129(P_Gen130 p_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  