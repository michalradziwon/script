
  package gen;
  public class L_Gen56 {
  		@com.google.inject.Inject
  		public L_Gen56(L_Gen57 l_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  