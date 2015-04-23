
  package gen;
  public class L_Gen19 {
  		@com.google.inject.Inject
  		public L_Gen19(L_Gen20 l_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  