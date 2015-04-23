
  package gen;
  public class L_Gen147 {
  		@com.google.inject.Inject
  		public L_Gen147(L_Gen148 l_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  