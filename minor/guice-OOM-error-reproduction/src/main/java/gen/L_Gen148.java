
  package gen;
  public class L_Gen148 {
  		@com.google.inject.Inject
  		public L_Gen148(L_Gen149 l_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  