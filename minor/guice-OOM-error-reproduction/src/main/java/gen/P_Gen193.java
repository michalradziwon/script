
  package gen;
  public class P_Gen193 {
  		@com.google.inject.Inject
  		public P_Gen193(P_Gen194 p_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  