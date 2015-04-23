
  package gen;
  public class L_Gen157 {
  		@com.google.inject.Inject
  		public L_Gen157(L_Gen158 l_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  