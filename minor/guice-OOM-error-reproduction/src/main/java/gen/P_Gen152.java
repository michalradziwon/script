
  package gen;
  public class P_Gen152 {
  		@com.google.inject.Inject
  		public P_Gen152(P_Gen153 p_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  