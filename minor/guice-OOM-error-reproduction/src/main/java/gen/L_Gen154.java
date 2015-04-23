
  package gen;
  public class L_Gen154 {
  		@com.google.inject.Inject
  		public L_Gen154(L_Gen155 l_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  