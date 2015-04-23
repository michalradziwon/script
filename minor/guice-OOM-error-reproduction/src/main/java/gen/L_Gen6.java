
  package gen;
  public class L_Gen6 {
  		@com.google.inject.Inject
  		public L_Gen6(L_Gen7 l_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  