
  package gen;
  public class L_Gen134 {
  		@com.google.inject.Inject
  		public L_Gen134(L_Gen135 l_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  