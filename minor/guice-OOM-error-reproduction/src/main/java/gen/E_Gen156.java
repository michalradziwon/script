
  package gen;
  public class E_Gen156 {
  		@com.google.inject.Inject
  		public E_Gen156(E_Gen157 e_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  