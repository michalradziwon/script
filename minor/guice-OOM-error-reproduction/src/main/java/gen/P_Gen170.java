
  package gen;
  public class P_Gen170 {
  		@com.google.inject.Inject
  		public P_Gen170(P_Gen171 p_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  