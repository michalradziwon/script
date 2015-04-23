
  package gen;
  public class L_Gen143 {
  		@com.google.inject.Inject
  		public L_Gen143(L_Gen144 l_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  