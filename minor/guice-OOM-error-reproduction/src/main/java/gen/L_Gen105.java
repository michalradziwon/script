
  package gen;
  public class L_Gen105 {
  		@com.google.inject.Inject
  		public L_Gen105(L_Gen106 l_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  