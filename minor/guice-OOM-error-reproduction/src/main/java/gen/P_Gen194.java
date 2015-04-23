
  package gen;
  public class P_Gen194 {
  		@com.google.inject.Inject
  		public P_Gen194(P_Gen195 p_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  