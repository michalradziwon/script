
  package gen;
  public class E_Gen124 {
  		@com.google.inject.Inject
  		public E_Gen124(E_Gen125 e_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  