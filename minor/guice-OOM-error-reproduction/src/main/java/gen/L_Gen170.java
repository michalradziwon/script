
  package gen;
  public class L_Gen170 {
  		@com.google.inject.Inject
  		public L_Gen170(L_Gen171 l_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  