
  package gen;
  public class L_Gen57 {
  		@com.google.inject.Inject
  		public L_Gen57(L_Gen58 l_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  