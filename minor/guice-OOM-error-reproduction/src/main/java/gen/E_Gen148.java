
  package gen;
  public class E_Gen148 {
  		@com.google.inject.Inject
  		public E_Gen148(E_Gen149 e_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  