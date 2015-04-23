
  package gen;
  public class L_Gen127 {
  		@com.google.inject.Inject
  		public L_Gen127(L_Gen128 l_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  