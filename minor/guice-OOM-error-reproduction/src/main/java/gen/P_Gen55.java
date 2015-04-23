
  package gen;
  public class P_Gen55 {
  		@com.google.inject.Inject
  		public P_Gen55(P_Gen56 p_gen56){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen56 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  