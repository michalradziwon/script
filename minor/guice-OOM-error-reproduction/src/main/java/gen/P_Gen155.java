
  package gen;
  public class P_Gen155 {
  		@com.google.inject.Inject
  		public P_Gen155(P_Gen156 p_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  