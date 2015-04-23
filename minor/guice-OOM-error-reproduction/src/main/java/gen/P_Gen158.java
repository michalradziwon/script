
  package gen;
  public class P_Gen158 {
  		@com.google.inject.Inject
  		public P_Gen158(P_Gen159 p_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  