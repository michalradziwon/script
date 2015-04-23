
  package gen;
  public class L_Gen20 {
  		@com.google.inject.Inject
  		public L_Gen20(L_Gen21 l_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  