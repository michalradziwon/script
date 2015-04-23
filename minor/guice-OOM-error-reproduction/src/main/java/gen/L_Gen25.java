
  package gen;
  public class L_Gen25 {
  		@com.google.inject.Inject
  		public L_Gen25(L_Gen26 l_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  