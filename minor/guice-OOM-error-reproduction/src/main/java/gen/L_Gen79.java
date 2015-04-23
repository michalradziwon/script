
  package gen;
  public class L_Gen79 {
  		@com.google.inject.Inject
  		public L_Gen79(L_Gen80 l_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  