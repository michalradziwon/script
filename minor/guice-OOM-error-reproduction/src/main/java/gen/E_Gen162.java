
  package gen;
  public class E_Gen162 {
  		@com.google.inject.Inject
  		public E_Gen162(E_Gen163 e_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  