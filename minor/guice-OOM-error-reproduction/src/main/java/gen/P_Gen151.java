
  package gen;
  public class P_Gen151 {
  		@com.google.inject.Inject
  		public P_Gen151(P_Gen152 p_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  