
  package gen;
  public class L_Gen195 {
  		@com.google.inject.Inject
  		public L_Gen195(L_Gen196 l_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  