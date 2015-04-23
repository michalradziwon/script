
  package gen;
  public class E_Gen113 {
  		@com.google.inject.Inject
  		public E_Gen113(E_Gen114 e_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  