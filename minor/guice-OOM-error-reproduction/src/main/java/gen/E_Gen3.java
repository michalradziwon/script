
  package gen;
  public class E_Gen3 {
  		@com.google.inject.Inject
  		public E_Gen3(E_Gen4 e_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  