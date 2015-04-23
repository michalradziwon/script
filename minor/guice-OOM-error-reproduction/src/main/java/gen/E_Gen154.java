
  package gen;
  public class E_Gen154 {
  		@com.google.inject.Inject
  		public E_Gen154(E_Gen155 e_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  