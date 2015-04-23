
  package gen;
  public class L_Gen171 {
  		@com.google.inject.Inject
  		public L_Gen171(L_Gen172 l_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  