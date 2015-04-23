
  package gen;
  public class E_Gen85 {
  		@com.google.inject.Inject
  		public E_Gen85(E_Gen86 e_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  