
  package gen;
  public class L_Gen40 {
  		@com.google.inject.Inject
  		public L_Gen40(L_Gen41 l_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  