
  package gen;
  public class L_Gen155 {
  		@com.google.inject.Inject
  		public L_Gen155(L_Gen156 l_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  