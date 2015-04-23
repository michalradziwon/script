
  package gen;
  public class L_Gen152 {
  		@com.google.inject.Inject
  		public L_Gen152(L_Gen153 l_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  