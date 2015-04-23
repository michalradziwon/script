
  package gen;
  public class L_Gen71 {
  		@com.google.inject.Inject
  		public L_Gen71(L_Gen72 l_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  