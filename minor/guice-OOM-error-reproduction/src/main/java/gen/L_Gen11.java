
  package gen;
  public class L_Gen11 {
  		@com.google.inject.Inject
  		public L_Gen11(L_Gen12 l_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  