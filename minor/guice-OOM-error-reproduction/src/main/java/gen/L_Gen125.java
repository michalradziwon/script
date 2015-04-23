
  package gen;
  public class L_Gen125 {
  		@com.google.inject.Inject
  		public L_Gen125(L_Gen126 l_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  