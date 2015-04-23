
  package gen;
  public class P_Gen15 {
  		@com.google.inject.Inject
  		public P_Gen15(P_Gen16 p_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  