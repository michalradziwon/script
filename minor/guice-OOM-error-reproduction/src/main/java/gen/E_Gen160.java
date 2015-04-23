
  package gen;
  public class E_Gen160 {
  		@com.google.inject.Inject
  		public E_Gen160(E_Gen161 e_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  