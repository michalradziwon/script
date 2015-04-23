
  package gen;
  public class E_Gen93 {
  		@com.google.inject.Inject
  		public E_Gen93(E_Gen94 e_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  