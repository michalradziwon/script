
  package gen;
  public class L_Gen102 {
  		@com.google.inject.Inject
  		public L_Gen102(L_Gen103 l_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  