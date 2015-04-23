
  package gen;
  public class E_Gen118 {
  		@com.google.inject.Inject
  		public E_Gen118(E_Gen119 e_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  