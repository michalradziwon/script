
  package gen;
  public class L_Gen108 {
  		@com.google.inject.Inject
  		public L_Gen108(L_Gen109 l_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  