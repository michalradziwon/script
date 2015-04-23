
  package gen;
  public class L_Gen146 {
  		@com.google.inject.Inject
  		public L_Gen146(L_Gen147 l_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  