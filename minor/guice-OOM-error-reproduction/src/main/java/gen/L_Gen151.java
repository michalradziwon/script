
  package gen;
  public class L_Gen151 {
  		@com.google.inject.Inject
  		public L_Gen151(L_Gen152 l_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  