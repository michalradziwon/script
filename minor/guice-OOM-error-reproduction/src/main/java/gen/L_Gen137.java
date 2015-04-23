
  package gen;
  public class L_Gen137 {
  		@com.google.inject.Inject
  		public L_Gen137(L_Gen138 l_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  