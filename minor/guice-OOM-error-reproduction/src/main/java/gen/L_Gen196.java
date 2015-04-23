
  package gen;
  public class L_Gen196 {
  		@com.google.inject.Inject
  		public L_Gen196(L_Gen197 l_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  